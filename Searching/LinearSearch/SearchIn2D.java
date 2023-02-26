package Searching.LinearSearch;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr={
                {2,3,5,6},{1,4,7},{11,21,31,14,15,16}
        };
        int target=0;
        System.out.println(SearchIntwoD(arr,target));
    }
    static boolean SearchIntwoD(int[][]arr,int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    };

}
