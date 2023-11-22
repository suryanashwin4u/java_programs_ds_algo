import java.util.*;

// public class is_a_number_prime_prog_1 {
//     public static void main(String[] args) {
//         System.out.print("Enter any number:");
//         Scanner scan = new Scanner(System.in);
//         int number = scan.nextInt();
//         int count = 0;

//         if (number <= 1) {
//             System.out.println("This is not a prime number");
//             System.exit(0);
//         }

//         for (int i = 1; i <= number; i++) {
//             if (number % i == 0) {
//                 count++;
//             }
//         }

//         if (count == 2) {
//             System.out.println("This number is a prime number");
//         } else {
//             System.out.println("This is not a prime number");
//         }
//     }
// }

//better approach
public class is_a_number_prime_prog_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Amount of Numbers:");
        int amt = scan.nextInt();

        for (int i = 0; i < amt; i++) {
            System.out.print("Enter Number:");

            int num = scan.nextInt();
            int count = 0;

            for (int div = 2; div * div <= num; div++) {
                if (num % div == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println("status: prime number");
            } else {
                System.out.println("status: not a prime number");
            }
        }
    }
}