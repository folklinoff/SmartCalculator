package com.example.smartcalculator.Solution.Solver;

import java.util.TreeMap;

public enum EquationType
{
    value(0),
    linearEquation(1),
    quadraticEquation(2),
    higherOrderEquation(3);

    private final int type;
    private static final TreeMap<Integer, EquationType> map = new TreeMap<>();
    static {
        for (EquationType equationType : EquationType.values())
        {
            map.put(equationType.type, equationType);
        }
    }
    EquationType(int type)
    {
        this.type = type;
    }

    public int getType()
    {
        return type;
    }

    public static EquationType typeOf(int equationType)
    {
        return map.get(equationType);
    }
}
