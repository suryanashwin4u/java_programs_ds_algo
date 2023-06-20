import java.util.*;

public class print_fibonacci_numbers{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter numbers in a fibonacci series:");
        int number = scan.nextInt();

        int a = 0;
        int b = 1;
        int c = 0;
        int count = 0;
        while(count < number){
            System.out.println(c);
            a = b;
            b = c;
            c = a + b; 
            count++;
        }
    }
}