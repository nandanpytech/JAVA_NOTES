package Recursion;

public class RemoveA {
    public static void main(String[] args) {
        String a="bcaceaga";
        Remove("",a);
    }
    static void Remove(String p,String a){
        if(a.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch=a.charAt(0);
        if(ch=='a'){
            Remove(p,a.substring(1));
        }else{
            Remove(p+ch,a.substring(1));
        }
    }
}
