package Searching.BinarySearchQuestion;

public class MoutainNumber {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,4,2};
        System.out.println(Moutainnumber(arr));
    }
    static  int Moutainnumber(int[]arr){
        int start=0;
        int end=arr.length-1;
        while (start<end){
            int mid=(start+end)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }else if(arr[mid]>arr[mid+1]){
                end=mid;
            }
        }
        return start;
    }

}
