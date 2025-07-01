package ex_25_Interface_Abstraction;

public class Lab164_ExampleInterfaceA {
}

class element extends IncompleteClass implements IncompleteInterface{

    @Override
    public void display() {
        System.out.println("we have rite our oun code here ");
    }
}

interface IncompleteInterface{
    int a =10;
    void display();
}
abstract class IncompleteClass{
    abstract void display();
}