package ex_17_OOPs_Constructor;

public class Lab135_D_Constructor_RealTime {
    public static void main(String[] args) {
     WebAutomation wA = new WebAutomation();// once the object is created it will call automatically
    }
}
class WebAutomation{

    WebAutomation(){
        System.out.println("this is default constructor (or) Non Parameterized constructor");
        System.out.println("Create CSV File");
        System.out.println("Open the page before loading the scripts");
        System.out.println("Open the SQL and fetch all the data");
    }
}