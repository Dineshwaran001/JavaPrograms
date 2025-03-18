package ex_04_TernaryOperator;

public class Lab_024_TernaryNested {
    public static void main(String[] args) {
        int number =25;
                    //condition   expression1yes nested                    expression1 continueB
        String result= number>10 ? (number>20 ? "number>25": "number<20") :"number<10";
        //number>10 is true --> so it will go into 1st expression (number>20 ? "number>25": "number<20")
        //(number>20 ? "number>25": "number<20") in this expression--> number>20 condition is there
        //number >20 is true so it will execute 1st ?number>20 in output
        System.out.println("Output of --> number");
        System.out.println(result);



        int number$ = 11;
        //condition   expression1yes nested                    expression1 continueB
        String result1= number$>10 ? (number$>20 ? "number>25": "number<20") :"number<10";
        //if number >10 and when goes to condition -->number1>20
        //so it will execute--> number < 20 in output
        System.out.println("Output of --> number$");
        System.out.println(result1);

        int numbers =11;
        String result2= numbers <10 ? (numbers >20 ? "number>25": "number<20") :"number<10";
        // if number greater than 10 it will go --------------------------------------here
        System.out.println("Output of --> numbers");
        System.out.println(result2);




    }
}
