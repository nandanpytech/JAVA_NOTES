package Recursion;

public class Permutation {
    public static void main(String[] args) {
        String s="abc";
        printpermutatuion("",s);
    }
    static void printpermutatuion(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char a=up.charAt(0);
        int count=0;
        for (int i = 0; i < p.length()+1; i++) {
            String first=p.substring(0,i);
            String second=p.substring(i,p.length());
            printpermutatuion(first+a+second,up.substring(1));
        }
    }
}
