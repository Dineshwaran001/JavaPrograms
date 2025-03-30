package ex_12_String;

public class Lab095_String_I_SCP {
    public static void main(String[] args) {
        String s1 = "dinesh";//SCP-> String contant pool
        String s2 = "dinesh";//SCP-> String contant pool
        String s3 = "dinesh";//SCP-> String contant pool
        // how many Strings are present in the String contant pool?
        //answer is 1
        //Because all are same name it will always point to the same name
        // so SCP will create only one name -> dinesh
        //Strings are Immutable
        //Strings constant pool will not have duplicate values
        //if the value is already present it will point to that value
    }
}
