package Maths;

public class LCM {
    public static void main(String[] args) {
        int a=12, b=84;
        System.out.println((a*b)/hcf(a,b));
    }
    static int hcf(int a, int b){
        int hcf=0;
        for (int i = 1; i <=a || i<=b; i++) {
            if(a%i==0 && b%i==0){
                hcf=i;
            }
        }
        return hcf;
    }
}
