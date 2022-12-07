package Linkedlist.LL_to_binary;

public class LL {
    public Node head;
    public Node tail;

    private int size;
    public LL(){
        this.size=0;
    }

    public void insetfirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;

        if(tail==null){                  //if it contains only one element
            tail=head;
        }
        size+=1;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
    }

    //Convert LL to Binary
    public void LL_to_binary(Node head){
        Node temp=head;
        StringBuffer s=new StringBuffer();         //It is class and has method .append()
        while(temp!=null){
            s.append(temp.value);
            temp=temp.next;
        }
        int val= Integer.parseInt(s.toString(),2);
        System.out.println(val);

    }


    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
