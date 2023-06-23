import java.util.Scanner;

public class pythagoros_triplets {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first side(highest):");
        int side_1 = scan.nextInt();
        System.out.print("Enter second side(middle):");
        int side_2 = scan.nextInt();
        System.out.print("Enter third side(lowest):");
        int side_3 = scan.nextInt();

        double side_1_sqr = Math.pow(side_1,2);
        double side_2_sqr = Math.pow(side_2,2);
        double side_3_sqr = Math.pow(side_3,2);

        if(side_1_sqr == side_2_sqr + side_3_sqr){
            System.out.print("It is a pythagorous triplet");
        }else{
            System.out.print("It is not a pythagorous triplet");
        }
    }
}
