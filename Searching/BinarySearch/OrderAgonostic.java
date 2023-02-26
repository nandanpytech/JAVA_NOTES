package Searching.BinarySearch;

public class OrderAgonostic {
    public static void main(String[] args) {
        int[]arr={6,5,4,3,2,1};
        int target=5;
        if(arr[0]<arr[arr.length-1]){
            System.out.println(BinarySearch(arr,target));
        }else{
            System.out.println(orderagonostic(arr,target));
        }
    }
    static  boolean BinarySearch(int[]arr,int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = end - 1;
            } else {
                return true;
            }
        }
        return false;
    };
    static  boolean orderagonostic(int[]arr,int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] < target) {
                end=mid-1;
            } else if (arr[mid] > target) {
                start=mid+1;
            } else {
                return true;
            }
        }
        return false;
    };

}
