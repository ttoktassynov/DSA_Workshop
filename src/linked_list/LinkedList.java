package linked_list;

public class LinkedList {
    Node head;
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    public static void insertToEnd(LinkedList linkedList, int data) {
        if (linkedList.head == null) {
            linkedList.head = new Node(data);
            return;
        }

        Node head = linkedList.head;
        Node cur = head;
        while (cur.next != null){
            cur = cur.next;
        }
        Node newNode = new Node(data);
        cur.next = newNode;
    }

    public static void print(LinkedList linkedList) {
        if (linkedList.head == null){
            return;
        }
        Node head = linkedList.head;
        Node cur = head;
        while (cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
        //System.out.println(cur.data);
    }

    public static void reverseList(LinkedList linkedList) {
        Node head = linkedList.head;
        if (head == null) {
            return;
        }

        Node cur = head;
        Node prev = null;

        while (cur.next != null) {
            Node temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        linkedList.head = prev;
    }

    public static void main(String [] args) {
        LinkedList linkedList = new LinkedList();
        LinkedList.insertToEnd( linkedList,1);
        LinkedList.insertToEnd(linkedList, 2);
        LinkedList.insertToEnd(linkedList, 3);
        LinkedList.insertToEnd(linkedList, 4);
        linkedList.print(linkedList);
        linkedList.reverseList(linkedList);
        linkedList.print(linkedList);
    }
}
