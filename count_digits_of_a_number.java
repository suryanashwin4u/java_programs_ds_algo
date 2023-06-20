import java.util.Scanner;

public class count_digits_of_a_number {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number:");
        int number = scan.nextInt();

        int countDigits = 0;

        while(number != 0){
            number = number / 10;
            countDigits++;
        }

        System.out.println(countDigits);
    }
}
