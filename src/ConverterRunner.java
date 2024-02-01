import java.util.Scanner;
import java.util.Arrays;

class ConverterRunner {
    public static void main(String[] args) {
        System.out.println("Welcome to the Number Converter!");
        System.out.println("--------------------------------");
        System.out.print("Enter the base of your number: ");

        Scanner s = new Scanner(System.in);
        String choice = s.nextLine();
        int base = Integer.parseInt(choice);

        System.out.print("Enter your number: ");
        String number = s.nextLine();
        int n = Integer.parseInt(number);

        NumberConverter nc = new NumberConverter(n, base);

        boolean run = true;
        int convert = 0;
        while (run) {
            System.out.print("Select a base to convert to, 2-63: ");
            String baseConvert = s.nextLine();
            convert = Integer.parseInt(baseConvert);

            if (convert > 1 && convert < 64) {
                run = false;
                s.close();
            }
        }
        if (base == 10){
            System.out.println("\n\nBinary (base 2): " + nc.convertToBase(2));
            System.out.println("Octal (base 8): " + nc.convertToBase(8));
            System.out.println("Hex (base 16): " + nc.convertToBase(16));
            System.out.println("Selected base (base " + convert + "): " + nc.convertToBase(convert));
        }
        if (base == 2){
            System.out.println("\n\nDecimal (base 10): " + nc.convertToBase(10));
            System.out.println("Octal (base 8): " + nc.convertToBase(8));
            System.out.println("Hex (base 16): " + nc.convertToBase(16));
            System.out.println("Selected base (base " + convert + "): " + nc.convertToBase(convert));
        }
        if (base == 8) {
            System.out.println("\n\nDecimal (base 10): " + nc.convertToBase(10));
            System.out.println("Binary (base 2): " + nc.convertToBase(2));
            System.out.println("Hex (base 16): " + nc.convertToBase(16));
            System.out.println("Selected base (base " + convert + "): " + nc.convertToBase(convert));
        }
        if (base == 16){
            System.out.println("\n\nDecimal (base 10): " + nc.convertToBase(10));
            System.out.println("Binary (base 2): " + nc.convertToBase(2));
            System.out.println("Octal (base 8): " + nc.convertToBase(8));
            System.out.println("Selected base (base " + convert + "): " + nc.convertToBase(convert));

        }
        if (base != 2 && base != 8 && base != 10 && base != 16){
            System.out.println("\n\nDecimal (base 10): " + nc.convertToBase(10));
            System.out.println("Binary (base 2): " + nc.convertToBase(2));
            System.out.println("Octal (base 8): " + nc.convertToBase(8));
            System.out.println("Hex (base 16): " + nc.convertToBase(16));
            System.out.println("Selected base (base " + convert + "): " + nc.convertToBase(convert));
        }
    }
}

