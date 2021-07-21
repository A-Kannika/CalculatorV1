/**
 * Create by Kannika Armstrong
 * TCSS305(Winter 2021): January 16, 2021
 * Programming assignment: Develop Multi-Function Calculator Version 1
 * Numerical Calculation
 * Professor. Kivanç A. Dincer, Ph.D.
 * The University of Washington Tacoma
 */

public class NumericCalculation extends NumericCalculator {
    public static void main(String[] args) {
        binaryCalculator("10101010", "11001100", "+");
        binaryCalculator("-10101010", "11001100", "+");
        binaryCalculator("10101010", "11001100", "-");
        binaryCalculator("10101010", "1100230", "+");
        binaryCalculator("1rty", "11001100", "+");
        binaryCalculator("10101010", "11001100", "*");
        binaryCalculator("10101010", "11001100", "/");
        hexCalculator("-DAD", "DAD", "+");
        hexCalculator("0", "-DAD", "-");
        hexCalculator("ABC", "-DAD", "*");
        hexCalculator("ABC", "-DAD", "/");

    }

    public static long addValues(long d1, long d2) {
        return d1 + d2;
    }

    public static long subtractValues(long d1, long d2) {
        return d1 - d2;
    }

    public static long multiplyValues(long d1, long d2) {
        return d1 * d2;
    }

    public static long divideValues(long d1, long d2) {
        if (d2 == 0) {
            System.out.println("The second number is 0, divided by 0 is undefined");
            return (long) Math.sqrt(-1);
        } else {
            return d1 / d2;
        }
    }

    public static long divideRemainderValues(long d1, long d2) {
        if (d2 == 0) {
            return (long) Math.sqrt(-1);
        } else if (d1 % d2 == 0) {
            return 0;
        } else {
            return d1 % d2;
        }
    }

    public static String binaryAdd(String input1, String input2) {
        String result = "";
        String number1 = ConvertNumeric.calcConvertBin2Dec(input1);
        String number2 = ConvertNumeric.calcConvertBin2Dec(input2);
        if (number1.equals("-1") || number2.equals("-1")) {
            result = "-1";
        } else {
            long dec1 = Integer.parseInt(number1);
            long dec2 = Integer.parseInt(number2);
            String add = Long.toString(addValues(dec1, dec2));
            result = ConvertNumeric.calcConvertDec2Bin(add);
        }
        return result;
    }

    public static String binarySubtract(String input1, String input2) {
        String result = "";
        String number1 = ConvertNumeric.calcConvertBin2Dec(input1);
        String number2 = ConvertNumeric.calcConvertBin2Dec(input2);
        if (number1.equals("-1") || number2.equals("-1")) {
            result = "-1";
        } else {
            long dec1 = Integer.parseInt(number1);
            long dec2 = Integer.parseInt(number2);
            String sub = Long.toString(subtractValues(dec1, dec2));
            if (sub.startsWith("-")) {
                result = "-" + ConvertNumeric.calcConvertDec2Bin(sub);
            } else {
                result = ConvertNumeric.calcConvertDec2Bin(sub);
            }
        }
        return result;
    }

    public static String binaryMultiply(String input1, String input2) {
        String result = "";
        String number1 = ConvertNumeric.calcConvertBin2Dec(input1);
        String number2 = ConvertNumeric.calcConvertBin2Dec(input2);
        if (number1.equals("-1") || number2.equals("-1")) {
            result = "-1";
        } else {
            long dec1 = Integer.parseInt(number1);
            long dec2 = Integer.parseInt(number2);
            String mul = Long.toString(multiplyValues(dec1, dec2));
            result = ConvertNumeric.calcConvertDec2Bin(mul);
        }
        return result;
    }

    public static String binaryDivide(String input1, String input2) {
        String result = "";
        String number1 = ConvertNumeric.calcConvertBin2Dec(input1);
        String number2 = ConvertNumeric.calcConvertBin2Dec(input2);
        if (number1.equals("-1") || number2.equals("-1")) {
            result = "-1";
        } else {
            long dec1 = Integer.parseInt(number1);
            long dec2 = Integer.parseInt(number2);
            String div = Long.toString(divideValues(dec1, dec2));
            result = ConvertNumeric.calcConvertDec2Bin(div);
        }
        return result;
    }

