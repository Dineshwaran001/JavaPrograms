package ex_25_Interface_Abstraction;

interface Father{
    void Money(); // interface only have the incomplete method
 }
interface Mother{
    void Money();
}

class child implements Father, Mother{ // multiple inheritance can be achieved by interface


    @Override // ex_25_Interface_Abstraction.child method is going to complete the method
    public void Money() {
        System.out.println("ex_25_Interface_Abstraction.child money");
    }
}