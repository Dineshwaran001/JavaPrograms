package ex_25_Interface_Abstraction;


interface Father{
    void Money(); // interface only have the incomplete method
 }
interface Mother{
    void Money();
}

class Child implements Father, Mother{ // multiple inheritance can be achieved by interface


    @Override // ex_25_Interface_Abstraction.child method is going to complete the method
    public void Money() {
        System.out.println("child money");
    }

    public static void main(String[] args) {
        Child ch = new Child();
        ch.Money();
    }
}