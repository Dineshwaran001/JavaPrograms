package ex_21_AccessModifier.police;

public class SeniorPolice {
    protected String Gun;
    protected int gunBullets;
// constructor Para
    public SeniorPolice( String arg_Gun,int arg_gunBullets){
          this.Gun = arg_Gun;
          this.gunBullets= arg_gunBullets;
    }
    protected void canIShoot(){
        System.out.println("you can shoot");
    }
}
