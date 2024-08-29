package linkedLists;

public class Utils {
    public static ListNode listNodeFrom(int[] n) {
        ListNode node = new ListNode(-1);
        ListNode head = node;
        for (int i = 0; i < n.length; i++) {

            node.next = new ListNode(n[i]);
            node = node.next;
        }

        return head.next;

    }
}
