package task_Daily;

public class Task_17_Multiple_Inheritance {
}
class A {
    void show() {
        System.out.println("From A");
    }
}

class B {
    void show() {
        System.out.println("From B");
    }
}

// This will cause a compilation error
//because it will extend both show() which one it will give as output
//so, extend classes is not possible in java
class C extends A/*, B*/ {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}
