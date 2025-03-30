package ex_12_String;

public class Lab093_String_Concat {
    public static void main(String[] args) {
        String s1= "dinesh"; //s1 value is dinesh

        s1= s1.concat("waran");//s1 value change to dineshwaran-> because we are assigned
        //totally we have 2 values in String constant pool
        System.out.println(s1);// this will print latest value ->dineshwaran
    }
}
