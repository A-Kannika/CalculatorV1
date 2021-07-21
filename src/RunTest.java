/**
 * Create by Kannika Armstrong
 * TCSS305(Winter 2021): January 16, 2021
 * Programming assignment: Develop Multi-Function Calculator Version 1
 * Run Test Calculator program
 * Professor. Kivanç A. Dincer, Ph.D.
 * The University of Washington Tacoma
 */

public class RunTest extends Calculator{
    public static void main(String[] args) {
        runTest();

    }

    public static void runTest(){

        //Input
        String input1 = "";
        String input2 = "";
        //Test mode of Binary Calculator
        //I used 10101010 and 11001100 as test inputs to test the binary calculation
        System.out.println(ConsoleColors.BLUE_BOLD + ConsoleColors.BLUE_UNDERLINED + "Test Binary Calculator:\n" + ConsoleColors.RESET);

        // Test mode for binary calculation
        System.out.println(ConsoleColors.RED_BOLD + "\t1. Binary Calculation — Add, Subtract, Multiply, or Divide\n" + ConsoleColors.RESET);

        // Binary calculation - add
        System.out.println("\tBinary Calculator - " + ConsoleColors.PURPLE_BOLD + "Add" + ConsoleColors.RESET + ", 10101010 + 11001100 should give " + ConsoleColors.GREEN_BOLD + "101110110" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE_BOLD + "\tTest#1" + ConsoleColors.RESET);
        input1 = "10101010";
        input2 = "11001100";
        if (NumericCalculation.binaryAdd(input1, input2).equals("101110110")) {
            System.out.println("\t\tComputed Result = " + ConsoleColors.GREEN_BOLD + NumericCalculation.binaryAdd(input1, input2) + ConsoleColors.RESET);
            System.out.println(ConsoleColors.GREEN_BOLD + "\t\t\"Your Output Match!\"" + ConsoleColors.RESET);
        } else {
            System.out.println("\t\tYour input are = " + ConsoleColors.BLUE_BOLD + input1 + ConsoleColors.RESET + " and " + ConsoleColors.BLUE_BOLD + input2 + ConsoleColors.RESET);
            System.out.println("\t\tComputed Result = " + ConsoleColors.RED_BOLD + "The number need to contain 0 and 1 only."
                    + "\n\t\t\"Your Output doesn't Match!\"" + ConsoleColors.RESET);
        }
        System.out.println(ConsoleColors.BLUE_BOLD + "\tTest#2" + ConsoleColors.RESET);
        input1 = "10101010-";
        input2 = "-11001100";
        if (NumericCalculation.binaryAdd(input1, input2).equals("101110110")) {
            System.out.println("\t\tComputed Result = " + ConsoleColors.GREEN_BOLD + NumericCalculation.binaryAdd(input1, input2) + ConsoleColors.RESET);
            System.out.println(ConsoleColors.GREEN_BOLD + "\t\t\"Your Output Match!\"" + ConsoleColors.RESET);
        } else {
            System.out.println("\t\tYour input are = " + ConsoleColors.BLUE_BOLD + input1 + ConsoleColors.RESET + " and " + ConsoleColors.BLUE_BOLD + input2 + ConsoleColors.RESET);
            System.out.println("\t\tComputed Result = " + ConsoleColors.RED_BOLD + "The number need to contain 0 and 1 only."
                    + "\n\t\t\"Your Output Doesn't Match!\"" + ConsoleColors.RESET);
        }

        // Binary calculation - subtract
        input1 = "10101010";
        input2 = "11001100";
        System.out.println("\n\tBinary Calculator - " + ConsoleColors.PURPLE_BOLD + "Subtract" + ConsoleColors.RESET + ", 10101010 - 11001100 should give " + ConsoleColors.GREEN_BOLD + "-100010" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE_BOLD + "\tTest#1" + ConsoleColors.RESET);
        input1 = "10101010";
        input2 = "11001100";
        if (NumericCalculation.binarySubtract(input1, input2).equals("-100010")) {
            System.out.println("\t\tComputed Result = " + ConsoleColors.GREEN_BOLD + NumericCalculation.binarySubtract(input1, input2) + ConsoleColors.RESET);
            System.out.println(ConsoleColors.GREEN_BOLD + "\t\t\"Your Output Match!\"" + ConsoleColors.RESET);
        } else {
            System.out.println("\t\tYour input are = " + ConsoleColors.BLUE_BOLD + input1 + ConsoleColors.RESET + " and " + ConsoleColors.BLUE_BOLD + input2 + ConsoleColors.RESET);
            System.out.println("\t\tComputed Result = " + ConsoleColors.RED_BOLD + "The number need to contain 0 and 1 only."
                    + "\n\t\t\"Your Output Doesn't Match!\"" + ConsoleColors.RESET);
        }
        System.out.println(ConsoleColors.BLUE_BOLD + "\tTest#2" + ConsoleColors.RESET);
        input1 = "10101010-";
        input2 = "-11001100";
        if (NumericCalculation.binarySubtract(input1, input2).equals("-100010")) {
            System.out.println("\t\tComputed Result = " + ConsoleColors.GREEN_BOLD + NumericCalculation.binarySubtract(input1, input2) + ConsoleColors.RESET);
            System.out.println(ConsoleColors.GREEN_BOLD + "\t\t\"Your Output Match!\"" + ConsoleColors.RESET);
        } else {
            System.out.println("\t\tYour input are = " + ConsoleColors.BLUE_BOLD + input1 + ConsoleColors.RESET + " and " + ConsoleColors.BLUE_BOLD + input2 + ConsoleColors.RESET);
            System.out.println("\t\tComputed Result = " + ConsoleColors.RED_BOLD + "The number need to contain 0 and 1 only."
                    + "\n\t\t\"Your Output Doesn't Match!\"" + ConsoleColors.RESET);
        }

        // Binary calculation - multiply
        System.out.println("\n\tBinary Calculator - " + ConsoleColors.PURPLE_BOLD + "Multiply" + ConsoleColors.RESET + ", 10101010 x 11001100 should give " + ConsoleColors.GREEN_BOLD + "1000011101111000" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE_BOLD + "\tTest#1" + ConsoleColors.RESET);
        input1 = "10101010";
        input2 = "11001100";
        if (NumericCalculation.binaryMultiply(input1, input2).equals("1000011101111000")) {
            System.out.println("\t\tComputed Result = " + ConsoleColors.GREEN_BOLD + NumericCalculation.binaryMultiply(input1, input2) + ConsoleColors.RESET);
            System.out.println(ConsoleColors.GREEN_BOLD + "\t\t\"Your Output Match!\"" + ConsoleColors.RESET);
        } else {
            System.out.println("\t\tYour input are = " + ConsoleColors.BLUE_BOLD + input1 + ConsoleColors.RESET + " and " + ConsoleColors.BLUE_BOLD + input2 + ConsoleColors.RESET);
            System.out.println("\t\tComputed Result = " + ConsoleColors.RED_BOLD + "The number need to contain 0 and 1 only."
                    + "\n\t\t\"Your Output Doesn't Match!\"" + ConsoleColors.RESET);
        }
        System.out.println(ConsoleColors.BLUE_BOLD + "\tTest#2" + ConsoleColors.RESET);
        input1 = "10101010-";
        input2 = "-11001100";
        if (NumericCalculation.binaryMultiply(input1, input2).equals("1000011101111000")) {
            System.out.println("\t\tComputed Result = " + ConsoleColors.GREEN_BOLD + NumericCalculation.binaryMultiply(input1, input2) + ConsoleColors.RESET);
            System.out.println(ConsoleColors.GREEN_BOLD + "\t\t\"Your Output Match!\"" + ConsoleColors.RESET);
        } else {
            System.out.println("\t\tYour input are = " + ConsoleColors.BLUE_BOLD + input1 + ConsoleColors.RESET + " and " + ConsoleColors.BLUE_BOLD + input2 + ConsoleColors.RESET);
            System.out.println("\t\tComputed Result = " + ConsoleColors.RED_BOLD + "The number need to contain 0 and 1 only."
                    + "\n\t\t\"Your Output Doesn't Match!\"" + ConsoleColors.RESET);
        }

        // Binary calculation - divide
        System.out.println("\n\tBinary Calculator - " + ConsoleColors.PURPLE_BOLD + "Divide" + ConsoleColors.RESET + ", 10101010 ÷ 11001100 should give " + ConsoleColors.GREEN_BOLD + "0 Remainder : 10101010" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE_BOLD + "\tTest#1" + ConsoleColors.RESET);
        input1 = "10101010";
        input2 = "11001100";
        if (NumericCalculation.binaryDivide(input1, input2).equals("-1")) {
            System.out.println("\t\tYour input are = " + ConsoleColors.BLUE_BOLD + input1 + ConsoleColors.RESET + " and " + ConsoleColors.BLUE_BOLD + input2 + ConsoleColors.RESET);
            System.out.println("\t\tComputed Result = " + ConsoleColors.RED_BOLD + "The number need to contain 0 and 1 only."
                    + "\n\t\t\"Your Output Doesn't Match!\"" + ConsoleColors.RESET);
        } else {
            if (NumericCalculation.remainderBinaryDivide(input1, input2).equals("")) {
                System.out.println("\t\tComputed Result = " + ConsoleColors.GREEN_BOLD + NumericCalculation.binaryDivide(input1, input2) + ConsoleColors.RESET);
                System.out.println(ConsoleColors.GREEN_BOLD + "\t\t\"Your Output Match!\"" + ConsoleColors.RESET);
            } else {
                System.out.println("\t\tComputed Result = " + ConsoleColors.GREEN_BOLD + NumericCalculation.binaryDivide(input1, input2)
                        + " Remainder : " + NumericCalculation.remainderBinaryDivide(input1, input2) + ConsoleColors.RESET);
                System.out.println(ConsoleColors.GREEN_BOLD + "\t\t\"Your Output Match!\"" + ConsoleColors.RESET);
            }
        }
        System.out.println(ConsoleColors.BLUE_BOLD + "\tTest#2" + ConsoleColors.RESET);
        input1 = "10101010-";
        input2 = "-11001100";
        if (NumericCalculation.binaryDivide(input1, input2).equals("-1")) {
            System.out.println("\t\tYour input are = " + ConsoleColors.BLUE_BOLD + input1 + ConsoleColors.RESET + " and " + ConsoleColors.BLUE_BOLD + input2 + ConsoleColors.RESET);
            System.out.println("\t\tComputed Result = " + ConsoleColors.RED_BOLD + "The number need to contain 0 and 1 only."
                    + "\n\t\t\"Your Output Doesn't Match!\"" + ConsoleColors.RESET);
        } else {
            if (NumericCalculation.remainderBinaryDivide(input1, input2).equals("")) {
                System.out.println("\t\tComputed Result = " + ConsoleColors.GREEN_BOLD + NumericCalculation.binaryDivide(input1, input2) + ConsoleColors.RESET);
                System.out.println(ConsoleColors.GREEN_BOLD + "\t\t\"Your Output Match!\"" + ConsoleColors.RESET);
            } else {
                System.out.println("\t\tComputed Result = " + ConsoleColors.GREEN_BOLD + NumericCalculation.binaryDivide(input1, input2)
                        + " Remainder : " + NumericCalculation.remainderBinaryDivide(input1, input2) + ConsoleColors.RESET);
                System.out.println(ConsoleColors.GREEN_BOLD + "\t\tYour Output Match!" + ConsoleColors.RESET);
            }
        }

        //Test mode of Convert Binary Value to Decimal Value
        //I used 10101010 as test inputs to test the Convert Binary Value to Decimal Value
        System.out.println(ConsoleColors.RED_BOLD + "\n\t2. Convert Binary Value to Decimal Value" + ConsoleColors.RESET + " - Converting 10101010 should give " + ConsoleColors.GREEN_BOLD + "170" + ConsoleColors.RESET );
        System.out.println(ConsoleColors.BLUE_BOLD + "\tTest#1" + ConsoleColors.RESET);
        input1 = "10101010";
        if (ConvertNumeric.calcConvertBin2Dec(input1).equals("170")) {
            System.out.println("\t\tConverting Result = " + ConsoleColors.GREEN_BOLD + ConvertNumeric.calcConvertBin2Dec("10101010") + ConsoleColors.RESET);
            System.out.println(ConsoleColors.GREEN_BOLD + "\t\t\"Your Output Match!\"" + ConsoleColors.RESET);
        } else {
            System.out.println("\t\tYour input is = " + ConsoleColors.BLUE_BOLD + input1 + ConsoleColors.RESET);
            System.out.println("\t\tConverting Result = " + ConsoleColors.RED_BOLD + "The number need to contain 0 and 1 only."
                    + "\n\t\t\"Your Output Doesn't Match!\"" + ConsoleColors.RESET);
        }
        System.out.println(ConsoleColors.BLUE_BOLD + "\tTest#2" + ConsoleColors.RESET);
        input1 = "-10101010";
        if (ConvertNumeric.calcConvertBin2Dec(input1).equals("170")) {
            System.out.println("\t\tConverting Result = " + ConsoleColors.GREEN_BOLD + ConvertNumeric.calcConvertBin2Dec("10101010") + ConsoleColors.RESET);
            System.out.println(ConsoleColors.GREEN_BOLD + "\t\t\"Your Output Match!\"" + ConsoleColors.RESET);
        } else {
            System.out.println("\t\tYour input is = " + ConsoleColors.BLUE_BOLD + input1 + ConsoleColors.RESET);
            System.out.println("\t\tConverting Result = " + ConsoleColors.RED_BOLD + "The number need to contain 0 and 1 only."
                    + "\n\t\t\"Your Output Doesn't Match!\"" + ConsoleColors.RESET);
        }


        //Test mode of Convert Decimal Value to Binary Value
        //I used 170 as test inputs to test the Convert Decimal Value to Binary Value
        System.out.println(ConsoleColors.RED_BOLD + "\n\t3. Convert Decimal Value to Binary Value" + ConsoleColors.RESET + " - Converting 170 should give " + ConsoleColors.GREEN_BOLD + "10101010" + ConsoleColors.RESET );
        System.out.println(ConsoleColors.BLUE_BOLD + "\tTest#1" + ConsoleColors.RESET);
        input1 = "170";
        if (ConvertNumeric.calcConvertDec2Bin(input1).equals("10101010")) {
            System.out.println("\t\tConverting Result = " + ConsoleColors.GREEN_BOLD + ConvertNumeric.calcConvertDec2Bin(input1) + ConsoleColors.RESET);
            System.out.println(ConsoleColors.GREEN_BOLD + "\t\t\"Your Output Match!\"" + ConsoleColors.RESET);
        } else {
            System.out.println("\t\tYour input is = " + ConsoleColors.BLUE_BOLD + input1 + ConsoleColors.RESET);
            System.out.println("\t\tConverting Result = " + ConsoleColors.RED_BOLD + "The number need to be numeric."
                    + "\n\t\t\"Your Output Doesn't Match!\"" + ConsoleColors.RESET);
        }
        System.out.println(ConsoleColors.BLUE_BOLD + "\tTest#2" + ConsoleColors.RESET);
        input1 = "Number170";
        if (ConvertNumeric.calcConvertDec2Bin(input1).equals("10101010")) {
            System.out.println("\t\tConverting Result = " + ConsoleColors.GREEN_BOLD + ConvertNumeric.calcConvertDec2Bin(input1) + ConsoleColors.RESET);
            System.out.println(ConsoleColors.GREEN_BOLD + "\t\t\"Your Output Match!\"" + ConsoleColors.RESET);
        } else {
            System.out.println("\t\tYour input is = " + ConsoleColors.BLUE_BOLD + input1 + ConsoleColors.RESET);
            System.out.println("\t\tConverting Result = " + ConsoleColors.RED_BOLD + "The number need to be numeric."
                    + "\n\t\t\"Your Output Doesn't Match!\"" + ConsoleColors.RESET);
        }


        //Test mode of Hexadecimal Calculator
        //I used 8AB and B78 as test inputs to test the hexadecimal calculation
        System.out.println(ConsoleColors.BLUE_BOLD + ConsoleColors.BLUE_UNDERLINED + "\nTest Hexadecimal Calculator:\n" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.RED_BOLD + "\t1. Hexadecimal Calculation — Add, Subtract, Multiply, or Divide" + ConsoleColors.RESET );

        // Hex calculation - add
        System.out.println("\n\tHexadecimal Calculator - " + ConsoleColors.PURPLE_BOLD + "Add" + ConsoleColors.RESET + ", 8AB + B78 should give " + ConsoleColors.GREEN_BOLD + "1423"+ ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE_BOLD + "\tTest#1" + ConsoleColors.RESET);
        input1 = "8AB";
        input2 = "B78";
        if (NumericCalculation.hexAdd(input1, input2).equals("1423")) {
            System.out.println("\t\tComputed Result = " + ConsoleColors.GREEN_BOLD + NumericCalculation.hexAdd(input1, input2)+ ConsoleColors.RESET);
            System.out.println(ConsoleColors.GREEN_BOLD + "\t\t\"Your Output Match!\"" + ConsoleColors.RESET);
        } else {
            System.out.println("\t\tYour input are = " + ConsoleColors.BLUE_BOLD + input1 + ConsoleColors.RESET + " and " + ConsoleColors.BLUE_BOLD + input2 + ConsoleColors.RESET);
            System.out.println("\t\tComputed Result = " + ConsoleColors.RED_BOLD + "The number need to contain 0-9 and A-F only."
                    + "\n\t\t\"Your Output doesn't Match!\"" + ConsoleColors.RESET);
        }
        System.out.println(ConsoleColors.BLUE_BOLD + "\tTest#2" + ConsoleColors.RESET);
        input1 = "DAZ";
        input2 = "B78";
        if (NumericCalculation.hexAdd(input1, input2).equals("1423")) {
            System.out.println("\t\tComputed Result = " + ConsoleColors.GREEN_BOLD + NumericCalculation.hexAdd(input1, input2)+ ConsoleColors.RESET);
            System.out.println(ConsoleColors.GREEN_BOLD + "\t\t\"Your Output Match!\"" + ConsoleColors.RESET);
        } else {
            System.out.println("\t\tYour input are = " + ConsoleColors.BLUE_BOLD + input1 + ConsoleColors.RESET + " and " + ConsoleColors.BLUE_BOLD + input2 + ConsoleColors.RESET);
            System.out.println("\t\tComputed Result = " + ConsoleColors.RED_BOLD + "The number need to contain 0-9 and A-F only."
                    + "\n\t\t\"Your Output doesn't Match!\"" + ConsoleColors.RESET);
        }


        // Hex calculation - subtract
        System.out.println("\n\tHexadecimal Calculator - " + ConsoleColors.PURPLE_BOLD + "Subtract" + ConsoleColors.RESET + ", 8AB - B78 should give " + ConsoleColors.GREEN_BOLD + "-2CD"+ ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE_BOLD + "\tTest#1" + ConsoleColors.RESET);
        input1 = "8AB";
        input2 = "B78";
        if (NumericCalculation.hexSubtract(input1, input2).equals("-2CD")) {
            System.out.println("\t\tComputed Result = " + ConsoleColors.GREEN_BOLD + NumericCalculation.hexSubtract(input1, input2)+ ConsoleColors.RESET);
            System.out.println(ConsoleColors.GREEN_BOLD + "\t\t\"Your Output Match!\"" + ConsoleColors.RESET);
        } else {
            System.out.println("\t\tYour input are = " + ConsoleColors.BLUE_BOLD + input1 + ConsoleColors.RESET + " and " + ConsoleColors.BLUE_BOLD + input2 + ConsoleColors.RESET);
            System.out.println("\t\tComputed Result = " + ConsoleColors.RED_BOLD + "The number need to contain 0-9 and A-F only."
                    + "\n\t\t\"Your Output doesn't Match!\"" + ConsoleColors.RESET);
        }
        System.out.println(ConsoleColors.BLUE_BOLD + "\tTest#2" + ConsoleColors.RESET);
        input1 = "-DAZ";
        input2 = "B78";
        if (NumericCalculation.hexAdd(input1, input2).equals("1423")) {
            System.out.println("\t\tComputed Result = " + ConsoleColors.GREEN_BOLD + NumericCalculation.hexAdd(input1, input2)+ ConsoleColors.RESET);
            System.out.println(ConsoleColors.GREEN_BOLD + "\t\t\"Your Output Match!\"" + ConsoleColors.RESET);
        } else {
            System.out.println("\t\tYour input are = " + ConsoleColors.BLUE_BOLD + input1 + ConsoleColors.RESET + " and " + ConsoleColors.BLUE_BOLD + input2 + ConsoleColors.RESET);
            System.out.println("\t\tComputed Result = " + ConsoleColors.RED_BOLD + "The number need to contain 0-9 and A-F only."
                    + "\n\t\t\"Your Output doesn't Match!\"" + ConsoleColors.RESET);
        }

        // Hex calculation - multiply
        System.out.println("\n\tHexadecimal Calculator - " + ConsoleColors.PURPLE_BOLD + "Multiply" + ConsoleColors.RESET + ", 8AB x B78 should give " + ConsoleColors.GREEN_BOLD + "636928"+ ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE_BOLD + "\tTest#1" + ConsoleColors.RESET);
        input1 = "8AB";
        input2 = "B78";
        if (NumericCalculation.hexMultiply(input1, input2).equals("636928")) {
            System.out.println("\t\tComputed Result = " + ConsoleColors.GREEN_BOLD + NumericCalculation.hexMultiply(input1, input2)+ ConsoleColors.RESET);
            System.out.println(ConsoleColors.GREEN_BOLD + "\t\t\"Your Output Match!\"" + ConsoleColors.RESET);
        } else {
            System.out.println("\t\tYour input are = " + ConsoleColors.BLUE_BOLD + input1 + ConsoleColors.RESET + " and " + ConsoleColors.BLUE_BOLD + input2 + ConsoleColors.RESET);
            System.out.println("\t\tComputed Result = " + ConsoleColors.RED_BOLD + "The number need to contain 0-9 and A-F only."
                    + "\n\t\t\"Your Output doesn't Match!\"" + ConsoleColors.RESET);
        }
        System.out.println(ConsoleColors.BLUE_BOLD + "\tTest#2" + ConsoleColors.RESET);
        input1 = "-DAZ";
        input2 = "B78";
        if (NumericCalculation.hexAdd(input1, input2).equals("1423")) {
            System.out.println("\t\tComputed Result = " + ConsoleColors.GREEN_BOLD + NumericCalculation.hexAdd(input1, input2)+ ConsoleColors.RESET);
            System.out.println(ConsoleColors.GREEN_BOLD + "\t\t\"Your Output Match!\"" + ConsoleColors.RESET);
        } else {
            System.out.println("\t\tYour input are = " + ConsoleColors.BLUE_BOLD + input1 + ConsoleColors.RESET + " and " + ConsoleColors.BLUE_BOLD + input2 + ConsoleColors.RESET);
            System.out.println("\t\tComputed Result = " + ConsoleColors.RED_BOLD + "The number need to contain 0-9 and A-F only."
                    + "\n\t\t\"Your Output doesn't Match!\"" + ConsoleColors.RESET);
        }


        //Hex calculation -- divide
        System.out.println("\n\tHexadecimal Calculator - " + ConsoleColors.PURPLE_BOLD + "Divide" + ConsoleColors.RESET + ", 8AB ÷ B78 should give " + ConsoleColors.GREEN_BOLD + "0 Remainder : 8AB"+ ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE_BOLD + "\tTest#1" + ConsoleColors.RESET);
        input1 = "8AB";
        input2 = "B78";
        if (NumericCalculation.hexDivide(input1, input2).equals("")) {
            System.out.println("\t\tYour input are = " + ConsoleColors.BLUE_BOLD + input1 + ConsoleColors.RESET + " and " + ConsoleColors.BLUE_BOLD + input2 + ConsoleColors.RESET);
            System.out.println("\t\tComputed Result = " + ConsoleColors.RED_BOLD + "The number need to contain 0-9 and A-F only."
                    + "\n\t\t\"Your Output Doesn't Match!\"" + ConsoleColors.RESET);
        } else {
            if (NumericCalculation.remainderHexDivide(input1, input2).equals("")){
                System.out.println("\t\tComputed Result = " + ConsoleColors.GREEN_BOLD + NumericCalculation.hexDivide(input1, input2)+ ConsoleColors.RESET);
                System.out.println(ConsoleColors.GREEN_BOLD + "\t\t\"Your Output Match!\"" + ConsoleColors.RESET);
            } else {
                System.out.println("\t\tComputed Result = " + ConsoleColors.GREEN_BOLD + NumericCalculation.hexDivide(input1, input2)
                        + " Remainder : " + NumericCalculation.remainderHexDivide("8AB", "B78")+ ConsoleColors.RESET);
                System.out.println(ConsoleColors.GREEN_BOLD + "\t\t\"Your Output Match!\"" + ConsoleColors.RESET);
            }
        }
        System.out.println(ConsoleColors.BLUE_BOLD + "\tTest#2" + ConsoleColors.RESET);
        input1 = "-DAZ";
        input2 = "B78";

        if (NumericCalculation.hexDivide(input1, input2).equals("")) {
            System.out.println("\t\tYour input are = " + ConsoleColors.BLUE_BOLD + input1 + ConsoleColors.RESET + " and " + ConsoleColors.BLUE_BOLD + input2 + ConsoleColors.RESET);
            System.out.println("\t\tComputed Result = " + ConsoleColors.RED_BOLD + "The number need to contain 0-9 and A-F only."
                    + "\n\t\t\"Your Output Doesn't Match!\"" + ConsoleColors.RESET);
        } else {
            if (NumericCalculation.remainderHexDivide(input1, input2).equals("")){
                System.out.println("\t\tComputed Result = " + ConsoleColors.GREEN_BOLD + NumericCalculation.hexDivide(input1, input2)+ ConsoleColors.RESET);
                System.out.println(ConsoleColors.GREEN_BOLD + "\t\t\"Your Output Match!\"" + ConsoleColors.RESET);
            } else {
                System.out.println("\t\tComputed Result = " + ConsoleColors.GREEN_BOLD + NumericCalculation.hexDivide(input1, input2)
                        + " Remainder : " + NumericCalculation.remainderHexDivide("8AB", "B78")+ ConsoleColors.RESET);
                System.out.println(ConsoleColors.GREEN_BOLD + "\t\t\"Your Output Match!\"" + ConsoleColors.RESET);
            }
        }

        //Test mode of Convert Hexadecimal Value to Decimal Value
        //I used DAD as test inputs to test the Hexadecimal Value to Decimal Value
        System.out.println(ConsoleColors.RED_BOLD + "\n\t2. Convert Hexadecimal Value to Decimal Value " + ConsoleColors.RESET + "- Converting DAD should give " + ConsoleColors.GREEN_BOLD + "3501" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE_BOLD + "\tTest#1" + ConsoleColors.RESET);
        input1 = "DAD";
        if (ConvertNumeric.calcConvertHex2Dec(input1).equals("3501")){
            System.out.println("\t\tConverting Result = " + ConsoleColors.GREEN_BOLD + ConvertNumeric.calcConvertHex2Dec(input1)+ ConsoleColors.RESET);
            System.out.println(ConsoleColors.GREEN_BOLD + "\t\t\"Your Output Match!\"" + ConsoleColors.RESET);
        }
        System.out.println(ConsoleColors.BLUE_BOLD + "\tTest#2" + ConsoleColors.RESET);
        input1 = "DAZ";
        System.out.println("\t\tYour input are = " + ConsoleColors.BLUE_BOLD + input1 + ConsoleColors.RESET);
        System.out.println("\t\tComputed Result = " + ConsoleColors.RED_BOLD + "The number need to contain 0-9 and A-F only."
                + "\n\t\t\"Your Output doesn't Match!\"" + ConsoleColors.RESET);

        //Test mode of Convert Decimal Value to Hexadecimal Value
        //I used 170 as test inputs to test the Convert Decimal Value to Hexadecimal Value
        System.out.println(ConsoleColors.RED_BOLD + "\n\t3. Convert Decimal Value to Hexadecimal Value " + ConsoleColors.RESET + "- Converting 170 should give " + ConsoleColors.GREEN_BOLD + "AA" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE_BOLD + "\tTest#1" + ConsoleColors.RESET);
        input1 = "170";
        if (ConvertNumeric.calcConvertDec2Hex(input1).equals("AA")){
            System.out.println("\t\tConverting Result = " + ConsoleColors.GREEN_BOLD + ConvertNumeric.calcConvertDec2Hex(input1)+ ConsoleColors.RESET);
            System.out.println(ConsoleColors.GREEN_BOLD + "\t\t\"Your Output Match!\"" + ConsoleColors.RESET);
        }
        System.out.println(ConsoleColors.BLUE_BOLD + "\tTest#2" + ConsoleColors.RESET);
        input1 = "DAZ";
        System.out.println("\t\tYour input is = " + ConsoleColors.BLUE_BOLD + input1 + ConsoleColors.RESET);
        System.out.println("\t\tConverting Result = " + ConsoleColors.RED_BOLD + "The number need to be numeric."
                + "\n\t\t\"Your Output Doesn't Match!\"" + ConsoleColors.RESET);

        //Test mode of Bandwidth Calculator
        //I used 500 Megabytes as test inputs to test the Data Unit Converter
        System.out.println(ConsoleColors.BLUE_BOLD + ConsoleColors.BLUE_UNDERLINED + "\nTest Bandwidth Calculator:\n" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.RED_BOLD + "\t1. Data Unit Converter - Converting 500 MB should give\n" + ConsoleColors.RESET +
                ConsoleColors.GREEN_BOLD + "\t\t4000000000 bits (b)\n" +
                "\t\t4000000 kilobits (kb)\n" +
                "\t\t4000 megabits (mb)\n" +
                "\t\t4 gigabits (gb)\n" +
                "\t\t0.004 terabits (tb)\n" +
                "\t\t500000000 Bytes (B)\n" +
                "\t\t500000 Kilobytes (KB)\n" +
                "\t\t0.5 Gigabytes (GB)\n" +
                "\t\t0.0005 Terabytes (TB)" + ConsoleColors.RESET);
        System.out.println("\tConverting Result: \n\t\t" +
                ConsoleColors.GREEN_BOLD + ConvertDataUnits.convertMegabytes2Bits(500) + " bits (b)\n\t\t" +
                ConvertDataUnits.convertMegabytes2Kilobits(500) + " kilobits (kb)\n\t\t" +
                ConvertDataUnits.convertMegabytes2Megabits(500) + " megabits (mb)\n\t\t" +
                ConvertDataUnits.convertMegabytes2Gigabits(500) + " gigabits (gb)\n\t\t" +
                ConvertDataUnits.convertMegabytes2Terabits(500) + " terabits (tb)\n\t\t" +
                ConvertDataUnits.convertMegabytes2Bytes(500) + " Bytes (B)\n\t\t" +
                ConvertDataUnits.convertMegabytes2Kilobytes(500) + " Kilobytes (KB)\n\t\t" +
                ConvertDataUnits.convertMegabytesGigabytes(500) + " Gigabytes (GB)\n\t\t" +
                ConvertDataUnits.convertMegabytesTerabytes(500) + " Terabytes (TB)" + ConsoleColors.RESET);

        //Test mode of Download/Upload Time Calculator
        //I used file size = 500 Megabytes and bandwidth = 5 Mbit/s
        //as test inputs to test the Download/Upload Time Calculator
        System.out.println(ConsoleColors.RED_BOLD + "\n\t2. Download/Upload Time Calculator " + ConsoleColors.RESET +
                "- file size = 500 Megabytes and bandwidth = 5 Mbit/s" +
                " should give " + ConsoleColors.GREEN_BOLD + "~13 minutes 20.0 seconds" + ConsoleColors.RESET);
        System.out.print("\tComputed Result = ~");
        if (CalcDownloadUploadTime.calcDay(CalcDownloadUploadTime.calculateDownloadUploadTime(3,"500", 3, "5")) != 0){
            System.out.print(ConsoleColors.GREEN_BOLD + CalcDownloadUploadTime.calcDay( CalcDownloadUploadTime.calculateDownloadUploadTime(3,"500", 3, "5"))
                    + " days " + ConsoleColors.RESET);
        }
        if (CalcDownloadUploadTime.calcHour(CalcDownloadUploadTime.calculateDownloadUploadTime(3,"500", 3, "5")) != 0){
            System.out.print(ConsoleColors.GREEN_BOLD + CalcDownloadUploadTime.calcHour(CalcDownloadUploadTime.calculateDownloadUploadTime(3,"500", 3, "5"))
                    + " hours " + ConsoleColors.RESET);
        }
        if (CalcDownloadUploadTime.calcMinute(CalcDownloadUploadTime.calculateDownloadUploadTime(3,"500", 3, "5")) != 0){
            System.out.print(ConsoleColors.GREEN_BOLD + CalcDownloadUploadTime.calcMinute(CalcDownloadUploadTime.calculateDownloadUploadTime(3,"500", 3, "5"))
                    + " minutes " + ConsoleColors.RESET);
        }
        if (CalcDownloadUploadTime.calcSecond(CalcDownloadUploadTime.calculateDownloadUploadTime(3,"500", 3, "5")) != 0){
            System.out.print(ConsoleColors.GREEN_BOLD + CalcDownloadUploadTime.calcSecond(CalcDownloadUploadTime.calculateDownloadUploadTime(3,"500", 3, "5"))
                    + " seconds" + ConsoleColors.RESET);
        }
        System.out.println();

        //Test mode of Website Bandwidth Calculator
        //I used Page views = 5000 per month, Average page size = 500 Kilobytes, and Redundancy Factor = 2
        //as test inputs to test the Website Bandwidth Calculator
        System.out.println(ConsoleColors.RED_BOLD + "\n\t3. Website Bandwidth Calculator: \n" + ConsoleColors.RESET+
                "\t\tPage views = 5000 per month, Average page size = 500 Kilobytes, and Redundancy Factor = 2\n" +
                "\tShould give:\n" +
                ConsoleColors.GREEN_BOLD + "\t\tActual bandwidth needed is 0.0076051410753669 Mbits/s or 2.5 GB per month.\n" +
                "\t\tWith redundancy factor of 2, the bandwidth needed is 0.015210282150734 Mbits/s or 5 GB per month." + ConsoleColors.RESET);
        System.out.print("\tComputed Result:\n\t\t");
        double mbps = CalcWebsiteBandwidth.calcMBPS
                (6, "5000" , 2, "500", "2");
        double GBPerMonth = CalcWebsiteBandwidth.calcGBPM
                (6, "5000" , 2, "500", "2");
        double mbpsWFactor = CalcWebsiteBandwidth.calcMBPSwRedundancyFactor
                (6, "5000" , 2, "500", "2");
        double GBPerMonthWFactor = CalcWebsiteBandwidth.calcGBPMwRedundancyFactor
                (6, "5000" , 2, "500", "2");
        if (mbpsWFactor == 0){
            System.out.println(ConsoleColors.GREEN_BOLD + "Please provide a redundancy factor that is 1 or larger." + ConsoleColors.RESET);
        } else if (mbpsWFactor == mbps){
            System.out.println(ConsoleColors.GREEN_BOLD +"Actual bandwidth needed is " + mbps + " Mbits/s or " +
                    GBPerMonth + "  GB per month." + ConsoleColors.RESET);
        } else {
            System.out.println(ConsoleColors.GREEN_BOLD + "Actual bandwidth needed is " + mbps + " Mbits/s or " +
                    GBPerMonth + "  GB per month.\n\t\t" +
                    "With redundancy factor of 2, the bandwidth needed is " +
                    mbpsWFactor + " Mbits/s or " + GBPerMonthWFactor + " GB per month." + ConsoleColors.RESET);
        }

        //Test mode of Hosting Bandwidth Converter
        System.out.println(ConsoleColors.RED_BOLD + "\n\t4. Hosting Bandwidth Converter:" + ConsoleColors.RESET);
        //I used Monthly Usage = 1000 Gigabytes (GB)
        // as test inputs to test the Monthly Usage to Bandwidth converter
        System.out.println(ConsoleColors.RED +"\t   4.1 Monthly Usage to Bandwidth converter:" + ConsoleColors.RESET +" Monthly Usage = 1000 Gigabytes (GB) should give " + ConsoleColors.GREEN_BOLD + "3.042056430146779" + ConsoleColors.RESET +" Mbit/s.");
        System.out.println("\t   Converting Result: " + ConsoleColors.GREEN_BOLD + ConvertHostingBandwidth.calcMonthlyUsage2Bandwidth(4, "1000", 3) + ConsoleColors.RESET);

        //I used Bandwidth = 1000 Mbit/s.
        // as test inputs to test the Monthly Usage to Bandwidth converter
        System.out.println(ConsoleColors.RED + "\t   4.2 Bandwidth to Monthly Usage converter:" + ConsoleColors.RESET + " Bandwidth = 3.042056430146779 Mbit/s should give " + ConsoleColors.GREEN_BOLD + "1000" + ConsoleColors.RESET + " Gigabytes (GB).");
        System.out.println("\t   Converting Result: " + ConsoleColors.GREEN_BOLD + ConvertHostingBandwidth.calcBandwidth2MonthlyUsage(3, "3.042056430146779", 4) + ConsoleColors.RESET);
    }
}
