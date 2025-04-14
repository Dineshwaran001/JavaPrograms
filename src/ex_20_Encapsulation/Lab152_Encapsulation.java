package ex_20_Encapsulation;

public class Lab152_Encapsulation {
    public static void main(String[] args) {
//        Cons cs = new Cons("Dinesh","54321");
//        System.out.println(cs.Username1); // need to print use like this
//        System.out.println(cs.Password1);
//        cs.Username1="dada"; // they can change name(so it is not recommended to use)
//        cs.Password1="12345";
//        System.out.println(cs.Username1);
//        System.out.println(cs.Password1);

//below code is the real code for private
        //Good ic = new Good("Dinesh", "waran"); // this is for checking constructor
        Good ic = new Good(); //object should be created
        System.out.println(ic.getName());// get name will get the name
        //System.out.println(ic.username); this is not allowed password cannot access outside the class
           ic.setName("wrath");// name changed here
        System.out.println(ic.getName());
        System.out.println(ic.getPassword());
        ic.setPassword("54321",false);// admin is false so it will not change
        ic.setPassword("90909",true);// admin is true so it will change
        System.out.println(ic.getPassword());
    }
}

class Cons{
    public String Username1 ;
    public String Password1 ;
    Cons(String arg_Username, String arg_Password){
        this.Username1 = arg_Username;
        this.Password1 = arg_Password;
    }
}// these Cons will allow you to make diffrence they can access username and password
//below code is example for our program

class Good{

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAdmin) {
        if (isAdmin){
            this.password = password;
        } else {
            System.out.println("you are not allowed to change the password");
        }

    }

    private String Name ="Dinesh";
    private String password ="12345";
//    private int age = 26;

//    Good(String username, String Password1){
//        this.Name= username;
//        this.password= Password1;
    //this is for checking this can able to access in main , it is not used
//    }
}