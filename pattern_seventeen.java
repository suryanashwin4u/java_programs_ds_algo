import java.util.Scanner;

public class pattern_seventeen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows:");

        int rows = scan.nextInt();
        int space = rows / 2;
        int star = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= space; j++) {
                if (i == rows / 2 + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }

            if (i <= rows / 2) {
                star++;
            } else {
                star--;
            }

            System.out.println();
        }
    }
}