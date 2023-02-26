package Searching.BinarySearchQuestion;

//floor : greatest number that is smaller or equal to number
public class floorNumber {
    public static void main(String[] args) {
        int[] arr={2,3,5,8,14,15,16,18};
        int target=9;
        System.out.println(floor(arr,target));
    }

    static  int floor(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=(start+end)/2;
            if(arr[mid]<target){
                start=mid+1;
            }else if(arr[mid]>target){
                end=mid-1;
            }else {
                return arr[mid];
            }
        }
        return arr[end];
    }
}
