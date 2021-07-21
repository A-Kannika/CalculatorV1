/**
 * Create by Kannika Armstrong
 * TCSS305(Winter 2021): January 16, 2021
 * Programming assignment: Develop Multi-Function Calculator Version 1
 * Convert Numeric
 * Professor. Kivanç A. Dincer, Ph.D.
 * The University of Washington Tacoma
 */

public class ConvertNumeric extends NumericCalculator{

    public static void main(String[] args) {
//        convertBin2Dec("10101010");
//        convertBin2Dec("-10101010");
//        convertBin2Dec("50");
//        convertBin2Dec("ert");
        convertDec2Bin("170");
        convertDec2Bin("-170");
        convertDec2Bin("rty");
        convertDec2Bin("-170.56");
        convertDec2Bin("170.99");
        convertDec2Bin("");
        convertDec2Bin("0");
//        convertHex2Dec("-DAd");
//        convertHex2Dec("dad");
//        convertHex2Dec("try");
//        convertHex2Dec("0");
//        convertDec2Hex("170");
//        convertDec2Hex("-170");
//        convertDec2Hex("try");
//        convertDec2Hex("");
//        convertDec2Hex("0");
//        convertDec2Hex("170.999");
//        convertDec2Hex("-170.56");
    }

    public static void convertBin2Dec(String input){
        String result = calcConvertBin2Dec(input);
        if (result.equals("-1")){
            System.out.println(ConsoleColors.RED_BOLD + "\tThe number need to contain 0 and 1 only." + ConsoleColors.RESET);
        } else {
            System.out.println("\tConverting Binary Value " + ConsoleColors.GREEN_BOLD + input + ConsoleColors.RESET
                    + " to Decimal value: " + ConsoleColors.GREEN_BOLD + result + ConsoleColors.RESET);
        }
    }

    public static String calcConvertBin2Dec(String input){
        String bin = CheckInput.checkBinary(input);
        int sum = 0;
        if (bin.equals("-1")){
            return "-1";
        } else {
            long binaryNumber = Long.parseLong(bin);
            for (int i = 0; i < bin.length(); i++) {
                int base = (int) (binaryNumber % 10);
                int pow = (int) Math.pow(2, i);
                sum += base * pow;
                binaryNumber /= 10;
            }
        }
        return ""+ sum;
    }

    public static void convertDec2Bin(String input){
        String result = calcConvertDec2Bin(input);
        if (result.equals("")){
//            System.out.print("");
            System.out.println(ConsoleColors.RED_BOLD + "\tThe number need to be numeric." + ConsoleColors.RESET);
        } else if (input.startsWith("-")) {
            int dec = (int) Math.floor(Double.parseDouble(input));
            System.out.println("\tConverting Decimal Value " + ConsoleColors.GREEN_BOLD + dec + ConsoleColors.RESET
                    + " to Binary value: " + ConsoleColors.GREEN_BOLD + "-" + result + ConsoleColors.RESET);
        } else {
            int dec = (int) Math.floor(Double.parseDouble(input));
            System.out.println("\tConverting Decimal Value " + ConsoleColors.GREEN_BOLD + dec + ConsoleColors.RESET
                    + " to Binary value: " + ConsoleColors.GREEN_BOLD + result + ConsoleColors.RESET);
        }
    }

    public static String calcConvertDec2Bin(String input){
        double dec = CheckInput.checkDecimal(input);
        int decimalNumber = (int) Math.floor(dec);
        String binaryNumber = "";
        StringBuilder binary = new StringBuilder();
        if (dec == Math.sqrt(-1)){
            return "";
        } else if (dec == 0.0){
            binary.insert(0,"0");
        } else if (decimalNumber > 0) {
            while (decimalNumber > 0) {
                if (decimalNumber % 2 == 0) {
                    binary.insert(0, "0");
                } else {
                    binary.insert(0, "1");
                }
                decimalNumber /= 2;
            }
        } else {
            while (decimalNumber < 0) {
                if (decimalNumber % 2 == 0) {
                    binary.insert(0, "0");
                } else {
                    binary.insert(0, "1");
                }
                decimalNumber /= 2;
            }
        }
        binaryNumber = binaryNumber + binary;
        return binaryNumber;
    }

    public static void convertHex2Dec(String input){
        String result = calcConvertHex2Dec(input);
        if (result.equals("Z")){
            //           System.out.print("");
            System.out.println(ConsoleColors.RED_BOLD + "\tThe number need to contain 0-9 and A-F only." + ConsoleColors.RESET);
        } else if (input.startsWith("-")) {
            System.out.println("\tConverting Hexadecimal Value " + ConsoleColors.GREEN_BOLD + input + ConsoleColors.RESET
                    + " to Decimal value: " + ConsoleColors.GREEN_BOLD + "-" + result + ConsoleColors.RESET);
        } else {
            System.out.println("\tConverting Hexadecimal Value " + ConsoleColors.GREEN_BOLD + input + ConsoleColors.RESET
                    + " to Decimal value: " + ConsoleColors.GREEN_BOLD + result + ConsoleColors.RESET);
        }
    }

    public static String calcConvertHex2Dec(String input) {
        String hex = CheckInput.checkHex(input).toUpperCase();
        String hexList = "0123456789ABCDEF";
        String hexOri = hex;
        int decSum = 0;
        String decNum = "";
        if (hex.equals("Z")){
            decNum = "Z" ;
        }else if (hex.startsWith("-")) {
            hex = hex.substring(1);
            for (int i = 0; i < hex.length(); i++) {
                char c = hex.charAt(i);
                int dec = hexList.indexOf(c);
                decSum = 16 * decSum + dec;
            }
            decNum += decSum;
        } else {
            for (int i = 0; i < input.length(); i++) {
                char c = hex.charAt(i);
                int dec = hexList.indexOf(c);
                decSum = 16 * decSum + dec;
            }
            decNum += decSum;
        }
        return decNum;
    }

    public static void convertDec2Hex(String input){
        String result = calcConvertDec2Hex(input);
        if (result.equals("")){
//            System.out.print("");
            System.out.println(ConsoleColors.RED_BOLD + "\tThe number need to be numeric." + ConsoleColors.RESET);
        } else {
            int dec = (int) Math.floor(Double.parseDouble(input));
            System.out.println("\tConverting Decimal Value " + ConsoleColors.GREEN_BOLD + dec + ConsoleColors.RESET
                    + " to Hexadecimal value: " + ConsoleColors.GREEN_BOLD + result + ConsoleColors.RESET);
        }
    }

    public static String calcConvertDec2Hex(String input){
        double dec = CheckInput.checkDecimal(input);
        int decimalNumber = (int) Math.floor(dec);
        int decimal = decimalNumber;
        String hexNum = "";

        int remainder = 0;   //store the remainder and use as the index of the hexList

        StringBuilder hexNumber = new StringBuilder();  // store the hexNumber
        char[] hexList = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        if (dec == 0.0){
            hexNum += 0;
        } else if (decimal > 0) {
            while (decimal > 0) {
                remainder = (decimal % 16);
                hexNumber.insert(0, hexList[remainder]);
                decimal /= 16;
            }
            hexNum += hexNumber;
        } else {
            if (decimal < 0) {
                int posDec = (int) Math.abs(decimal);
                while (posDec > 0) {
                    remainder = posDec % 16;
                    hexNumber.insert(0, hexList[remainder]);
                    posDec /= 16;
                }
                hexNum += "-" + hexNumber;
            }
        }
        return hexNum;
    }
}
