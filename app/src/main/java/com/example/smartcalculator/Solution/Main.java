package com.example.smartcalculator.Solution;

import com.example.smartcalculator.Solution.Solver.Solver;

public class Main {
    public static void main(String[] args) {
        String[] expressions = {
                "7 = 0",
                "-8*(9)+x + x * x + x * x * x = 0",
                "-8*9+x + x * x + x * x * x = 0",
                "x*x = 0",
                "(x - 5) (x + (6 - x) * (x - 5)) = 0",
                "x + x * x - 2=0"
        };
        for (String expression : expressions)
        {
            System.out.println(test(expression));
        }
    }

    public static String test(String expression) {
        expression = ExpressionTransformer.deleteSpaces(expression);
        expression = ExpressionTransformer.addMultiplicationOperators(expression);
        expression = ExpressionTransformer.replaceMinuses(expression);
        Coefficients coefficients = Decomposer.decompose(expression);
        CoefficientsTransformer.deleteZeros(coefficients);

        return Solver.getAnswer(coefficients).toString();
    }

}