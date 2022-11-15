package com.example.smartcalculator.Solution.Solver;

import com.example.smartcalculator.Solution.Coefficients;

import java.util.ArrayList;

public class QuadraticEquationSolver extends Solver
{

    public static Answer getAnswer(Coefficients coefficients)
    {
        Double a = getCoefficientAt(coefficients,2);
        Double b = getCoefficientAt(coefficients,1);
        Double c = getCoefficientAt(coefficients,0);
        double D = b * b - 4 * a * c;
        if (D < 0)
        {
            return new Answer("Equation doesn't have any solutions");
        }
        ArrayList<Double> roots = new ArrayList<>();
        if (D == 0)
        {
            roots.add((-1.0 * b) / (2 * a));
        }
        else
        {
            roots.add((-1.0*b+Math.sqrt(D))/(2 * a));
            roots.add((-1.0*b-Math.sqrt(D))/(2 * a));
        }
        return new Answer(roots);
    }
}
