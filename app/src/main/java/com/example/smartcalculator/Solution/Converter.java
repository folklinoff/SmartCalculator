package com.example.smartcalculator.Solution;

import java.util.Map;

public class Converter {
    public static Coefficients convertToCoefficients(String operand)
    {
        Coefficients result = new Coefficients();
        try
        {
            result.put(0, Double.parseDouble(operand));
        }
        catch (Exception e)
        {
            result.put(1, 1.0);
        }
        return result;
    }

    public static StringBuilder entryToAddend(Map.Entry<Integer, Double> entry)
    {
        StringBuilder result = new StringBuilder();
        if (entry.getValue() < 0)
        {
            result.append("-");
        }
        if (Math.abs(entry.getValue()) != 1)
        {
            result.append(Math.abs(entry.getValue()));
        }
        if (entry.getKey() >= 1)
        {
            result.append("x");
        }
        if (entry.getKey() >= 2)
        {
            result.append("^").append(entry.getKey());
        }
        return result;
    }

    public static String convertCoefficientsToEquation(Coefficients coefficients)
    {
        boolean first = true;
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Integer, Double> entry : coefficients.entrySet())
        {
            if (!first)
            {
                if (entry.getValue() > 0)
                {
                    result.append("+");
                }
            }
            result.append(entryToAddend(entry));
            first = false;
        }
        result.append("=0");
        return result.toString();
    }
}
