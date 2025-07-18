package ex_27_Enum;

public enum Lab172_Enum2_Colors {
    RED("FF0000"),
    Blue("BB0000"),
    Green("GG0000");
    private String HexCode;
    Lab172_Enum2_Colors(String Hexcode){
        this.HexCode = Hexcode;
    }
    String getHexCode(){
        return this.HexCode;
    }
}
