package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PartitionSum {
    public static void main(String[] args) {
        int[] nums={1,5,11,5};
        boolean res=Partition(nums);
        System.out.println(res);


    }
    static boolean Partition(int[]nums){
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        int total=0;
        for (int i = 0; i < nums.length; i++) {
            total+=nums[i];
        }

        if(total%2!=0){
            return false;
        }


        for (int num: nums) {
            int n=outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal=new ArrayList<>(outer.get(i));
                internal.add(num);
                if(summ(internal)==total/2){
                    return true;
                }
                outer.add(internal);
            }
        }
        return false;

    }

    static  int summ(List<Integer> arr){
        int total=0;
        for (int i = 0; i < arr.size(); i++) {
            total+=arr.get(i);
        }
        return total;
    }

}
