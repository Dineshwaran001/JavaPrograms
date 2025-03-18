package ex_04_TernaryOperator;

public class Lab023_TernaryOperator {
    public static void main(String[] args) {
        int age=10;          //condition  /condition satisfied /not satisfied
            String voteOrNot= age>=18 ? "Yes you can vote" : "No, you cant vote";
        System.out.println(voteOrNot);

        int number= -5;
        String result = number > 0 ? "Positive" : "Negative";
        System.out.println(result);
    }
}
