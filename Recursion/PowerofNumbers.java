package Recursion;

public class PowerofNumbers {
    public static void main(String[] args) {
        int num=6;
        int pow=3;
        System.out.println(findpower(num,pow));
    }
    static int findpower(int num,int pow){

        if(pow==1){
            return num;
        }
        return num*findpower(num,pow-1);
    }
}
