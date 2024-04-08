package datastructure.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.prepend(0);
        linkedList.insert(2, 100);
        linkedList.reverse();
        linkedList.printList();

    }
}
