public class Lab177_Wrapper_eg {
}
class Mobile{


    private Integer no;

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    private String name;
    private Double price;
}
Mobile(){
    System.out.println("DC");
}
public Mobile(Integer no, String name, Double price) {
    this.no = no;
    this.name = name;
    this.price = price;
}
