import java.util.Scanner;

public class benjamin_bulbs_fluct {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of bulbs:");
        int bulbs_number = scan.nextInt();
        System.out.print("Enter Voltage Fluctuation Count:");
        int fluct_number = scan.nextInt();

        for(int i=1; i<= bulbs_number; i++){
            if(i % fluct_number == 0){
                System.out.println(i+"th bulb will be turned ON");
            }
        }
    }
}
