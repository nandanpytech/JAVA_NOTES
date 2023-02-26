package Maths;

public class DecimalToHexa {
    public static void main(String[] args) {
        int num=54;
        String res="";
        String pos="0123456789ABCDEF";
        while(num>1){
            int rem=num%16;
            res+=pos.charAt(rem);
            num=num/16;
        }

        String ans="";
        for (int i =res.length()-1; i >-1 ; i--) {
            ans+=res.charAt(i);
        }
        System.out.println(ans);
    }
}
