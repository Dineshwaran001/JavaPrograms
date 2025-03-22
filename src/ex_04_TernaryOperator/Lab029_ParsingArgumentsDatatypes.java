package ex_04_TernaryOperator;

public class Lab029_ParsingArgumentsDatatypes {
    public static void main(String[] args) {
      //  Parsing arguments via CLI
        String age = args[0];
        String age1 = args[1];
        String age2 = args[2];
        String age3 = args[3];
        //below code is correct
        int ageInt = Integer.parseInt(age);
        int ageInt1 = Integer.parseInt(age1);
        int ageInt2 = Integer.parseInt(age2);
        int ageInt3 = Integer.parseInt(age3);
        //below code is not correct
        int allAge = Integer.parseInt(age+age1+age2+age3);
        //below will print all the numbers by addition
        int addAges = ageInt +ageInt1+ ageInt2+ ageInt3;
        System.out.println(ageInt);
        System.out.println(ageInt1);
        System.out.println(ageInt2);
        System.out.println(ageInt3);
        System.out.println(allAge);// this line execute all the age number in one line
        System.out.println(addAges);// this will give the sum(total additon values)
    }
}
