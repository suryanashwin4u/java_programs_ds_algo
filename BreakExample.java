import java.util.Scanner;

class BreakExample {
    public static void main(String[] args) {
        Double number, sum = 0.0;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number: ");
            number = input.nextDouble();
            if (number < 0.0) {
                break;
            }
            sum += number;
        }
        System.out.println("Sum = " + sum);
    }
}