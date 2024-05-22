class RemoveSpacesInString{
    public static void main(String []args){
        String s1 = "Interview Questions for Java";
        String newString = s1.replaceAll("\\s","");
        System.out.println("Old String: " + s1);
        System.out.println("New String: " + newString);
    }
}