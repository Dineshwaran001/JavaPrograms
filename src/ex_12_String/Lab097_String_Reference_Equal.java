package ex_12_String;

public class Lab097_String_Reference_Equal {
    public static void main(String[] args) {
        String s1= "dinesh";// Stored in SCP
        String s2= "dinesh";// Stored in SCP

        String s3= new String("dinesh");// Stored in OA
        String s4= new String("dinesh");// Stored in SCP
        String s5= new String("dinesh");// Stored in SCP

        System.out.println(s1==s3);// this will false because one stored in SCP one in OA
        System.out.println(s1==s4);// this will false because one stored in SCP one in OA
        System.out.println(s2==s5);// this will false because one stored in SCP one in OA
        System.out.println(s1==s2);// this will true because both are stored in one memory
        System.out.println(s3==s5);// this will false because s3 stored new OA and s5 in new OA
        System.out.println(s4==s5);// this will false because one stored in new OA and one in new OA
    }
}
