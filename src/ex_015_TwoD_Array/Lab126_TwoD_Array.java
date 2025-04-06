package ex_015_TwoD_Array;

public class Lab126_TwoD_Array {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] jag_array;
        jag_array = new int[3][2];
        jag_array[0][0] = 1;
        jag_array[0][1] = 2;
        jag_array[1][0] = 3;
        jag_array[1][1] = 4;
        jag_array[2][0] = 5;
        jag_array[2][1] = 6;
        for (int i = 0; i < jag_array.length; i++) {
            for (int j = 0; j < jag_array[i].length; j++) {// we use jag_array[i].length
                System.out.println(jag_array[i][j]);
            }
            System.out.println();
        }
    }
}
