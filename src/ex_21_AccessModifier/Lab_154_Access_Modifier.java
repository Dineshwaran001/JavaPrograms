package ex_21_AccessModifier;


import ex_21_AccessModifier.Thief.SubClass;

public class Lab_154_Access_Modifier extends SubClass {// using extend we call the method protected
    public void our(){
       sr();// this is called from another package
    }

    public static void main(String[] args) {
        Lab_154_Access_Modifier r = new Lab_154_Access_Modifier();// create an object
        r.our(); // with reference call method
    }

}

