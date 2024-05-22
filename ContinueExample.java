public class ContinueExample {
    public static void main(String args[]) {
        int [] numbers = {10, 20, 30, 40, 5};
        for(int x : numbers ) {
            if( x == 30 ) {
                continue;
            }
            System.out.print( x );
            System.out.print("\n");
        }
    }

}