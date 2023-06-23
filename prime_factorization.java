import java.util.Scanner;

public class prime_factorization {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number:");
        int number = scan.nextInt();
        int divisor = 2;
        while(number != 1){
            if(number % divisor != 0){
                divisor++;
            }else{
                number = number / divisor;
                System.out.print(divisor+",");
            }
        }
    }
}
