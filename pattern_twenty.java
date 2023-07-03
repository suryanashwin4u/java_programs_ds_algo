
import java.util.Scanner;

public class pattern_twenty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows:");

        int rows = scan.nextInt();
        int cols = rows;

        for (int row_no = 1; row_no <= rows; row_no++) {
            for (int col_no = 1; col_no <= cols; col_no++) {
                if (col_no == 1 || col_no == rows) {
                    System.out.print(" * ");
                } else if (row_no > rows / 2 && (row_no == col_no || row_no + col_no == rows + 1)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }

            System.out.println();
        }
    }
}