/**
 * Create by Kannika Armstrong
 * TCSS305(Winter 2021): January 16, 2021
 * Programming assignment: Develop Multi-Function Calculator Version 1
 * Calculate main class
 * Professor. Kivanç A. Dincer, Ph.D.
 */

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        calculator();
    }

    public static void calculator(){
        Scanner scanner = new Scanner(System.in);

        System.out.println(ConsoleColors.BLUE_BOLD + ConsoleColors.BLUE_UNDERLINED + "Calculator:" + ConsoleColors.RESET);

        System.out.print(ConsoleColors.RED_BOLD + "\nSelect Calculator Function: " + ConsoleColors.RESET
                + ConsoleColors.PURPLE_BOLD + "\n\tNumeric Calculator Function" + ConsoleColors.RESET
                + "\n\t\t 1. Binary Calculation:         Press" + ConsoleColors.PURPLE_BOLD + " 1" + ConsoleColors.RESET
                + "\n\t\t 2. Convert Binary to Decimal:  Press" + ConsoleColors.PURPLE_BOLD + " 2" + ConsoleColors.RESET
                + "\n\t\t 3. Convert Decimal to Binary:  Press" + ConsoleColors.PURPLE_BOLD + " 3" + ConsoleColors.RESET
                + "\n\t\t 4. Hex Calculation:            Press" + ConsoleColors.PURPLE_BOLD + " 4" + ConsoleColors.RESET
                + "\n\t\t 5. Convert Hex to Decimal:     Press" + ConsoleColors.PURPLE_BOLD + " 5" + ConsoleColors.RESET
                + "\n\t\t 6. Convert Decimal to Hex:     Press" + ConsoleColors.PURPLE_BOLD + " 6" + ConsoleColors.RESET
                + ConsoleColors.PURPLE_BOLD + "\n\tBandwidth Calculator Function" + ConsoleColors.RESET
                + "\n\t\t 7. Data Unit Converter:             Press" + ConsoleColors.PURPLE_BOLD + " 7" + ConsoleColors.RESET
                + "\n\t\t 8. Download/Upload Time Calculator: Press" + ConsoleColors.PURPLE_BOLD + " 8" + ConsoleColors.RESET
                + "\n\t\t 9. Website Bandwidth Calculator:    Press" + ConsoleColors.PURPLE_BOLD + " 9" + ConsoleColors.RESET
                + "\n\t\t10. Hosting Bandwidth Converter:     Press" + ConsoleColors.PURPLE_BOLD + " 10" + ConsoleColors.RESET
                + ConsoleColors.PURPLE_BOLD + "\n\tRun Test Program" + ConsoleColors.RESET
                + "\n\t\t11. Run Test Mode:  Press" + ConsoleColors.PURPLE_BOLD + " 11" + ConsoleColors.RESET
                + ConsoleColors.RED_BOLD + "\nSelect Your Calculation Function: " + ConsoleColors.RESET);
        int unit = scanner.nextInt();
        switch (unit){
            case 1:
                System.out.println(ConsoleColors.GREEN_BOLD + "\nYou select Binary Calculation function\n" + ConsoleColors.RESET);
                NumericCalculator.callBinaryCalculation();
                break;
            case 2:
                System.out.println(ConsoleColors.GREEN_BOLD + "\nYou select Convert Binary to Decimal function.\n" + ConsoleColors.RESET);
                NumericCalculator.callConvertBinary2Decimal();
                break;
            case 3:
                System.out.println(ConsoleColors.GREEN_BOLD + "\nYou select Convert Decimal to Binary function.\n" + ConsoleColors.RESET);
                NumericCalculator.callConvertDecimal2Binary();
                break;
            case 4:
                System.out.println(ConsoleColors.GREEN_BOLD + "\nYou select Hex Calculation function.\n" + ConsoleColors.RESET);
                NumericCalculator.callHexCalculation();
                break;
            case 5:
                System.out.println(ConsoleColors.GREEN_BOLD + "\nYou select Convert Hex to Decimal function.\n" + ConsoleColors.RESET);
                NumericCalculator.callConvertHex2Decimal();
                break;
            case 6:
                System.out.println(ConsoleColors.GREEN_BOLD + "\nYou select Convert Decimal to Hex function.\n" + ConsoleColors.RESET);
                NumericCalculator.callConvertDecimal2Hex();
                break;
            case 7:
                System.out.println(ConsoleColors.GREEN_BOLD + "\nYou select Data Unit Converter function.\n" + ConsoleColors.RESET);
                BandwidthCalculator.callConvertDataUnit();
                break;
            case 8:
                System.out.println(ConsoleColors.GREEN_BOLD + "\nYou select Download/Upload Time Calculator function.\n" + ConsoleColors.RESET);
                BandwidthCalculator.callCalcDownloadUploadTime();
                break;
            case 9:
                System.out.println(ConsoleColors.GREEN_BOLD + "\nYou select Website Bandwidth Calculator function.\n" + ConsoleColors.RESET);
                BandwidthCalculator.callCalcWebsiteBandwidth();
                break;
            case 10:
                System.out.println(ConsoleColors.GREEN_BOLD + "\nYou select Hosting Bandwidth Converter function.\n" + ConsoleColors.RESET);
                BandwidthCalculator.callConvertHostingBandwidth();
                break;
            case 11:
                System.out.println(ConsoleColors.GREEN_BOLD + "\nYou select Run Test Mode.\n" + ConsoleColors.RESET);
                RunTest.runTest();
                break;
            default:
                System.out.println(ConsoleColors.RED_BOLD + "\tYou choose invalid Function!" + ConsoleColors.RESET);
                break;
        }
    }
}
