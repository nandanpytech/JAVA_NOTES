package Searching.BinarySearchQuestion;

//ceiling : find smallest number which is greatest or equal to target number.
public class Ceiling {
    public static void main(String[] args) {
        int[] arr={2,3,5,8,14,15,16,18};
        int target=15;
        System.out.println(ceiling(arr,target));
    }

    static  int ceiling(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=(start+end)/2;
            if(arr[mid]<target){
                start=mid+1;
            }else if(arr[mid]>target){
                end=end-1;
            }else {
                return arr[mid];
            }
        }
        return arr[start];
    }
}
