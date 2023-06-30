import java.util.Scanner;

public class pattern_fifteen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of rows:");

        int rows = scan.nextInt();
        int space = rows / 2;
        int num = 1;
        int val = 1;

        // this loop is for rows
        for (int i = 1; i <= rows; i++) {

            // this loop is to print spaces in one line
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            int col_val = val;
            // this loop is to print numbers in one line
            for (int j = 1; j <= num; j++) {
                System.out.print(col_val + " ");
                if (j <= num / 2) {
                    col_val++;
                } else {
                    col_val--;
                }
            }

            if (i <= rows / 2) {
                space--;
                num += 2;
                val++;
            } else {
                space++;
                num -= 2;
                val--;
            }

            System.out.println();// to jump at next line
        }
    }
}
