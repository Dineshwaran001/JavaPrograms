package ex_12_String;

public class Lab094_String_Function {
    public static void main(String[] args) {

        String name = "dinesh";
        System.out.println(name.toUpperCase());// change to capital
        System.out.println(name.toLowerCase());// change to small
        System.out.println(name.concat("Waran"));// merge the two values
        System.out.println(name.length()); // count the total values length
        System.out.println(name); // still name not changed because we are not assigned
    }
}
