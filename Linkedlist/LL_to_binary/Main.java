package Linkedlist.LL_to_binary;

import Linkedlist.LL_to_binary.LL;

public class Main {
    public static void main(String[] args) {
        LL node= new LL();
        node.insetfirst(1);
        node.insetfirst(0);
        node.insetfirst(1);
//        node.display();
        node.LL_to_binary(node.head);
    }
}

