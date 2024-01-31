import java.util.Scanner;
import java.util.Arrays;

class ConverterRunner {
    public static void main(String[] args) {
        System.out.println("Welcome to the Number Converter!");
        System.out.println("--------------------------------");
        System.out.print("Enter the base of your number (2, 8 or 10): ");

        Scanner s = new Scanner(System.in);
        String choice = s.nextLine();
        int base = Integer.parseInt(choice);

        System.out.print("Enter your number: ");
        String number = s.nextLine();
        int n = Integer.parseInt(number);

        s.close();

        NumberConverter nc = new NumberConverter(n, base);
        System.out.println("\n\nBinary number: " + nc.convertToBase(2));
        System.out.println("Octal number: " + nc.convertToBase(8));
        System.out.println("Decimal: " + nc.convertToBase(10));
        System.out.println("Hex: " + nc.convertToBase(16));
        System.out.println("32: " + nc.convertToBase(32));
        System.out.println("64: " + nc.convertToBase(64));

    }
}

