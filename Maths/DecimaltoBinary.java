package Maths;

public class DecimaltoBinary {
    public static void main(String[] args) {
        int num=54;
        String res="";
        while(num>1){
            int rem=num%2;
            res+=rem;
            num=num/2;
        }
        res+=1;
        String ans="";
        for (int i =res.length()-1; i >-1 ; i--) {
            ans+=res.charAt(i);
        }
        System.out.println(ans);

    }
}
