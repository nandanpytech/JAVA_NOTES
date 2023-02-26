package Recursion;

public class Subset {
    public static void main(String[] args) {
        String str="abc";
        subset(str,"");
    }
    static void subset(String str,String p){
        if(str.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch=str.charAt(0);

        subset(str.substring(1),p+ch);
        subset(str.substring(1),p);
    }
}
