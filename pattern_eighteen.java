import java.util.Scanner;

public class pattern_eighteen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows:");

        int rows = scan.nextInt();
        int star = rows;
        int space = 0;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= star; j++) {
                if (i > 1 && i <= rows / 2 && j > 1 && j < star) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            if (i <= rows / 2) {
                star -= 2;
                space++;
            } else {
                star += 2;
                space--;
            }

            System.out.println();
        }
    }
}