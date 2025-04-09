package ex_017_Constructor;

public class Lab134_DefaultConstructor {
    public static void main(String[] args) {
        Default_Constructor dc = new Default_Constructor();// it will automatically call constructor
    }
}
class Default_Constructor{
    String name;

    Default_Constructor(){
        System.out.println("this is  Default constructor");
        System.out.println("constructor name and class name should be same");
        System.out.println("when the object [in main()] is created constructor is automatically called");
    }
}
