public class AddTwoNumbers {
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

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        ListNode result = new ListNode((l1.val+ l2.val)%10);
        ListNode tempNode = result;
        int tempVal = (l1.val+ l2.val)/10;
        ListNode temp1 = l1.next;
        ListNode temp2 =l2.next;
        int sum = 0;
        while (temp1 != null || temp2 != null) {
            if (temp1 == null) {
                sum = temp2.val + tempVal;
                temp2 = temp2.next;
            } else if (temp2 == null) {
                sum = temp1.val + tempVal;
                temp1 = temp1.next;
            } else {
                sum = temp1.val + temp2.val + tempVal;
                temp2 = temp2.next;
                temp1 = temp1.next;

            }
            tempNode.next = new ListNode(sum % 10);
            tempNode= tempNode.next;
            tempVal = sum / 10;
        }
        if(tempVal != 0){
            tempNode.next = new ListNode(tempVal);
        }
        return result;
    }
    public static void main(String[] args) {
    }
}
