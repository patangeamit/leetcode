
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

public class Solution203 {
    public static ListNode removeElements(ListNode head, int val) {

        return recursive(head, val);
    }

    static ListNode recursive(ListNode head, int val) {
        if (head == null)
            return null;
        head.next = recursive(head.next, val);
        if (head.val == val)
            return head.next;
        else
            return head;
    }

    public static void main(String[] args) {
        ListNode test = new ListNode(4, new ListNode(3, new ListNode(3, new ListNode(1))));

        ListNode.printLL(removeElements(test, 3));
    }
}
