public class FindSubString {
    public static void main(String[] args) {
        String name = "Selenium And Java Interview Questions ashwani kumar";
        System.out.println(name.contains("Java"));         // true
        System.out.println(name.contains("java"));         // false
        System.out.println(name.contains("Interview"));    // true
        System.out.println(name.contains("questions"));    // false 
        System.out.println(name.contains("ashwani kumar"));
    }
}