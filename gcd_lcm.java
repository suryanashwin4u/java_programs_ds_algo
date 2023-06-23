import java.util.Scanner;

public class gcd_lcm {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number higher than second:");
        int num_1 = scan.nextInt();
        System.out.print("Enter second number lower than first:");
        int num_2 = scan.nextInt();
        
        //for gcd
        int remainder = 0;
        while(num_2 % num_1 != 0){
            remainder = num_2 % num_1;
            num_2 = num_1;
            num_1 = remainder;
        }
        int gcd = remainder;

        //for lcm
        int lcm = 0;
        lcm = (num_1 * num_2)/gcd;

        System.out.println("gcd:" + gcd + " " + "lcm:" + lcm);
    }
}
