import java.util.Scanner;

public class pattern_fourteen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number to print its table till 10:");
        int num = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }

    }
}
