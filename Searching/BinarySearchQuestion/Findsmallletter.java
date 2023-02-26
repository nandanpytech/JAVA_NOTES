package Searching.BinarySearchQuestion;

public class Findsmallletter {
    public static void main(String[] args) {
        char[]arr={'c','f','g'};

        char target='d';
        System.out.println(ceiling(arr,target));
    }
    static  char ceiling(char[]arr,char target){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=(start+end)/2;
            if(arr[mid]<target){
                start=mid+1;
            }else {
                end=end-1;
            }
        }
       return arr[start % arr.length];

    }
}
