package ex_13_String_Buffer_Builder;

public class Lab106_String_builder {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer("dinesh");
        name.append("waran");// append is almost similar to concat
        name.append(130);// append will also allow another data type
        name.reverse();
        System.out.println(name);// it will print  dineshwaran130 in reverse

    }
}
