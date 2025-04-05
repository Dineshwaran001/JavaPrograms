package ex_013_String_Buffer_Builder;

public class Lab108_S_Builder_Function {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("dinesh");
        sb.append("waran");
        sb.reverse();// dineshwaran in reverse
        System.out.println(sb);// it will print narawhsenid
        sb.reverse(); // again reverse to original word dineshwaran
        sb.delete(0,6); // start from 0 to 6 but it will leave 6 th value 'w'
        System.out.println(sb);
        StringBuilder ub= new StringBuilder("java Program");
        System.out.println(ub);
        ub.replace(0,4,"C++");//start from 0 to 6 but it will not leave 4 th value 'a'
        System.out.println(ub);


    }
}
