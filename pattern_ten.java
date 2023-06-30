import java.util.Scanner;

public class pattern_ten {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of rows:");

        int rows = scan.nextInt();
        int outerSpace = rows / 2;
        int innerSpace = -1;

        // this loop is for rows
        for (int i = 1; i <= rows; i++) {

            // this loop is to print outerspace in a line
            for (int j = 1; j <= outerSpace; j++) {
                System.out.print(" ");
            }

            System.out.print("*"); // this is to print star

            // this loop is to print innerspace in a line
            for (int j = 1; j <= innerSpace; j++) {
                System.out.print(" ");
            }

            // if it is not first and last row then again print another star
            if (i > 1 && i < rows) {
                System.out.print("*");
            }

            // changing logic
            if (i <= rows / 2) {
                outerSpace--;
                innerSpace = innerSpace + 2;
            } else {
                outerSpace++;
                innerSpace = innerSpace - 2;
            }

            System.out.println(); // to print new line
        }
    }
}
