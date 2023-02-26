package Searching.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6};
        int target=55;
        System.out.println(BinarySearch(arr,target));
    }
    static  boolean BinarySearch(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=(start+end)/2;
            if(arr[mid]<target){
                start=mid+1;
            }else if(arr[mid]>target){
                end=end-1;
            }else {
                return true;
            }
        }
        return false;
    }
}
