package home_task;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
public class DeleteNodeLinkedList {
    ListNode head;
    public static void main(String [] args) {
        new DeleteNodeLinkedList().solve();
    }
    public void print() {
        if (head == null) {
            return;
        }
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }
    public void solve() {
        head = new ListNode(0);

        ListNode node1 = new ListNode(1);
        head.next = node1;

        ListNode node2 = new ListNode(2);
        node1.next = node2;

        ListNode node3 = new ListNode(3);
        node2.next = node3;

        print();
        deleteNode(node2);
        print();
    }
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
