
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
}

public class Solution21 {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode answer, temp, one, two;
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list2.val > list1.val) {
            temp = list1;
            one = list1.next;
            two = list2;
        } else {
            temp = list2;
            two = list2.next;
            one = list1;
        }
        answer = temp;
        if (two == null) {

            temp.next = one;
            return temp;
        }
        if (one == null) {
            temp.next = two;
            return temp;
        }
        while (one.next != null | two.next != null) {
            if (one.val > two.val) {
                temp.next = two;
                temp = two;
                two = two.next;
                if (two == null) {
                    temp.next = one;
                    return answer;
                }
            } else {
                temp.next = one;
                temp = one;
                one = one.next;
                if (one == null) {
                    temp.next = two;
                    return answer;
                }
            }
        }
        if (one.val > two.val) {
            temp.next = two;
            temp.next.next = one;
        } else {
            temp.next = one;
            temp.next.next = two;
        }
        return answer;
    }

    public static void main(String[] args) {
        ListNode one = new ListNode(-9, new ListNode(3));
        ListNode two = new ListNode(5, new ListNode(7));
        ListNode ans = mergeTwoLists(one, two);
        while (true) {
            System.out.println(ans.val + " ");
            if (ans.next != null)
                ans = ans.next;
            else
                break;
        }
    }
}