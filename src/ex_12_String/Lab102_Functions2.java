package ex_12_String;

public class Lab102_Functions2 {
    public static void main(String[] args) {
        String name=" Dinesh Waran ";
        System.out.println(name); // this will print with gap exact same
        System.out.println(name.trim());// this will trim the space
        String str = "waran";
        System.out.println(str.compareTo("waran"));// it will return integer value 0 or some thing not true or false

        System.out.println(str.compareTo("Waran"));
        //they will compare with Unicode w->119 - W->87 thats why 32 is shown
    }
}
