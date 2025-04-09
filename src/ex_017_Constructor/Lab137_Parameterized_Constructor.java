package ex_017_Constructor;

public class Lab137_Parameterized_Constructor {
    public static void main(String[] args) {
        Cars c1 = new Cars("Tesla", 1999,"2017");
        Cars c2 = new Cars("Mahindra", 2015,"2020");
        Cars c3 = new Cars("TATA" , 2013,"2024");
        //whenever new object is created automatically this value is set
    }
}
class Cars{
    String name; // these name , year , model passed using this in PC
    int year;
    String model;

    Cars(){  //Default constructor
        name="Unknown";
        year= 1999;
        model ="XXX";
    }

    Cars(String name_arg , int year_arg, String model_arg){// argument name
        this.name = name_arg;// this.name -> name came from above class
        this.year =year_arg;
        this.model =model_arg;
        //this keyword refer to the current object
    }
}