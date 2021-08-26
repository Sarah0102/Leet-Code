import java.util.*;

public class MergeNSortedLinkList {
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

    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        boolean flag = true;
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null)
                flag = false;
        }
        if (flag == true)
            return null;
        ListNode head = null;
        ListNode tail = null;

        boolean quit = false;
        boolean isHead = true;
        while (!quit) {
            quit = true;
            Map<Integer, Integer> mapNode = new HashMap<>();
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] != null) {
                    quit = false;
                    mapNode.put(i, lists[i].val);
                }
            }
            List<Integer> minNodes = new ArrayList<>();
            if (!mapNode.isEmpty()) {
                minNodes = getMinNodes(mapNode);
            }
            for (int j = 0; j < minNodes.size(); j++) {
                if (isHead && j == 0) {
                    head = lists[minNodes.get(0)];
                    lists[minNodes.get(0)] = lists[minNodes.get(0)].next;
                    tail = head;
                } else {
                    tail.next = lists[minNodes.get(j)];
                    tail = tail.next;
                    lists[minNodes.get(j)] = lists[minNodes.get(j)].next;
                }
            }

            isHead = false;

        }

        return head;
    }

    public static List<Integer> getMinNodes(Map<Integer, Integer> mapNode) {
        List<Integer> result = new ArrayList<>();
        Collection<Integer> list = mapNode.values();
        int min = list.stream().min((m, n) -> m - n).get();
        for (Integer key : mapNode.keySet()) {
            if (mapNode.get(key) == min) {
                result.add(key);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        ListNode tail1 = head1;
        tail1.next = new ListNode(4);
        tail1 = tail1.next;
        tail1.next = new ListNode(5);
        tail1 = head1;
//        while (tail1 != null) {
//            System.out.println(tail1.val);
//            tail1 = tail1.next;
//        }
        // System.out.println("=============================");
        ListNode head2 = new ListNode(1);
        ListNode tail2 = head2;
        tail2.next = new ListNode(3);
        tail2 = tail2.next;
        tail2.next = new ListNode(4);
        tail2 = head2;
//        while (tail2 != null) {
//            System.out.println(tail2.val);
//            tail2 = tail2.next;
//        }
        //System.out.println("=============================");
        ListNode head3 = new ListNode(2);
        ListNode tail3 = head3;
        tail3.next = new ListNode(6);

        tail3 = head3;
//        while (tail3 != null) {
//            System.out.println(tail3.val);
//            tail3 = tail3.next;
//        }
        ListNode[] lists = {head1, head2, head3};
        ListNode head = mergeKLists(lists);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
