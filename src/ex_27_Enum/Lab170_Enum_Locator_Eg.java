package ex_27_Enum;

public enum Lab170_Enum_Locator_Eg {
    page_Button("#idvalue"), // here must be comma not colon
     page_Login(".classValue");

     private String Locators; //locator is private so we use get locator below last

    Lab170_Enum_Locator_Eg(String Locators){ // constructor for automatic call
        this.Locators = Locators;
    }
    String getLocators(){ //beacuse locator is private we give get Locator
        return this.Locators;
    }
}
