import com.sun.org.apache.xpath.internal.operations.Bool;
import org.w3c.dom.NodeList;

import java.lang.management.BufferPoolMXBean;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Map;

public class ReverseNodes {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1) {
            return head;
        }
        ListNode node1 = head;
        ListNode node2 = head;
        ListNode node3 = head;
        node1 = getKNode(node1, k);
        if (node1 == null) {
            return head;
        }
        ListNode newHead = node1;
        ListNode temp = null;
        ListNode tempHead = null;
        ListNode tail = null;
        while (true) {
            node2 = node1.next;
            temp = node3.next;
            tempHead = node3;
            while (temp != node2) {
                node3.next = temp.next;
                temp.next = tempHead;
                tempHead = temp;
                temp = node3.next;
            }
            if (tail != null)
                tail.next = tempHead;
            if(node2 == null){
                break;
            }
            node1 = node2;
            node1 = getKNode(node1, k);
            if (node1 == null ) {
                break;
            }
            tail = node3;
            node3 = node2;
        }

        return newHead;
    }

    public static ListNode getKNode(ListNode head, int k) {
        for (int i = 1; i <= k - 1; i++) {
            head = head.next;
            if (head == null) {
                return null;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode tail = head;
        int i = 2;
        while (i <= 5) {
            tail.next = new ListNode(i);
            tail = tail.next;
            i++;
        }
        tail = head;
        while (tail != null) {
            System.out.println(tail.val);
            tail = tail.next;
        }
        System.out.println("================================");
        ListNode newHead = reverseKGroup(head, 3);
        tail = newHead;
        while (tail != null) {
            System.out.println(tail.val);
            tail = tail.next;
        }
    }


}
