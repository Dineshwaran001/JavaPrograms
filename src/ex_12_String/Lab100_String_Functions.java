package ex_12_String;

public class Lab100_String_Functions {
    public static void main(String[] args) {
        String name = "dinesh";
        System.out.println(name.length());// this will start from 1 to 6 output : 6
        System.out.println(name.charAt(3));//this will start from 0 to 5-> output : e
        //System.out.println(name.charAt(9));// this will not in range-> StringIndex out of bound Exception will trigger
        System.out.println(name.concat("waran"));// this will merge: dineshwaran
        System.out.println(name.contains("jsw"));// this is for searching whether this word is there or not
        System.out.println(name.equals("dinesh"));// this compare contenet so it is true
        System.out.println(name.equalsIgnoreCase("DINESH"));// this will always compare with original dinesh
        System.out.println(name.indexOf("n"));// start from 0-> output:2
        System.out.println(name.indexOf("d"));// start from 0-> output:0
        System.out.println(name.replace('d','t')); // replace d with t
        System.out.println(name.replace("din","jig")); // replace din with jig


    }
}
