package ex_013_String_Buffer_Builder;

public class Lab109_Function_Practice {
    public static void main(String[] args) {
        StringBuffer sf = new StringBuffer("Hello");
        sf.append(" world");
        System.out.println(sf);
        sf.setCharAt(5,',');// remove gap and placed ,
        System.out.println(sf);
//       sf.ensureCapacity(50); //ensures atleast this number of characters
//        System.out.println(sf);
//      sf.capacity();
//        System.out.println(sf);
        String firstPgm =sf.toString();// converts string buffer to string
        System.out.println(firstPgm);
        char ch = sf.charAt(1);// it will start from 0 show which char at 1
        System.out.println("char at-->"+ ch);
        sf.replace(1,4,"z");// H ->ell ->123 removed and o printed remaining printed
        System.out.println(sf);
        sf.delete(1,3);
        System.out.println(sf);
        sf.deleteCharAt(3);
        System.out.println(sf);
        sf.reverse();
        System.out.println("It will reverse"+ sf);
        sf.append("hello world");



    }
}
