import java.util.*;

// public class print_all_prime_numbers_between_given_range {
// public static void main(String args[]){
// Scanner scan = new Scanner(System.in);

// System.out.print("Enter lower number:");
// int lowerRange = scan.nextInt();

// System.out.print("Enter higher number:");
// int higherRange = scan.nextInt();

// for(int number = lowerRange; number <= higherRange; number++){
// boolean isPrime =
// print_all_prime_numbers_between_given_range.checkPrime(number);

// if(isPrime){
// System.out.println(number);
// }
// }
// }

// public static boolean checkPrime(int num){
// if(num >= 2){
// for(int i = 2; i < num ; i++){
// if(num % i == 0){
// return false;
// }
// }
// }else{
// return false;
// }
// return true;
// }
// }

//better approach
public class print_all_prime_numbers_between_given_range {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter low:");
        int low = scan.nextInt();
        System.out.print("Enter high:");
        int high = scan.nextInt();
        System.out.println("Prime Numbers:");

        for (int num = low; num <= high; num++) {
            int count = 0;
            for (int div = 2; div * div <= num; div++) {
                if (num % div == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println(num);
            }
        }
    }
}