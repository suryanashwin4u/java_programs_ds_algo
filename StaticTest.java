class StaticTest { 
    static int i; 
    int j; 
    // start of static block  
    static { 
        i = 10; 
        System.out.println("static block called "); 
    } 
    // end of static block  
}
class Main { 
    public static void main(String args[]) { 
        System.out.println(StaticTest.i);  
    } 
}