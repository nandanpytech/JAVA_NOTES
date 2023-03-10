package Recursion;

import java.util.ArrayList;
import java.util.List;

public class totalsumtarget {
    public static void main(String[] args) {
        int[]arr={3,5,6,7};
        int target=9;
        int  res=subset(arr,target);
        System.out.println(res);
    }

    static int subset(int[]arr,int target){
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        int count=0;
        for (int num:arr) {
            int n=outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal=new ArrayList<>(outer.get(i));
                internal.add(num);
                if(summ(internal)<=target){
                   count=count+1;
                }
                outer.add(internal);
            }
        }
        return count;
    }
    static  int summ(List<Integer> arr){
        int total=arr.get(0)+arr.get(arr.size()-1);
        return total;
    }
}
