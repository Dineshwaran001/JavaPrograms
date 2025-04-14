package ex_019_Polymorphism;

public class Lab151_Method_overriding_Automation {
    public static void main(String[] args) {
        Chrome_TC c = new Chrome_TC();
        c.open_browser();
        //Dynamic dispatch
        Common c1 = new Chrome_TC(); // super class refe object is sub class
        c1.open_browser();
        Common c2 = new Firefox();
        c2.open_browser();
    }
}
class Common{
    void open_browser(){
        System.out.println("Internet Explorer");
    }
}
class Chrome_TC extends Common{
 @Override
    void open_browser(){
        System.out.println("Chrome");
    }
}
class Firefox extends Common{
    @Override
    void open_browser(){
        System.out.println("Firefox");
    }
}
