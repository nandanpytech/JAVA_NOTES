package Searching.BinarySearchQuestion;

import java.util.Arrays;

public class findfirstandlast {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,4,5,6};
        int target=4;
        int[]ans={-1,-1};
       int start= findfirstandlast(arr,target,true);
        int end= findfirstandlast(arr,target,false);
        ans[0]=start;
        ans[1]=end;
        System.out.println(Arrays.toString(ans));
    }
    static int  findfirstandlast(int[]arr,int target,boolean firstIndex){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=(start+end)/2;
            if(arr[mid]<target){
                start=mid+1;
            }else if(arr[mid]>target){
                end=end-1;
            }else {
                //I found that my element here:
                 ans=mid;
                 //start always not cross the existance target.
                if(firstIndex){
                    end=mid-1;
                }else {
                    //end always not cross the existance target.
                    start=mid+1;
                }

            }
        }
       return ans;
    }
}

