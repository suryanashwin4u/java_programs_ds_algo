import java.util.Scanner;

public class pattern_three {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of rows:");
        int rows = scan.nextInt();

        int space = rows - 1;
        int star = 1;

        // this loop is for rows
        for (int i = 1; i <= rows; i++) {

            // this loop is to print spaces in one line
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            // this loop is to print stars in one line
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }

            space--;
            star++;

            System.out.println();// to jump at next line
        }
    }
}
