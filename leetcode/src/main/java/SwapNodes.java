import javax.swing.text.Style;

public class SwapNodes {

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

    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode node1 = head;
        ListNode node2 = head;
        ListNode newHead = head.next;
        ListNode tail = null;
        while (node1 != null && node1.next != null) {
            node2 = node1.next.next;
            if (tail == null) {
                tail = newHead;
            } else {
                tail.next = node1.next;
                tail = tail.next;
            }
            tail.next = node1;
            tail = tail.next;
            tail.next = node2;
            node1 = node2;

        }
        if (node1 != null && node1.next == null)
            tail = node1;
        return newHead;

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode tail = head;
        tail.next = new ListNode(2);
        tail = tail.next;
        tail.next = new ListNode(3);
        tail = tail.next;
        tail.next = new ListNode(4);

        tail = head;
        while (tail != null) {
            System.out.println(tail.val);
            tail = tail.next;
        }
        System.out.println("================================");
        ListNode newHead = swapPairs(head);
        while (newHead != null) {
            System.out.println(newHead.val);
            newHead = newHead.next;
        }
    }
}
