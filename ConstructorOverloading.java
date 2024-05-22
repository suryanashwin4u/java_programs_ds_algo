class ConstructorOverloading 
{ 
    double width, height, depth; 
    int boxNo;  
    
    ConstructorOverloading(double w, double h, double d, int num) 
    { 
        width = w; 
        height = h; 
        depth = d; 
        boxNo = num; 
    } 
   
    ConstructorOverloading() 
    { 
        width = height = depth = 0; 
    } 
   
    ConstructorOverloading(int num) 
    { 
        this(); 
        boxNo = num; 
    } 
    public static void main(String[] args) 
    { 
        ConstructorOverloading box1 = new ConstructorOverloading(1); 
        System.out.println(box1.width); 
    } 
}