package ex_013_String_Buffer_Builder;

public class Lab107_StringB_B_Count {
    public static void main(String[] args) {
        String n1 = "dinesh";
        String n2 = new String("dinesh");
        StringBuffer stringBuffer= new StringBuffer("dinesh");
        StringBuilder stringBuilder= new StringBuilder("dinesh");
        System.out.println("Created in SCP"+ n1);
        System.out.println("Created in OA"+n2);
        System.out.println("Created in OA"+stringBuffer);
        System.out.println("Created in OA"+stringBuilder);
        System.out.println("total 4 Strings created");

    }
}
