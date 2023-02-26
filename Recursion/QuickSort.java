package Recursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums={1,4,3,2,5,6};
        Quicksort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    static  void Quicksort(int[]nums,int low,int high){
        if(low>=high){
            return;
        }
        int start=low;
        int end=high;
        int mid=start+(end-start)/2;
        int pivot=nums[mid];

        while(start<=end){
            while (nums[start]<pivot){
                start++;
            }
            while (nums[end]>pivot){
                end--;
            }
            if(start<=end){
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }

            //Recursion calls
            Quicksort(nums,low,end);
            Quicksort(nums,start,high);

        }
    }
}
