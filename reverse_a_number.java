import java.util.Scanner;

public class reverse_a_number {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number to do reverse:");
        int number = scan.nextInt();
        int reverseNumber = 0;
        int digit = 0;

        int countDigits = reverse_a_number.returnDigitsCount(number);

        while(number != 0){
            digit = number % 10;
            number = number / 10;
            reverseNumber += digit * Math.pow(10, --countDigits);
        }

        System.out.println(reverseNumber);
    }

    public static int returnDigitsCount(int num){
        int countDigits = 0;
        while(num != 0){
            num = num / 10;
            countDigits++;
        }
        return countDigits;
    }
}
