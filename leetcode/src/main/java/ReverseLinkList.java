import java.util.List;

public class ReverseLinkList {
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

    public static ListNode reverse(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ListNode node = head;
        ListNode newHead = head;
        ListNode temp = node.next;
        while (temp != null) {
            node.next = temp.next;
            temp.next = newHead;
            newHead = temp;
            temp = node.next;
        }
        return newHead;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode temp = head;
        for (int i = 2; i <= 1; i++) {
            temp.next = new ListNode(i);
            temp = temp.next;
        }
        for (ListNode t = head; t != null; t = t.next) {
            System.out.println(t.val);
        }
        ListNode newHead = reverse(head);
        System.out.println("=============after=========");
        for (ListNode t = newHead; t != null; t = t.next) {
            System.out.println(t.val);
        }
    }
}