    public static String remainderBinaryDivide(String input1, String input2) {
        String result = "";
        String number1 = ConvertNumeric.calcConvertBin2Dec(input1);
        String number2 = ConvertNumeric.calcConvertBin2Dec(input2);
        if (number1.equals("-1") || number2.equals("-1")) {
            result = "-1";
        } else {
            long dec1 = Integer.parseInt(number1);
            long dec2 = Integer.parseInt(number2);
            String remainder = Long.toString(divideRemainderValues(dec1, dec2));
            if (remainder.equals("")) {
                result = "";
            } else {
                result = ConvertNumeric.calcConvertDec2Bin(remainder);
            }
        }
        return result;
    }

    public static void binaryCalculator(String input1, String input2, String operator) {
        String number1 = ConvertNumeric.calcConvertBin2Dec(input1);
        String number2 = ConvertNumeric.calcConvertBin2Dec(input2);
        if (number1.equals("-1") || number2.equals("-1")) {
            System.out.println(ConsoleColors.RED_BOLD + "\tThe number need to contain 0 and 1 only." + ConsoleColors.RESET);
        } else {
            long dec1 = Integer.parseInt(number1);
            long dec2 = Integer.parseInt(number2);
            switch (operator) {
                case "+":
                    String add = Long.toString(addValues(dec1, dec2));
                    String binAdd = ConvertNumeric.calcConvertDec2Bin(add);
                    System.out.println(ConsoleColors.RED_BOLD + "\tBinary value: \n\t" + ConsoleColors.RESET
                            + input1 + " + " + input2
                            + ConsoleColors.GREEN_BOLD + "\n\t = " + binAdd + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED_BOLD + "\tDecimal value: \n\t" + ConsoleColors.RESET
                            + dec1 + " + " + dec2
                            + ConsoleColors.GREEN_BOLD +"\n\t = " + add + ConsoleColors.RESET);
                    break;
                case "-":
                    String sub = Long.toString(subtractValues(dec1, dec2));
                    String binSub = ConvertNumeric.calcConvertDec2Bin(sub);
                    if (sub.startsWith("-")) {
                        System.out.println(ConsoleColors.RED_BOLD + "\tBinary value: \n\t" + ConsoleColors.RESET
                                + input1 + " - " + input2
                                + ConsoleColors.GREEN_BOLD + "\n\t = -" + binSub + ConsoleColors.RESET);
                    } else {
                        System.out.println(ConsoleColors.RED_BOLD + "\tBinary value: \n\t" + ConsoleColors.RESET
                                + input1 + " - " + input2
                                + ConsoleColors.GREEN_BOLD + "\n\t = " + binSub + ConsoleColors.RESET);
                    }
                    System.out.println(ConsoleColors.RED_BOLD + "\tDecimal value: \n\t" + ConsoleColors.RESET
                            + dec1 + " - " + dec2
                            + ConsoleColors.GREEN_BOLD + "\n\t = " + sub + ConsoleColors.RESET);
                    break;
                case "*":
                    String mul = Long.toString(multiplyValues(dec1, dec2));
                    String binMul = ConvertNumeric.calcConvertDec2Bin(mul);
                    System.out.println(ConsoleColors.RED_BOLD + "\tBinary value: \n\t" + ConsoleColors.RESET
                            + input1 + " * " + input2
                            + ConsoleColors.GREEN_BOLD + "\n\t = " + binMul + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED_BOLD + "\tDecimal value: \n\t" + ConsoleColors.RESET
                            + dec1 + " * " + dec2
                            + ConsoleColors.GREEN_BOLD +"\n\t = " + mul + ConsoleColors.RESET);
                    break;
                case "/":
                    String remainder = Long.toString(divideRemainderValues(dec1, dec2));
                    String remainderDiv = ConvertNumeric.calcConvertDec2Bin(remainder);
                    String div = Long.toString(divideValues(dec1, dec2));
                    String binDiv = ConvertNumeric.calcConvertDec2Bin(div);
                    if (remainder.equals("")) {
                        System.out.println(ConsoleColors.RED_BOLD + "\tBinary value: \n\t" + ConsoleColors.RESET
                                + input1 + " / " + input2
                                + ConsoleColors.GREEN_BOLD + "\n\t = " + binDiv + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED_BOLD + "\tDecimal value: \n\t" + ConsoleColors.RESET
                                + dec1 + " / " + dec2
                                + ConsoleColors.GREEN_BOLD + "\n\t = " + div + ConsoleColors.RESET);
                    } else {
                        System.out.println(ConsoleColors.RED_BOLD + "\tBinary value: \n\t" + ConsoleColors.RESET
                                + input1 + " / " + input2
                                + ConsoleColors.GREEN_BOLD + "\n\t = " + binDiv + " Remainder : " + remainderDiv + ConsoleColors.RESET) ;
                        System.out.println(ConsoleColors.RED_BOLD + "\tDecimal value: \n\t" + ConsoleColors.RESET
                                + dec1 + " / " + dec2
                                + ConsoleColors.GREEN_BOLD + "\n\t = " + div + " Remainder : " + remainder + ConsoleColors.RESET);
                    }
                    break;
                default:
                    System.out.println(ConsoleColors.RED_BOLD + "\tInvalid Operator!" + ConsoleColors.RESET);
                    break;
            }
        }
    }

