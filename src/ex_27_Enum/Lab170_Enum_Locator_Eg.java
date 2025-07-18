package ex_27_Enum;

public enum Lab170_Enum_Locator_Eg {
    page_Button("#idvalue"), // here must be comma not colon
     page_Login(".classValue");

     private String Locators;

    Lab170_Enum_Locator_Eg(String Locators){
        this.Locators = Locators;
    }
    String getLocators(){
        return this.Locators;
    }
}
