package CyclicSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums={3,4,-1,1};
        int n=cyclicsort(nums);
        System.out.println(n);
        System.out.println(Arrays.toString(nums));
    }
    static int  cyclicsort(int[]arr){
        int i = 0;
        while (i < arr.length) {
            int correctpos = arr[i]-1 ;
            if (arr[i]>0 && arr[i] <= arr.length && arr[i] != arr[correctpos]) {
                swap(arr, i, correctpos);
            }
            else {
                i++;
            }
        }

        //Checking for the missing index in array...
        for (int index=0;index<arr.length;index++){
            if(arr[index]!=index+1){
                return index+1;
            }
        }
        return arr.length+1;

    }
    static void swap(int[]nums,int start,int realIndex){
        int temp=nums[start];
        nums[start]=nums[realIndex];
        nums[realIndex]=temp;
    }
}
