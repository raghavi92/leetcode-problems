package PartitionList;

public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode leftO = new ListNode();
        ListNode left = leftO;

        ListNode rightO = new ListNode();
        ListNode right = rightO;

        ListNode current = head;

        while (current != null) {
            if (current.val < x) {
                left.next = current;
                left = left.next;
            } else {
                right.next = current;
                right = right.next;
            }
            current = current.next;
        }

        left.next = rightO.next;
        right.next = null;
        return leftO.next;

    }

    public static void main(String[] args) {

        // Arrays.asList( 1, 4, 3, 2, 5, 2 ).stream().

        ListNode node = new ListNode(-1);

        ListNode head = node;

        int[] n = new int[] { 1, 4, 3, 2, 5, 2 };

        for (int i = 0; i < n.length; i++) {

            node.next = new ListNode(n[i]);
            node = node.next;
        }
        ListNode partition = new PartitionList().partition(head.next, 3);

        System.out.println(partition);
    }
}
