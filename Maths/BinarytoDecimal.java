package Maths;

public class BinarytoDecimal {
    public static void main(String[] args) {
        int a=100;
        int temp=0;
        int binary=1;
        while (a>0){
            int rem=a&1;
            temp+=binary*rem;
            binary*=8;
            a/=10;
        }
        System.out.println(temp);
    }
}