    public static String hexAdd(String input1, String input2) {
        String result = "";
        String number1 = ConvertNumeric.calcConvertHex2Dec(input1);
        String number2 = ConvertNumeric.calcConvertHex2Dec(input2);
        if (number1.equals("Z") || number2.equals("Z")) {
            result = "";
        } else {
            long dec1 = Integer.parseInt(number1);
            long dec2 = Integer.parseInt(number2);
            if (input1.startsWith("-")) {
                dec1 *= -1;
            }
            if (input2.startsWith("-")) {
                dec2 *= -1;
            }
            String add = Long.toString(addValues(dec1, dec2));
            result = ConvertNumeric.calcConvertDec2Hex(add);
        }
        return result;
    }

    public static String hexSubtract(String input1, String input2) {
        String result = "";
        String number1 = ConvertNumeric.calcConvertHex2Dec(input1);
        String number2 = ConvertNumeric.calcConvertHex2Dec(input2);
        if (number1.equals("Z") || number2.equals("Z")) {
            result = "";
        } else {
            long dec1 = Integer.parseInt(number1);
            long dec2 = Integer.parseInt(number2);
            if (input1.startsWith("-")) {
                dec1 *= -1;
            }
            if (input2.startsWith("-")) {
                dec2 *= -1;
            }
            String sub = Long.toString(subtractValues(dec1, dec2));
            result = ConvertNumeric.calcConvertDec2Hex(sub);
        }
        return result;
    }

    public static String hexMultiply(String input1, String input2) {
        String result = "";
        String number1 = ConvertNumeric.calcConvertHex2Dec(input1);
        String number2 = ConvertNumeric.calcConvertHex2Dec(input2);
        if (number1.equals("Z") || number2.equals("Z")) {
            result = "";
        } else {
            long dec1 = Integer.parseInt(number1);
            long dec2 = Integer.parseInt(number2);
            if (input1.startsWith("-")) {
                dec1 *= -1;
            }
            if (input2.startsWith("-")) {
                dec2 *= -1;
            }
            String mul = Long.toString(multiplyValues(dec1, dec2));
            result = ConvertNumeric.calcConvertDec2Hex(mul);
        }
        return result;
    }

    public static String hexDivide(String input1, String input2) {
        String result = "";
        String number1 = ConvertNumeric.calcConvertHex2Dec(input1);
        String number2 = ConvertNumeric.calcConvertHex2Dec(input2);
        if (number1.equals("Z") || number2.equals("Z")) {
            result = "";
        } else {
            long dec1 = Integer.parseInt(number1);
            long dec2 = Integer.parseInt(number2);
            if (input1.startsWith("-")) {
                dec1 *= -1;
            }
            if (input2.startsWith("-")) {
                dec2 *= -1;
            }
            String div = Long.toString(divideValues(dec1, dec2));
            result = ConvertNumeric.calcConvertDec2Hex(div);
        }
        return result;
    }

    public static String remainderHexDivide(String input1, String input2) {
        String result = "";
        String number1 = ConvertNumeric.calcConvertHex2Dec(input1);
        String number2 = ConvertNumeric.calcConvertHex2Dec(input2);
        if (number1.equals("Z") || number2.equals("Z")) {
            result = "";
        } else {
            long dec1 = Integer.parseInt(number1);
            long dec2 = Integer.parseInt(number2);
            if (input1.startsWith("-")) {
                dec1 *= -1;
            }
            if (input2.startsWith("-")) {
                dec2 *= -1;
            }
            String remainder = Long.toString(divideRemainderValues(dec1, dec2));
            if (remainder.equals("")) {
                result = "";
            } else {
                result = ConvertNumeric.calcConvertDec2Hex(remainder);
            }
        }
        return result;
    }

