package linkedLists;

import static linkedLists.Utils.listNodeFrom;

public class RotateList {

    public ListNode rotateRight(ListNode head, int k) {
        if (k < 1 || head == null || head.next == null) { // Edge case
            return head;
        }
        ListNode leader = new ListNode(-1, head);
        ListNode follower = leader;

        int c = 0;

        while (c < k) {
            leader = leader.next;

            if (leader == null)
                break;
            c++;
        }

        if (c == k && leader != null && leader.next == null) {
            // no rotations are needed as list length is equal to k - no of rotations
            return follower.next;
        }

        if (leader == null) {
            leader = follower;
            int i = 0;
            int r = k % c;

            if (r == 0) {
                return follower.next;
            }

            while (i < r) {
                leader = leader.next;
                i++;
            }
        }

        while (leader.next != null) {
            leader = leader.next;
            follower = follower.next;
        }

        ListNode res = follower.next;
        follower.next = null;
        leader.next = head;

        return res;

    }

    public static void main(String[] args) {
        var head = listNodeFrom(new int[] { 1, 2, 3, 4, 5 });

        System.out.println(new RotateList().rotateRight(head, 10));

    }
}
