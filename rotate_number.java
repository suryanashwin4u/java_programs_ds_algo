import java.util.Scanner;
public class rotate_number{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter Number to rotate:");
        int number = scan.nextInt();
        System.out.print("Enter index number for rotation either -ve or +ve in range less than number count:");
        int index = scan.nextInt();
        
        double rotatedNumber = 0;
        double lastDigits = 0;
        double divider = 0;
        int countNumberDigits = 0;
        int remainingDigitsCount = 0;

        if(index > 0){
            divider = Math.pow(10,index);
            lastDigits = number % divider;
            number = (int) (number / divider);
            countNumberDigits = Integer.toString(number).length();
            rotatedNumber = lastDigits * Math.pow(10,countNumberDigits) + number;
        }else{
            countNumberDigits = Integer.toString(number).length();
            remainingDigitsCount = countNumberDigits + index;
            divider = Math.pow(10,remainingDigitsCount);
            lastDigits = number % divider;
            number = (int) (number / divider);
            rotatedNumber = lastDigits * Math.pow(10,-index) + number;
        }

        System.out.print("Rotated number:" + rotatedNumber);
    }

}