    public static void hexCalculator(String input1, String input2, String operator) {
        String number1 = ConvertNumeric.calcConvertHex2Dec(input1);
        String number2 = ConvertNumeric.calcConvertHex2Dec(input2);
        if (number1.equals("Z") || number2.equals("Z")) {
            System.out.print("");
        } else {
            long dec1 = Integer.parseInt(number1);
            long dec2 = Integer.parseInt(number2);
            if (input1.startsWith("-")) {
                dec1 *= -1;
            }
            if (input2.startsWith("-")) {
                dec2 *= -1;
            }
            switch (operator) {
                case "+":
                    String add = Long.toString(addValues(dec1, dec2));
                    String hexAdd = ConvertNumeric.calcConvertDec2Hex(add);
                    System.out.println(ConsoleColors.RED_BOLD + "\tHexadecimal value: \n\t" + ConsoleColors.RESET
                            + input1 + " + " + input2
                            + ConsoleColors.GREEN_BOLD + "\n\t = " + hexAdd + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED_BOLD + "\tDecimal value: \n\t" + ConsoleColors.RESET
                            + dec1 + " + " + dec2
                            + ConsoleColors.GREEN_BOLD + "\n\t = " + add + ConsoleColors.RESET);
                    break;
                case "-":
                    String sub = Long.toString(subtractValues(dec1, dec2));
                    String hexSub = ConvertNumeric.calcConvertDec2Hex(sub);
//                    if (sub.startsWith("-")) {
//                        System.out.println(ConsoleColors.RED_BOLD + "\tHexadecimal value: \n\t" + ConsoleColors.RESET
//                                + input1 + " - " + input2
//                                + ConsoleColors.GREEN_BOLD +"\n\t = " + hexSub + ConsoleColors.RESET);
//                    } else {
                    System.out.println(ConsoleColors.RED_BOLD + "\tHexadecimal value: \n\t" + ConsoleColors.RESET
                            + input1 + " - " + input2
                            + ConsoleColors.GREEN_BOLD +"\n\t = " + hexSub + ConsoleColors.RESET);
//                    }
                    System.out.println(ConsoleColors.RED_BOLD + "\tDecimal value: \n\t" + ConsoleColors.RESET
                            + dec1 + " - " + dec2
                            + ConsoleColors.GREEN_BOLD +"\n\t = " + sub + ConsoleColors.RESET);
                    break;
                case "*":
                    String mul = Long.toString(multiplyValues(dec1, dec2));
                    String hexMul = ConvertNumeric.calcConvertDec2Hex(mul);
                    System.out.println(ConsoleColors.RED_BOLD + "\tHexadecimal value: \n\t" + ConsoleColors.RESET
                            + input1 + " * " + input2
                            + ConsoleColors.GREEN_BOLD + "\n\t = " + hexMul + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED_BOLD + "\tDecimal value: \n\t" + ConsoleColors.RESET
                            + dec1 + " * " + dec2
                            + ConsoleColors.GREEN_BOLD + "\n\t = " + mul + ConsoleColors.RESET);
                    break;
                case "/":
                    String remainder = Long.toString(divideRemainderValues(dec1, dec2));
                    String remainderDiv = ConvertNumeric.calcConvertDec2Hex(remainder);
                    String div = Long.toString(divideValues(dec1, dec2));
                    String hexDiv = ConvertNumeric.calcConvertDec2Hex(div);
                    if (remainder.equals("")) {
                        System.out.println(ConsoleColors.RED_BOLD + "\tHexadecimal value: \n\t" + ConsoleColors.RESET
                                + input1 + " / " + input2
                                + ConsoleColors.GREEN_BOLD + "\n\t = " + hexDiv + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED_BOLD + "\tDecimal value: \n\t" + ConsoleColors.RESET
                                + dec1 + " / " + dec2
                                + ConsoleColors.GREEN_BOLD + "\n\t = " + div + ConsoleColors.RESET);
                    } else {
                        System.out.println(ConsoleColors.RED_BOLD + "\tHexadecimal value: \n\t" + ConsoleColors.RESET
                                + input1 + " / " + input2
                                + ConsoleColors.GREEN_BOLD + "\n\t = " + hexDiv + " Remainder : " + remainderDiv + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED_BOLD + "\tDecimal value: \n\t" + ConsoleColors.RESET
                                + dec1 + " / " + dec2
                                + ConsoleColors.GREEN_BOLD + "\n\t = " + div + " Remainder : " + remainder + ConsoleColors.RESET);
                    }
                    break;
                default:
                    System.out.println(ConsoleColors.RED_BOLD + "\tInvalid Operator!" + ConsoleColors.RESET);
                    break;
            }
        }
    }
}
