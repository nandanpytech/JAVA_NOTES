package Recursion;

public class SubsetSum2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        boolean ans=subsetsum(arr,4);
        System.out.println(ans);
    }
    static boolean subsetsum(int[]arr,int target){
        int totalsum=0;
        for (int i = 0; i < arr.length; i++) {
            totalsum+=arr[i];
        }
        if(totalsum%2!=0){
            return  false;
        }
        boolean res=sumset(arr,arr.length-1,totalsum/2);
        return res;
    }
    static boolean sumset(int[]arr,int index,int target){
        if(target==0) return true;
        if(index==0){
            return target==arr[0];
        }

        boolean not_take=sumset(arr,index-1,target);
        boolean take=false;
        if(target>=arr[index]){
            take=sumset(arr,index-1,target-arr[index]);
        }
        return not_take || take;
    }
}
