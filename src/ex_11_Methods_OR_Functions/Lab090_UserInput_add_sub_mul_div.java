package ex_11_Methods_OR_Functions;

public class Lab090_UserInput_add_sub_mul_div {
    public static void main(String[] args) {

int result_addition =addition(10,5);
        System.out.println(result_addition);
int result_subtraction =subtraction(10,5);
        System.out.println(result_subtraction);
int result_multiplication =multiplication(10,5);
        System.out.println(result_multiplication);
int result_divide =division(10,5);
        System.out.println(result_divide);
int result_modulus =modulus(10,5);
        System.out.println(result_modulus);
    }
     static int addition(int a, int b){
        return a+b;
    }
    static int subtraction(int a, int b){
        return a-b;
    }
    static int division(int a, int b){
        return a/b;
    }
    static int multiplication(int a, int b){
        return a*b;
    }
    static int modulus(int a, int b){
        return a%b;
    }
}
