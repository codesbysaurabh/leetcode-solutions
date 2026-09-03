/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    ListNode front;
    public boolean isPalindrome(ListNode head) {
        front = head;
        return helper(head);
    }
    public boolean helper(ListNode rear) {
        if (rear == null) return true;
        if (!helper(rear.next)) return false;
        if (front.val != rear.val) return false;
        front = front.next;
        return true;
    }
}