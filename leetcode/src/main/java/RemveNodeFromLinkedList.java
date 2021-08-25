import java.util.ArrayList;
import java.util.List;

public class RemveNodeFromLinkedList {
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

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (1 == n && head.next == null) {
            return new ListNode();
        }
        ListNode indexNode = head;
        ListNode beforeNode = head;
        ListNode afterNode = head;
        int index = 0;
        while (indexNode != null) {
            indexNode = indexNode.next;
            index++;
            if (index >= n) {
                afterNode = afterNode.next;
                //System.out.println("afterNode is " + afterNode.val);
            }
            if (index >= n + 2) {
                beforeNode = beforeNode.next;
                System.out.println("beforeNode is " + beforeNode.val);
            }
        }
        if(index == n){
            return head.next;
        }
        beforeNode.next = afterNode;
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode temp = head;
        for (int i = 2; i <= 5; i++) {
            temp.next = new ListNode(i);
            temp = temp.next;
        }
        for (ListNode t = head; t != null; t = t.next) {
            System.out.println(t.val);
        }
        ListNode newHead = removeNthFromEnd(head, 5);
        System.out.println("=============after=========");
        for (ListNode t = newHead; t != null; t = t.next) {
            System.out.println(t.val);
        }
    }
}
