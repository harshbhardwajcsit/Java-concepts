public class StringOperations {
    public static void main(String[] args) {
        String s1 = "harsh";
        String s2 = "harsh";
        StringBuilder s3 = new StringBuilder("harsh");
        StringBuilder s4 = new StringBuilder("harsh");
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1.equals(s3)); //false
        System.out.println(s3.equals(s4)); //false

        System.out.println(s1.compareTo(s2)); //true
        System.out.println(s1.compareTo(s3.toString())); //true

        s1.concat("bhardwaj");
        System.out.println(s1); //harsh

        s1 = s1.concat("bhardwaj");
        System.out.println(s1); //harsh bhardwaj
        System.out.println(s3.append(" bhardwaj")); //harsh bhardwaj
    }
}
