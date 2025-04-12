package ex_18_OOPs_Inheritance.Single_Inheritance;

public class TC_2 extends Common_Class{
    void check_database(){
        Start_the_browser();
        System.out.println("bowser launched");
        System.out.println("url hitted");
        System.out.println("elements detected and form filled");
        read_the_ExcelFile();
        System.out.println("Excel file readed");
        read_Database();
        System.out.println("Data base readed successsfully");

    }
}
