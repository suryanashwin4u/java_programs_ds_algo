import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter input string");
        String s1 = sc.next();
        String s2 = reverseString(s1);
        
        System.out.println("Reversed String is: "+s2);
    }

    public static String reverseString(String s){
        String rev="";
        char[] arr = s.toCharArray();
        
        for(int i=arr.length-1;i>=0;i--)
        rev = rev + arr[i];
        return rev;
    }
}