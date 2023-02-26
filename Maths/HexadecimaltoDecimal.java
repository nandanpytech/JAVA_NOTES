package Maths;

public class HexadecimaltoDecimal {
    public static void main(String[] args) {
        String a="C9";
        int temp=0;
        int hex=1;
        String pos="0123456789ABCDEF";
        char[] charc=a.toCharArray();
        for (int i = charc.length-1; i >=0; i--) {
            temp+=(pos.indexOf(charc[i]))*(hex);
            hex*=16;
        }


        System.out.println(temp);
    }
}
