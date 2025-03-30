package ex_12_String;

public class Lab098_String_Content_Equal {
    public static void main(String[] args) {
        String s1= "dinesh";// Stored in SCP
        String s2= "dinesh";// Stored in SCP

        String s3= new String("dinesh");// Stored in OA
        String s4= new String("dinesh");// Stored in SCP
        String s5= new String("dinesh");// Stored in SCP
        String s6= new String("Dinesh");// Stored in SCP

        System.out.println(s1.equals(s3)); // this will compare the content-> true
        System.out.println(s1.equals(s4)); // this will compare the content-> true
        System.out.println(s1.equals(s5)); // this will compare the content-> true
        System.out.println(s1.equals(s2)); // this will compare the content-> true
        System.out.println(s1.equalsIgnoreCase(s6));// this false dinesh and Dinesh are not equal
        // we can ignore that using Ignore case
        // no matter what it will always match with small dinesh that is equal ignore case
    }
}
