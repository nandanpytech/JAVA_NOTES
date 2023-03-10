package Recursion;

public class FrogJump {
    public static void main(String[] args) {
        int n=4;
        int[] nums={10,20,30,10};
        int[] dp={-1,-1,-1,-1};
        System.out.println(Checkmin(nums,3,dp));
    }
    static  int Checkmin(int[]nums,int index,int[]dp){
        if (index<=0){
            return 0;
        }
        if(dp[index]!=-1){
            return dp[index];
        }
        int left=Checkmin(nums,index-1,dp)+Math.abs(nums[index]-nums[index-1]);
        int right=Integer.MAX_VALUE;
        if(index>1){
            right=Checkmin(nums,index-2,dp)+Math.abs(nums[index]-nums[index-2]);
        }
        dp[index]=Math.min(left,right);
        return Math.min(left,right);
    }
}
