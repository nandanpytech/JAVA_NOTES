package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JumpGame {
    public static void main(String[] args) {
        int[] arr={2,3,1,1,4};
        List<Boolean> dp=new ArrayList<>(10);
        for (int i = 0; i < arr.length; i++) {
            dp.add(null);
        }
       System.out.println(canJump(arr,0,dp));
    }

    static  boolean canJump(int[]arr,int index,List<Boolean>dp){
        boolean canjump=false;
        if(index==arr.length-1){
            return true;
        }
        if(index>arr.length-1){
            return false;
        }
        if(index!=arr.length-1 && arr[index]==0){
            return false;
        }
        if(dp.get(index)!=null){
            return dp.get(index);
        }
        for (int i = 1; i <= arr[index]; i++) {
            boolean s=canJump(arr,index+i,dp);
            canjump=s || canjump;
        }
        dp.set(index,canjump);
        return canjump;
    }

}
