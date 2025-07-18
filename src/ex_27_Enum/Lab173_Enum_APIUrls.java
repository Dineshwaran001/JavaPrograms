package ex_27_Enum;

public enum Lab173_Enum_APIUrls {
    google("https://google.com"),
    yahoo("https://Yahoo.com"),
    Vwo("https://vwo.com");

    private String Urls;

    Lab173_Enum_APIUrls(String Urls){
        this.Urls = Urls;
    }
String getUrls(){
        return this.Urls;
    }
}
