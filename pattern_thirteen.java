import java.util.Scanner;

public class pattern_thirteen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of rows:");
        int rows = scan.nextInt();

        for (int i = 0; i < rows; i++) {
            int icj = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(icj + " ");
                icj = icj * (i - j) / (j + 1); // using combination and permutation to calculate next value
            }
            System.out.println();
        }
    }
}
