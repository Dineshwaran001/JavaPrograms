package ex_21_AccessModifier.police;

public class Junior_Police {
    public static void main(String[] args) {
        SeniorPolice jr = new SeniorPolice("I can Shoot",6);
        System.out.println("Private means it is allowed only within the class");
        System.out.println("if you want to allow in the same package make it protected");
        jr.canIShoot();// it is protected so we can use within package.
        System.out.println(jr.Gun);
        System.out.println("I have bullets of " +" "+jr.gunBullets);
    }
}
