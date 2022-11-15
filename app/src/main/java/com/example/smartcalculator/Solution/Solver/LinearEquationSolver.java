package com.example.smartcalculator.Solution.Solver;

import com.example.smartcalculator.Solution.Coefficients;

import java.util.ArrayList;

public class LinearEquationSolver extends Solver {
    public static Answer getAnswer(Coefficients coefficients)
    {
        ArrayList<Double> roots = new ArrayList<>();
        Double a = getCoefficientAt(coefficients,1);
        Double b = getCoefficientAt(coefficients,0);
        roots.add(-1.0*b/a);
        return new Answer(roots);
    }
}
