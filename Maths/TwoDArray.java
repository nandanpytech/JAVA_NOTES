package Maths;

public class TwoDArray {
    public static void main(String[] args) {
       int[][]arr={
               {1,2,3,4},
               {5,6,7,8},
               {11,12,13}
       };
        int[][] dup=arrydivided2(arr);
        // Loop through all rows
        for (int i = 0; i < dup.length; i++)

            // Loop through all elements of current row
            for (int j = 0; j < dup[i].length; j++)
                System.out.print(dup[i][j] + " ");
    }
    static int[][] arrydivided2(int[][]arr){
        for (int row = 0; row <arr.length ; row++) {
            for (int col = 0; col < arr[row].length; col++) {
               if( arr[row][col]%2==0){
                   arr[row][col]=1;
               }
            }
        }
        return arr;
    }
}
