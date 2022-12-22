package com.example.smartcalculator.Solution;


import java.util.Map;

public class PartCalculator {
    public static Coefficients subtractTwoTrees(Coefficients map1, Coefficients map2) {
        Coefficients result = new Coefficients(map1);
        for (Map.Entry<Integer, Double> entry : map2.entrySet()) {
            Double coefficient = result.get(entry.getKey());
            if (coefficient != null) {
                result.put(entry.getKey(), coefficient - entry.getValue());
            } else {
                result.put(entry.getKey(), -entry.getValue());
            }
        }
        return result;
    }

    //@Contract(pure = true)
    public static Coefficients addTwoTrees(Coefficients map1, Coefficients map2) {
        Coefficients result = new Coefficients(map1);
        for (Map.Entry<Integer, Double> entry : map2.entrySet()) {
            Double coefficient = result.get(entry.getKey());
            if (coefficient != null)
                result.put(entry.getKey(), coefficient + entry.getValue());
            else {
                result.put(entry.getKey(), entry.getValue());
            }
        }
        return result;
    }

    //@Contract(pure = true)
    public static Coefficients multiplyTwoTrees(Coefficients map1, Coefficients map2) {
        Coefficients result = new Coefficients();
        for (Map.Entry<Integer, Double> entry1 : map1.entrySet()) {
            for (Map.Entry<Integer, Double> entry2 : map2.entrySet()) {
                int power = entry1.getKey() + entry2.getKey();
                Double coefficient = result.get(power);
                if (coefficient != null) {
                    result.put(power, coefficient + entry2.getValue() * entry1.getValue());
                } else {
                    result.put(power, entry2.getValue() * entry1.getValue());
                }
            }
        }
        return result;
    }
}
