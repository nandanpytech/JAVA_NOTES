package Recursion;

public class SkipWord {
    public static void main(String[] args) {
        String msg="MynameisNandanBilagi";
        System.out.println(skipword(msg));
    }
    static String skipword(String msg){
        if(msg.isEmpty()){
            return msg;
        }
        if(msg.startsWith("Nandan")){
            return skipword(msg.substring(6));
        }else{
            return msg.charAt(0)+skipword(msg.substring(1));
        }
    }
}
