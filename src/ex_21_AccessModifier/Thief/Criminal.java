package ex_21_AccessModifier.Thief;

import ex_21_AccessModifier.police.SeniorPolice;

public class Criminal {
    public static void main(String[] args) {
        SeniorPolice criminal = new SeniorPolice("i have gun",6);
//        criminal.canIShoot(); // if you make this method as public they can available here
//        System.out.println(criminal.Gun);
//        System.out.println("Having Bullets"+" "+criminal.gunBullets);
    }
}
