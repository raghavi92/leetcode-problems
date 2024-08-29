package linkedLists;

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

        ListNode head = Utils.listNodeFrom(new int[] { 1, 4, 3, 2, 5, 2 });

        ListNode partition = new PartitionList().partition(head, 3);

        System.out.println(partition);
    }
}
