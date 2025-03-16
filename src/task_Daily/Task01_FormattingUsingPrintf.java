package task_Daily;

public class Task01_FormattingUsingPrintf {
    public static void main(String[] args) {
        byte table=9;
        byte times=1;
        int total= table * times;
        System.out.printf("%d * %d = %d",table ,times, total);
        System.out.println();
        System.out.printf("%d * %d = %d",table ,times+1, total*2);
        System.out.println();
        System.out.printf("%d * %d = %d",table ,times+2, total*3);
        System.out.println();
        System.out.printf("%d * %d = %d",table ,times+3, total*4);
        System.out.println();
        System.out.printf("%d * %d = %d",table ,times+4, total*5);
        System.out.println();
        System.out.printf("%d * %d = %d",table ,times+5, total*6);
        System.out.println();
        System.out.printf("%d * %d = %d",table ,times+6, total*7);
        System.out.println();
        System.out.printf("%d * %d = %d",table ,times+7, total*8);
        System.out.println();
        System.out.printf("%d * %d = %d",table ,times+8, total*9);
        System.out.println();
        System.out.printf("%d * %d = %d",table ,times+9, total*10);

    }
}

