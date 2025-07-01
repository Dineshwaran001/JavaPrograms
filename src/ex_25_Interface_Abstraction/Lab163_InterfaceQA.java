package ex_25_Interface_Abstraction;

public class Lab163_InterfaceQA {
}
 interface I1{}
 interface I2{}
interface I3{}
class BB1{}
class AA1 {} // Concrete class (Complete class)

abstract class ab{ // this is incomplete class
    abstract void incomplete();
}

 class Z1 extends AA1{} // possible
//class Z1 extends AA1 ,BB1{} // multiple inheritance not possible in class

class ZZ1 implements I1{}
class ZZ2 implements I1,I2{} //one class implement two interface posiible
class ZZ3 extends AA1 implements I1, I2,I3{} // first extend before and implement posible
//class ZZ4 implements I1 extends AA1{} // implement and extend not possible
//interface I1 extends AA1{} // not possible interface always implements
