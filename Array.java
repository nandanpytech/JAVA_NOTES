import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        int target=8;
        int[] res=new  int[2];
        res[0]=firstposition(nums,target,true);
        if(res[0]!=-1){
            res[1]=firstposition(nums,target,false);
        }
        System.out.println(Arrays.toString(res));
    }
//    public static void spiralOrder(int[][] matrix) {
//        List<Integer> arr=new ArrayList<>();
//        int left=0,right=matrix[0].length,top=0,bottom=matrix.length;
//        while (left<right && top<bottom){
//            for (int i = top; i <right; i++) {
//                arr.add(matrix[top][i]);
//            }
//            top++;
//
//            for (int j = top; j < bottom; j++) {
//                arr.add(matrix[j][right-1]);
//            }
//            right--;
//
//            for (int k = right-1; k >=left ; k--) {
//                arr.add(matrix[bottom-1][k]);
//            }
//            bottom--;
//            for (int l =bottom-1; l>=top ; l--) {
//                arr.add(matrix[top][left]);
//            }
//            left++;
//        }
//
//    }
//}
//        public static  void setZeroes(int[][] matrix) {
//            int[] column=new int[matrix.length];
//            int[] row=new int[matrix[0].length];
//
//            for (int i = 0; i < matrix.length; i++) {
//                for (int j = 0; j < matrix[i].length; j++) {
//                    if(matrix[i][j]==0){
//                        column[i]=1;
//                        row[j]=1;
//                    }
//
//                }
//            }
//
//            for (int i = 0; i < matrix.length; i++) {
//                for (int j = 0; j < matrix[i].length; j++) {
//                    if(column[i]==1 || row[j]==1){
//                        matrix[i][j]=0;
//                    }
//
//                }
//            }
//            System.out.println(Arrays.toString(row));
//
//
//
//
//        }

    static int firstposition(int[]nums,int target,boolean op){
        int start=0;
        int end=nums.length-1;
        int temp=-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(target>nums[mid]){
                start=mid+1;
            }else if( target < nums[mid]){
                end=end-1;
            }else{
                 temp=mid;
                if(op){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return temp;
    }
}

