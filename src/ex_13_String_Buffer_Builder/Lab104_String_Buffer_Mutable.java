package ex_13_String_Buffer_Builder;

public class Lab104_String_Buffer_Mutable {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer("dinesh");
        name.append("waran");// append is almost similar to concat
        name.append(130);// append will also allow another data type
        System.out.println(name);// it will add both dinesh and waran-> dineshwaran
        //it is mutable so it will delete->dinesh from name and it will store dineshwaran
        System.out.println(name.reverse());

    }
}
