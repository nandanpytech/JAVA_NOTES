package Recursion;

public class HouseRobber {
    public static void main(String[] args) {
        int[]nums={2,1,1,2};
        int[]dp={-1,-1,-1,-1};
        int ans=robs(nums, nums.length-1,dp);
        System.out.println(ans);
    }
    static int robs(int[]nums,int index,int[]dp){
        if(index==0){
            return nums[index];
        }
        if(index<0){
            return 0;
        }

        if(dp[index]!=-1){
            return dp[index];
        }

        int pick=nums[index]+robs(nums,index-2,dp);
        int notpick= robs(nums, index - 1,dp);

        dp[index]=Math.max(pick,notpick);
        return Math.max(pick,notpick);
    }
}
