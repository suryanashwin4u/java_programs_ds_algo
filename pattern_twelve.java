import java.util.Scanner;

public class pattern_twelve {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of rows:");
        int rows = scan.nextInt();

        int a = 0;
        int b = 1;
        int sum = 0;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                // fibonacci series in a triangular pattern
                System.out.print(sum + " ");
                sum = a + b;
                a = b;
                b = sum;
            }
            System.out.println();
        }
    }
}
