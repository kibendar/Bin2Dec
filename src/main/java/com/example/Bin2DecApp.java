package com.example;

import java.util.Scanner;

public class Bin2DecApp {

    // field for DI(dependency injection)
    private final Convertor convertor;

    // constructor for DI(dependency injection)
    public Bin2DecApp(Convertor convertor) {
        this.convertor = convertor;
    }

    // method run() for work with method convertBinToDec() from Bin2DecConvertor
    public void run(String input) {
        int result = convertor.convertBinToDec(input);

        // output the result of conversion
        System.out.println(result);
    }

    public static void main(String[] args) {

        Validator validator = new Validator();


        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("\n=== Binary to Decimal Converter ===");
            System.out.println("Examples of valid inputs: '1010' (equals 10), '1111' (equals 15)");
            System.out.println("You can convert up to 8 numbers in one session");
            System.out.println("(Press ENTER without typing to exit early)\n");
            System.out.println("Enter a binary number (0s and 1s only), (like 1010): ");


            int count = 0;

            String input = "";

            while (count < 8) {

                System.out.print("\nBinary number " + (count + 1) + "/8: ");
                input = scanner.nextLine().trim();

                if (validator.validateIf(input)) {
                    continue;
                }

                count++;
            }

            if (count > 0) {
                System.out.println("\nSummary: Converted " + count + " numbers");
            }

            // create object 'convert' for Convertor
            Convertor convert = new Bin2DecConvertor();

            // create object 'app' for use the method run()
            Bin2DecApp app = new Bin2DecApp(convert);

            app.run(input);
        }
    }
}

