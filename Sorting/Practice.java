package Sorting;


import java.util.Arrays;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
    //the way to convert array to arraylist
    String[] str={"a","b","c","d"};
    List arr=Arrays.asList(str);
        System.out.println(arr);

    //the way to convert string to char array
    String s="nandan";
    char[] ch=s.toCharArray();
        System.out.println(Arrays.toString(ch));


    //to convert char to string
    char[] channel1={'a','b'};
    System.out.println(new String(channel1)) ;

    //to convert string array to new string
    String[] channel2={"a","b"};
    String sa=String.join(" ",channel2);

    //to split string into arr
    String n="sdlkjf@dsfkja@lkdf";
    String[] arr3=n.split("@",2);
    System.out.println(Arrays.toString(arr3));

    //how to avoid last space in string
         String s5="sldjf slkdf sdlkfj ";
        System.out.println(s5.substring(0,s5.length()-1));


//        int a=1;
//        while(++a<=5){
//            System.out.println(a++);
//        }
        int a=1;
//        System.out.println(a++);
        System.out.println(++a);
    }
}
