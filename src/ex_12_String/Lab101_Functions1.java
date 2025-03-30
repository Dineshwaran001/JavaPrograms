package ex_12_String;

public class Lab101_Functions1 {
    public static void main(String[] args) {
        String name= "dinesh@waran@T";
        String [] str= name.split("@"); // we split at @ and store in String array
        System.out.println(str[0]);//dinesh
        System.out.println(str[1]);//waran
        System.out.println(str[2]);//T
        System.out.println(name.substring(1,4)); //d->0 i->1 start from 1 to 3 leave/ignore from 4
        System.out.println(name.substring(0,3)); //d->0 i->1 start from 0 ro 2 leave/ignore from 3
        System.out.println(name.startsWith("d")); // true
        System.out.println(name.endsWith("d"));// false

    }
}
