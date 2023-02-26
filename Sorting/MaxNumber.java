package Sorting;

import java.util.Arrays;

public class MaxNumber {
    public static void main(String[] args) {
        int[]nums={2,2,3,1};
        Arrays.sort(nums);
        reverse(nums);
        System.out.println(check(nums));



    }
     static int check(int[]nums){
         int count=0;
         int i=0;
         while(i<nums.length-1){
             if(nums[i]!=nums[i+1]){
                 count++;
             }
             if(count==3){
                 return nums[i+1];
             }
             i++;
         }
         return Max(nums);
     }

    static void reverse(int[]nums){
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    static int Max(int[]nums){
        int num=nums[0];
        for(int i:nums){
            if(i>num){
                num=i;
            }
        }
        return num;
    }
}
