import java.util.Scanner;

public class pattern_sixteen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of rows:");

        int rows = scan.nextInt();
        int space = 2 * rows - 3; // remember formula for space calculations
        int num = 1;

        // this loop is for rows
        for (int i = 1; i <= rows; i++) {
            int val = 1;

            // this loop is to print numbers in one line
            for (int j = 1; j <= num; j++) {
                System.out.print(val);
                val++;
            }

            // this loop is to print spaces in one line
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            if (i == rows) {
                num--;
                val--;
            }

            // this loop is to print numbers in one line
            for (int j = 1; j <= num; j++) {
                val--;
                System.out.print(val);
            }

            num++;
            space -= 2;

            System.out.println();// to jump at next line
        }
    }
}
