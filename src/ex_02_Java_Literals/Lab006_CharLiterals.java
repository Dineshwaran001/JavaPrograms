package ex_02_Java_Literals;

public class Lab006_CharLiterals {
    public static void main(String[] args) {
          //escape sequence
        char new_line ='\n';//this will spilt and go to the new line and print the remaining word
        char tab_line ='\t'; // this will give space between them
        char back_space = '\b'; // this will give backspace and remove h from dinesh
        char carriage_return= '\r'; // this will delete the before word of carriage return

        System.out.println("Dinesh"+new_line+"Waran");
        System.out.println("Dinesh"+tab_line+"Waran");
        System.out.println("Dinesh"+back_space+"Waran");
        System.out.println("Dinesh"+carriage_return+"Waran");
    }
}
