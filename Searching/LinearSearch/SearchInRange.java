package Searching.LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int first=1;
        int last=5;
        int target=7;
        boolean exist=SearchInRange(arr,first,last,target);
        System.out.println(exist);
    }
    static  boolean  SearchInRange(int[]arr,int first,int last,int target){
        if(arr.length==0 && first< arr.length && last< arr.length){
            return false;
        }
        for (int i = first ; i < last; i++) {
            if(arr[i]==target){
                return true;
            }
        }
        return  false;

    }
}
