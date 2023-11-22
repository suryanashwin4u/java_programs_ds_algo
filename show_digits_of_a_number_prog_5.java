import java.util.Scanner;

public class show_digits_of_a_number_prog_5 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number:");
        int number = scan.nextInt();

        int digit;

        while (number != 0) {
            digit = number % 10;
            number = number / 10;
            System.out.println(digit);
        }
    }
}
