package com.example.smartcalculator.Solution;


import androidx.appcompat.app.AppCompatActivity;
import com.example.smartcalculator.Solution.Solver.Solver;

import java.util.Random;

public class Main extends AppCompatActivity {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(test(generateTest()));
        }
    }

    public static String generateCoefficient()
    {
        String signs = "+-*";
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            double nextD = random.nextDouble() - random.nextDouble() / 2;
            if (nextD < 0)
            {
                sb.append('(').append(nextD).append(')');
            }
            else {
                sb.append(nextD);
            }
            if (i != 2)
            {
                sb.append(signs.charAt(random.nextInt(3)));
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static String generateTest() {
        StringBuilder sb = new StringBuilder();
        for (int power = 0; power < 3; power++) {
            sb.append(generateCoefficient());
            for (int i = 0; i < power; i++)
                sb.append('*').append('x');
            if (power != 2)
                sb.append('+');
        }
        return sb.toString();
    }

    public static String test(String expression) {
        expression = ExpressionTransformer.deleteSpaces(expression);
        expression = ExpressionTransformer.addMultiplicationOperators(expression);
        expression = ExpressionTransformer.replaceMinuses(expression);
        Coefficients coefficients = Converter.convertToCoefficients(expression);
        CoefficientsTransformer.deleteZeros(coefficients);

        return Solver.getAnswer(coefficients).toString();
    }

}