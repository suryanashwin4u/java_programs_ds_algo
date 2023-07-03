import java.util.Scanner;

public class pattern_nineteen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows:");

        int total_rows = scan.nextInt();
        int total_cols = total_rows;

        for (int row_no = 1; row_no <= total_rows; row_no++) { // for row wise iteration
            for (int col_no = 1; col_no <= total_cols; col_no++) { // for column iteration
                if (row_no == 1) { // if first row
                    if (col_no == total_rows || col_no <= total_rows / 2 + 1) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                } else if (row_no <= total_rows / 2) {
                    if (col_no == total_rows || col_no == total_rows / 2 + 1) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                } else if (row_no == total_rows / 2 + 1) {
                    System.out.print(" * ");
                } else if (row_no < total_rows) {
                    if (col_no == 1 || col_no == total_rows / 2 + 1) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                } else {
                    if (col_no == 1 || col_no >= total_rows / 2 + 1) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                }
            }
            System.out.println();
        }
    }
}