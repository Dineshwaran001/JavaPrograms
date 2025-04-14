package ex_20_Encapsulation;

public class Lab153_Encap_Eg_2 {
    public static void main(String[] args) {
        ICICI ic = new ICICI("dinesh1",540); // for constructor you can use here
       // System.out.println(ic.name); //this is not accessible (private)
        System.out.println(ic.getName());
        ic.setName("waran1"); // constructor not there you have to set
        System.out.println(ic.getName());
        System.out.println(ic.getBal());
        ic.setBal(876, false);// this will not update because cashier is false
        System.out.println(ic.getBal());// balance is not changed
        ic.setBal(900,true);// this will allow because cahier is true
        System.out.println(ic.getBal());

    }

}

class ICICI{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean isCashier) {
        if (isCashier){
        this.bal = bal;
    } else {
            System.out.println("you are not allowed to check the balance");
        }
    }

    private String name;// Instance varibale| data variable|Attributes |fields |
    private long bal;
    // below code have no use
    ICICI(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }




}