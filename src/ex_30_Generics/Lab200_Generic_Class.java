package ex_30_Generics;

public class Lab200_Generic_Class {
    GenericClass<Integer> intObjRef = new GenericClass (5);
    GenericClass<String> stringObjRef = new GenericClass ("Dinesh");

}

class GenericClass<T>{
// T is a place holder only ---> it can be any data type
    private T data;

    public GenericClass(T data){
        this.data= data;

    }

     public T getData(){
        return this.data;
}


}