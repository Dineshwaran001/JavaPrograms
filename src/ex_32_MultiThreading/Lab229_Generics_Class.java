package ex_32_MultiThreading;

public class Lab229_Generics_Class {
    public static void main(String[] args) {
        Test<Integer> InTeg = new Test<Integer>(45);
        Test<Double> Dble = new Test<Double>(45.22);
        Test<Character> CHA = new Test<Character>('a');
        System.out.println(InTeg.getObject()); // getObject method is used to retrieve value
        System.out.println(Dble.getObject());
        System.out.println(CHA.getObject());
    }
}

class Test <T>{
    T obj;   // it is like datatype and reference

     Test(T obj) {
        this.obj = obj;
    }
    public T getObject(){
         return this.obj;
    }
}
