import java.util.Scanner;

public class pattern_nine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number of Rows:");
        int rows = scan.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if ((i == j) || (i + j == rows + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}