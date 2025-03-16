package ex_03_Operators;

public class Lab016_Gate_BODMAS {
    public static void main(String[] args) {
      int dineshSalary =10;
      Boolean b = !(dineshSalary>5 || dineshSalary<5);
      //dineshsalary>5 is true
        // ! change to false
        //dineshSalary< 5 is false
        // false || false = false is answer
        System.out.println(b);

    }
}
