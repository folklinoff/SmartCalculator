package com.example.smartcalculator.Solution.Solver;

import com.example.smartcalculator.Solution.Coefficients;

public class ConstantEquationSolver extends Solver
{

    public static Answer getAnswer(Coefficients coefficients)
    {
        return new Answer("Equation doesn't have any solutions");
    }
}
