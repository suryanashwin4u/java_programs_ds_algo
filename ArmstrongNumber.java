import java.util.Scanner;

public class ArmstrongNumber {
     public static void main(String[] args){
         int c=0,a,temp;
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Enter a number");
         int num = sc.nextInt();
         
         temp = num;
        
         while(num>0){
             a=num%10;
             num=num/10;
             c=c+(a*a*a);
         }
         
         if(temp==c) { 
            System.out.println(temp +  " is an Armstrong number");
         } else
             System.out.println(temp + " is not an armstrong number");
        }
 }