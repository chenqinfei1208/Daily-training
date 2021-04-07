package JavaHomeWork;

import java.util.Stack;

public class FindLinkedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode head;

        public ListNode() {
            this.val = val;
        }


    }

    public static ListNode findLastKNode(ListNode pHead, int k) {
        Stack<ListNode> stack = new Stack();
        ListNode fast = pHead;
        if (pHead == null || k <= 0) {
            return null;
        }
        while (fast != null) {
            fast = fast.next;
            stack.push(fast);

        }
        while(k>0){
            fast = stack.pop();
            k--;
        }
        return fast;
    }
}
