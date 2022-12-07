import org.w3c.dom.Node;

import java.util.LinkedList;

public class Merge_two_LL {
    public static void main(String[] args) {
        ListNode dummyhead=new ListNode();
        ListNode temp=dummyhead;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                temp.next=list1;
                temp=temp.next;
                list1=list1.next;
            }else{
                temp.next=list2;
                temp=temp.next;
                list2=list2.next;
            }
        }

        temp.next=(list1!=null)?list1:list2;
        return dummyhead.next;
        System.out.println();
    }

}
