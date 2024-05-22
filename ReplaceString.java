public class ReplaceString{
    public static void main(String args[]) {
        String originalString = "Java for dummies";
        String newString = originalString.replace("dummies","experts");
        System.out.println("Original string is: " + originalString);
        System.out.println("New String is: " + newString);
    }
}