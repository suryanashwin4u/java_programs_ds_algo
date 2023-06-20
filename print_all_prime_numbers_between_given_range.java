import java.util.*;

public class print_all_prime_numbers_between_given_range {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter lower number:");
        int lowerRange = scan.nextInt();

        System.out.print("Enter higher number:");
        int higherRange = scan.nextInt();

        for(int number = lowerRange; number <= higherRange; number++){
            boolean isPrime = print_all_prime_numbers_between_given_range.checkPrime(number);

            if(isPrime){
                System.out.println(number);
            }
        }
    }
    
    public static boolean checkPrime(int num){
        if(num >= 2){
            for(int i = 2; i < num ; i++){
                if(num % i == 0){
                    return false;
                }
            }
        }else{
            return false;
        }
        return true;
    }
}