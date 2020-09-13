package home_task;

import java.util.HashMap;
import java.util.Map;

public class LinkedListCycle {
    ListNode head;
    public static void main(String [] args) {
        new LinkedListCycle().solve();
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
        node3.next = node1;//pos = 1;

        //print();
        System.out.println("The list has cycle or not: " + hasCycle(head));
        //print();
    }
    public boolean hasCycle(ListNode head) {
        Map<ListNode, Integer> nodeMap = new HashMap<>();
        ListNode cur = head;
        while (cur != null) {
            if (nodeMap.containsKey(cur)){
                return true;
            }
            else {
                nodeMap.put(cur, 1);
            }
            cur = cur.next;
        }
        return false;
    }
}
