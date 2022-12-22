package com.example.smartcalculator.Solution;

public class Converter {
    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }
    public static double parseToDouble(String s) throws NotANumberException
    {
        double answer = 0.0;
        int neg_power = 1;
        if (!isNumeric(s))
        {
            throw new NotANumberException(s);
        }
        boolean pastThePoint = false;
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == '.')
            {
                pastThePoint = true;
            }
            else {
                if (pastThePoint)
                {
                    answer += Math.pow(s.charAt(i) - '0', -neg_power);
                    neg_power++;
                }
                else {
                    answer = answer*10+s.charAt(i) - '0';
                }
            }
        }
        return answer;
    }

    public static Coefficients convertToCoefficient(String operand) {
        Coefficients result = new Coefficients();
        try {
            result.put(0, parseToDouble(operand));
        } catch (NotANumberException exception) {
            result.put(1, 1.0);
        }
        return result;
    }

    public static Coefficients convertToCoefficients(String expression) {
        if (expression.length() == 0) {
            return new Coefficients();
        }
        if (ExpressionTransformer.isEnclosedInBraces(expression)) {
            expression = ExpressionTransformer.removeOuterBraces(expression);
        }
        if (ExpressionTransformer.isOperand(expression)) {
            return convertToCoefficient(expression);
        }
        return convertAdditionToCoefficients(expression);
    }

    public static Coefficients convertAdditionToCoefficients(String expression) {
        int openingBraces = 0;
        for (int i = 0; i < expression.length(); ++i) {
            if (expression.charAt(i) == '=') {
                Coefficients leftOperand = convertToCoefficients(expression.substring(0, i));
                Coefficients rightOperand = convertToCoefficients(expression.substring(i + 1));
                return PartCalculator.subtractTwoTrees(leftOperand, rightOperand);
            }
            if ((expression.charAt(i) == '+' || expression.charAt(i) == '-') && openingBraces == 0) {
                Coefficients leftOperand = convertToCoefficients(expression.substring(0, i));
                Coefficients rightOperand = convertToCoefficients(expression.substring(i + 1));
                if (expression.charAt(i) == '+') {
                    return PartCalculator.addTwoTrees(leftOperand, rightOperand);
                } else if (expression.charAt(i) == '-') {
                    return PartCalculator.subtractTwoTrees(leftOperand, rightOperand);
                }
            } else {
                if (expression.charAt(i) == '(') {
                    openingBraces++;
                } else if (expression.charAt(i) == ')') {
                    openingBraces--;
                }
            }
        }

        return convertMultiplicationToCoefficients(expression);
    }

    public static Coefficients convertMultiplicationToCoefficients(String expression) {
        int openingBraces = 0;
        Coefficients result = new Coefficients();
        for (int i = 0; i < expression.length(); ++i) {
            if (expression.charAt(i) == '*' && openingBraces == 0) {
                Coefficients leftOperand = convertToCoefficients(expression.substring(0, i));
                Coefficients rightOperand = convertToCoefficients(expression.substring(i + 1));

                return PartCalculator.multiplyTwoTrees(leftOperand, rightOperand);
            } else {
                if (expression.charAt(i) == '(') {
                    openingBraces++;
                } else if (expression.charAt(i) == ')') {
                    openingBraces--;
                }
            }
        }
        return result;
    }
}
