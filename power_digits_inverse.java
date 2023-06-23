import java.util.Scanner;
public class power_digits_inverse{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number:");
        int number = scan.nextInt();

        double inverseNumber = 0;
        int lastDigit = 0;
        int indexNumber = 1;
        
        while(number != 0){
            lastDigit = number % 10;
            number = number / 10;
            inverseNumber = inverseNumber + indexNumber * Math.pow(10,lastDigit-1);
            indexNumber++;
        }

        System.out.print("Inverse of a number:" + (int)inverseNumber);
    }

}