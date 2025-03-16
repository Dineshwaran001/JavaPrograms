package ex_03_Operators;

public class Lab013_concat {
    public static void main(String[] args) {
        String firstName= "Dinesh";
        String lastName= "Waran";
           int a=5;
           int b=10;
           // below statement will return DineshWaran510
        // it will not return Dineshwaran510 because initially it is string
        //so it will consider remaining also same as String
        //the moment they see first two operator are string they treat remaing as the string
        System.out.println(firstName + lastName + a+b);


        System.out.println(a+b+ firstName+lastName);
        // this statement first add a and b, and see string will not have any mathematical operation
        // so only concatenation will happen with Sting
        // result will be 15DineshWaran


        System.out.println(firstName + lastName + (a+b));
        // BODMAS operation also give result like above program--> within bracket we use

        System.out.println(firstName + a+b);
        // this also like first sout program


    }
}
