package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3 {
    public static void main(String[] args) {
        int[]nums={-1,0,1,2,-1,-4};
        List<List<Integer> > ans = new ArrayList<>();
        int[] array1 = {0, 0, 0};
        if(Arrays.equals(array1,nums)){
            ans.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0)));
            System.out.println( ans);
        }

        Arrays.sort(nums);
        int i=0;
        while(i<nums.length){
            if(i>0 && nums[i]==nums[i-1]){
                i++;
            }
            int start=i+1;
            int end=nums.length-1;
            while(start<end){
                if(nums[i]+nums[start]+nums[end]<0){
                    start++;
                }else if(nums[i]+nums[start]+nums[end]>0){
                    end--;
                }else{
                    ans.add(new ArrayList<Integer>(Arrays.asList(nums[i], nums[start], nums[end])));
                    start++;
                    while(nums[start]==nums[start-1]&&start<end){
                        start++;
                    }
                }
            }
            i++;
        }
        for (int ik = 0; ik < ans.size(); ik++) {
            for (int j = 0; j < ans.get(ik).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }
}
