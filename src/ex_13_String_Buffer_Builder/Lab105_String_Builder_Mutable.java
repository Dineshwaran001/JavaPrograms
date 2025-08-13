package ex_13_String_Buffer_Builder;

public class Lab105_String_Builder_Mutable {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("dinesh");
        name.append("waran");// append is almost similar to concat
        name.append(130);// append will also allow another data type
        System.out.println(name);// it will add both dinesh and waran-> dineshwaran
        //it is mutable so it will delete->dinesh from name and it will store dineshwaran
        System.out.println(name.reverse());
    }
}
