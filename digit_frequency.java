import java.util.Scanner;

class digit_frequency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Number:");
        long number = scan.nextInt();
        System.out.print("Enter Digit:");
        int digit = scan.nextInt();

        long lastDigit = 0;
        int count = 0;

        while (number != 0) {
            lastDigit = number % 10;
            number = number / 10;
            if (lastDigit == digit) {
                count++;
            }
        }

        System.out.println("Frequency of " + digit + " is: " + count);
    }
}