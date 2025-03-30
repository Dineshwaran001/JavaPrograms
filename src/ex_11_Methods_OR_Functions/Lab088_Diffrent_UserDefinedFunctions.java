package ex_11_Methods_OR_Functions;

public class Lab088_Diffrent_UserDefinedFunctions {
    public static void main(String[] args) {
  // 1.without Argument/Parameters and without return type

        wopwor1(); // we cannot assign it to a value only we can call it--> void

 // 2.without Argument/Parameters and with return type
        //wop_wr2(); // this will print only inside this functions
        String result_of_wop_wr2= wop_wr2();// this will store wop_wr2 function value in result_of_wop_wr2 variable
        System.out.println(result_of_wop_wr2);// if you print you will see the result

        //3.with parameter without return type
        wpwor1("dinesh",19,520.05d);// this will go to the below function as input
        wpwor1("waran",29,518.65d); // and it will assign the value to it and print
        System.out.println("it is void so you cannot assign it to a value");

        //with paramter with return type
        int with_return_type= wpwr(5,10);
        System.out.println(with_return_type);// you can check the return value
    }
    static void wopwor1(){
        System.out.println("without Argument/Parameters and without return type");
    }
    static String wop_wr2(){
        System.out.println("without Argument/Parameters and with return type");
        System.out.println("return only return a value not print statement");
        return "Hi this is return when you called this function and assign it to variable in main function";
    }
    static void wpwor1(String name, int age, double salary){// PARAMETES CAN BE ANYTHING->DATA TYPE
        System.out.println("your name is->" + name +" " +"age is->"+age+" " + "Salary"+ salary);
        // ABOVE WE GIVE ARGUMENTS THAT WILL ASSIGN TO THE ABOVE PRINT STATEMENT AND PRINT IT
    }
    static int wpwr(int a,int b){
        System.out.println("this is with parameter with return type");
        return a+b;
    }

}
