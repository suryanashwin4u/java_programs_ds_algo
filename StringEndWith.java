public class StringEndWith{
 public static void main(String args[]) {
    String s1 = "Java is a programming language";
    
    //Check if string ends with particular character 
    boolean endsWithCharacter = s1.endsWith("e");
    System.out.println("String ends with character 'e': " + endsWithCharacter);
    
    //Check if string ends with particular text 
    boolean endsWithText = s1.endsWith("java");
    System.out.println("String ends with String 'lang': " + endsWithText);
 }
}