import java.util.Scanner;

class decimal_to_anybase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Number in Decimals:");
        long number = scan.nextInt();
        System.out.print("Enter Base to Convert Into:");
        int base = scan.nextInt();

        int newNumber = 0;
        int remainder = 0;
        int multiple = 1;

        while (number != 0) {
            number = number / base;
            remainder = (int) (number % base);
            newNumber += remainder * multiple;
            multiple = multiple * 10;
        }

        System.out.print("New Number is:" + newNumber);
    }
}