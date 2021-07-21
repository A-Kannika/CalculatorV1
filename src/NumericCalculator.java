/**
 * Create by Kannika Armstrong
 * TCSS305(Winter 2021): January 16, 2021
 * Programming assignment: Develop Multi-Function Calculator Version 1
 * Numerical Calculator
 * Professor. Kivanç A. Dincer, Ph.D.
 */

import java.util.Scanner;

public class NumericCalculator extends Calculator{

    public static void main(String[] args) {
        callConvertDecimal2Hex();
    }

    public static void callBinaryCalculation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(ConsoleColors.BLUE_BOLD + ConsoleColors.BLUE_UNDERLINED + "Binary Calculation:\n" + ConsoleColors.RESET);
        System.out.print(ConsoleColors.RED_BOLD + "Enter your first binary number: " + ConsoleColors.RESET);
        String input1 = scanner.nextLine();
        System.out.print(ConsoleColors.RED_BOLD + "Enter your second binary number: " + ConsoleColors.RESET);
        String input2 = scanner.nextLine();
        System.out.print(ConsoleColors.RED_BOLD + "\nSelect the operator: " + ConsoleColors.RESET
                + "\n\t1. Add:      Press" + ConsoleColors.PURPLE_BOLD + " +" + ConsoleColors.RESET
                + "\n\t2. Subtract: Press" + ConsoleColors.PURPLE_BOLD + " -" + ConsoleColors.RESET
                + "\n\t3. Multiply: Press" + ConsoleColors.PURPLE_BOLD + " *" + ConsoleColors.RESET
                + "\n\t4. Divide:   Press" + ConsoleColors.PURPLE_BOLD + " /" + ConsoleColors.RESET
                + ConsoleColors.RED_BOLD + "\nSelect your operator: " + ConsoleColors.RESET);
        String operator = scanner.nextLine();
        System.out.println(ConsoleColors.BLUE_BOLD + "\nResult: " + ConsoleColors.RESET);
        NumericCalculation.binaryCalculator(input1, input2, operator);
    }

    public static void callConvertBinary2Decimal(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(ConsoleColors.BLUE_BOLD + ConsoleColors.BLUE_UNDERLINED + "Convert Binary to Decimal:\n" + ConsoleColors.RESET);
        System.out.print(ConsoleColors.RED_BOLD + "Enter your binary number: " + ConsoleColors.RESET);
        String input = scanner.nextLine();
        System.out.println(ConsoleColors.BLUE_BOLD + "\nResult: " + ConsoleColors.RESET);
        ConvertNumeric.convertBin2Dec(input);
    }

    public static void callConvertDecimal2Binary(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(ConsoleColors.BLUE_BOLD + ConsoleColors.BLUE_UNDERLINED + "Convert Decimal to Binary:\n" + ConsoleColors.RESET);
        System.out.print(ConsoleColors.RED_BOLD + "Enter your decimal number: " + ConsoleColors.RESET);
        String input = scanner.nextLine();
        System.out.println(ConsoleColors.BLUE_BOLD + "\nResult: " + ConsoleColors.RESET);
        ConvertNumeric.convertDec2Bin(input);

    }

    public static void callHexCalculation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(ConsoleColors.BLUE_BOLD + ConsoleColors.BLUE_UNDERLINED + "Hex Calculation:\n" + ConsoleColors.RESET);
        System.out.print(ConsoleColors.RED_BOLD + "Enter your first hex number: " + ConsoleColors.RESET);
        String input1 = scanner.nextLine();
        System.out.print(ConsoleColors.RED_BOLD + "Enter your second hex number: " + ConsoleColors.RESET);
        String input2 = scanner.nextLine();
        System.out.print(ConsoleColors.RED_BOLD + "\nSelect the operator: " + ConsoleColors.RESET
                + "\n\t1. Add:      Press" + ConsoleColors.PURPLE_BOLD + " +" + ConsoleColors.RESET
                + "\n\t2. Subtract: Press" + ConsoleColors.PURPLE_BOLD + " -" + ConsoleColors.RESET
                + "\n\t3. Multiply: Press" + ConsoleColors.PURPLE_BOLD + " *" + ConsoleColors.RESET
                + "\n\t4. Divide:   Press" + ConsoleColors.PURPLE_BOLD + " /" + ConsoleColors.RESET
                + ConsoleColors.RED_BOLD + "\nSelect your operator: " + ConsoleColors.RESET);
        String operator = scanner.nextLine();
        System.out.println(ConsoleColors.BLUE_BOLD + "\nResult: " + ConsoleColors.RESET);
        NumericCalculation.hexCalculator(input1, input2, operator);

    }

    public static void callConvertHex2Decimal(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(ConsoleColors.BLUE_BOLD + ConsoleColors.BLUE_UNDERLINED + "Convert Hex to Decimal:\n" + ConsoleColors.RESET);
        System.out.print(ConsoleColors.RED_BOLD + "Enter your hexadecimal number: " + ConsoleColors.RESET);
        String input = scanner.nextLine();
        System.out.println(ConsoleColors.BLUE_BOLD + "\nResult: " + ConsoleColors.RESET);
        ConvertNumeric.convertHex2Dec(input);
    }

    public static void callConvertDecimal2Hex(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(ConsoleColors.BLUE_BOLD + ConsoleColors.BLUE_UNDERLINED + "Convert Decimal to Hex:\n" + ConsoleColors.RESET);
        System.out.print(ConsoleColors.RED_BOLD + "Enter your decimal number: " + ConsoleColors.RESET);
        String input = scanner.nextLine();
        System.out.println(ConsoleColors.BLUE_BOLD + "\nResult: " + ConsoleColors.RESET);
        ConvertNumeric.convertDec2Hex(input);
    }
}
