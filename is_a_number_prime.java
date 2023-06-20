import java.util.*;

public class is_a_number_prime {
    public static void main(String[] args){
        System.out.print("Enter any number:");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int count = 0;

        if(number <= 1){
            System.out.println("This is not a prime number");
            System.exit(0);
        }
        
        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                count++;
            }
        }

        if(count == 2){
            System.out.println("This number is a prime number");
        }else{
            System.out.println("This is not a prime number");
        }
    }
}