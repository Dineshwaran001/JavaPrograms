package ex_25_Interface_Abstraction;

public class Lab164_ExampleInterfaceA {
    public static void main(String[] args) {
        element ele = new element();
        ele.display();
    }
}

class element extends IncompleteClass implements IncompleteInterface{

    @Override
    public void display() {
        System.out.println("we have write our oun code here ");
    }
}

interface IncompleteInterface{
    int a =10;
    void display();
}
abstract class IncompleteClass{
    abstract void display();
}