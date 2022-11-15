package com.example.smartcalculator.Solution.Solver;


import java.util.ArrayList;

public class Answer {
    String answer;

    Answer(String answer)
    {
        this.answer = answer;
    }

    Answer(ArrayList<Double> roots)
    {
        if (roots.size() == 1)
        {
            answer = "x = " + roots.get(0);
        }
        else
        {
            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < roots.size(); ++i) {
                ans.append("x").append(i + 1).append(" = ").append(roots.get(i).toString());
                if (i == roots.size() - 1) {
                    ans.append(".");
                } else {
                    ans.append("; ");
                }
            }
            answer = ans.toString();
        }
    }

    @Override
    public String toString() {
        return answer;
    }
}
