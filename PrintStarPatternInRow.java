import java.util.Scanner;

public class PrintStarPatternInRow {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        
        printStars(rows);
    }

    public static void printStars(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}