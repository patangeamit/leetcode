
// Definition for singly-linked list.
class ListNode {
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

    public static void printLL(ListNode h) {
        ListNode curr = h;
        System.out.print(curr.val);
        while (curr.next != null) {
            curr = curr.next;
            System.out.print(" -> " + curr.val);
        }
        System.out.println();
    }
}

public class Solution206 {
    public static ListNode reverseList(ListNode head) {
        // return recursive(null, head);
        return recursive(null, head);
    }

    static ListNode recursive(ListNode prev, ListNode curr) {
        if (curr == null) {
            return prev;
        }
        ListNode temp = curr.next;
        curr.next = prev;
        return recursive(curr, temp);
    }

    public static void main(String[] args) {
        ListNode test = new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1))));
        ListNode.printLL(reverseList(test));
    }
}
