package com.example.smartcalculator.Solution;

import org.jetbrains.annotations.NotNull;

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Coefficients extends TreeMap<Integer, Double> {
    Coefficients() {
        super();
    }

    Coefficients(Coefficients c1) {
        super(c1);
    }

    @Override
    public Double remove(Object key) {
        return super.remove(key);
    }

    @Override
    public Double put(Integer key, Double value) {
        return super.put(key, value);
    }

    @Override
    public Double get(Object key) {
        return super.get(key);
    }

    @Override
    public boolean containsKey(Object key) {
        return super.containsKey(key);
    }

    @NotNull
    public Set<Entry<Integer, Double>> entrySet() {
        TreeSet<Entry<Integer, Double>> result = new TreeSet<>((o1, o2) -> {
            if (o1.getKey() > o2.getKey())
                return -1;
            if (o1.getKey().equals(o2.getKey()))
                return 0;
            return 1;
        });
        result.addAll(super.entrySet());
        return result;
    }
}
