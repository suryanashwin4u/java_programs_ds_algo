import java.util.Scanner;

public class pattern_eight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int rows = scan.nextInt();

        int space = rows - 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
            space--;
        }
    }
}