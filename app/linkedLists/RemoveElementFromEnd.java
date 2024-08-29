package linkedLists;

import static linkedLists.Utils.listNodeFrom;

public class RemoveElementFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode res = new ListNode(0, head);
        ListNode followerNode = res;

        int i = 0;

        while (head != null && i < n) {
            head = head.next;
            i++;
        }

        while (head != null) {
            followerNode = followerNode.next;
        }

        followerNode.next = followerNode.next.next;

        return res.next;

    }

    public static void main(String[] args) {
        var head = listNodeFrom(new int[] { 1 });

        System.out.println(new RemoveElementFromEnd().removeNthFromEnd(head, 1));

    }

}
