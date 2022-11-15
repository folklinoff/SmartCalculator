package com.example.smartcalculator.Solution.Solver;

import com.example.smartcalculator.Solution.Coefficients;

import java.util.Map;

public abstract class Solver {
    public static Double getCoefficientAt(Coefficients coefficients, int power)
    {
        try
        {
            return coefficients.get(power);
        }
        catch (Exception e)
        {
            return 0.0d;
        }
    }

    public static int getMaxPower(Coefficients coefficients)
    {
        int max = 0;
        for (Map.Entry<Integer, Double> entry : coefficients.entrySet())
        {
            return entry.getKey();
        }
        return max;
    }

    public static EquationType getEquationType (Coefficients coefficients)
    {
        int highestPower = getMaxPower(coefficients);
        return EquationType.typeOf(Math.min(getMaxPower(coefficients), 3));
    }

    public static Answer getAnswer(Coefficients coefficients)
    {
        EquationType equationType = getEquationType(coefficients);
        switch (getEquationType(coefficients)) {
            case value:
                return ConstantEquationSolver.getAnswer(coefficients);
            case linearEquation:
                return LinearEquationSolver.getAnswer(coefficients);
            case quadraticEquation:
                return QuadraticEquationSolver.getAnswer(coefficients);
            case higherOrderEquation:
                return HigherOrderEquationSolver.getAnswer(coefficients);
        }
        return new Answer("Cannot solve yet:(");
    }
}
