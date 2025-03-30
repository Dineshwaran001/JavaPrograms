package ex_12_String;

public class Lab092_String_Immutable {
    public static void main(String[] args) {
        String name = "dinesh";
        name.toUpperCase();
        System.out.println(name);// this will print only  lower case because it will point to name
        // we are pointing to the old name in the above statement thats why old name is printed
        name=name.toUpperCase();// we assigned name =upper case so Capital will print
        System.out.println(name);// this will print upper case because now we assigned to name above
    }
}
