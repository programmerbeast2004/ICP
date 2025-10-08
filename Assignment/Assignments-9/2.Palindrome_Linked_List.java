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
public class Solution {
    // Checks if the linked list is a palindrome
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        // Find the midpoint using slow and fast pointers
        ListNode mid = findMiddle(head);

        // Reverse the second half of the list
        ListNode secondHalfStart = reverseList(mid);

        // Compare both halves
        ListNode firstHalf = head;
        ListNode secondHalf = secondHalfStart;
        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }

    // Helper to find the middle node
    private ListNode findMiddle(ListNode node) {
        ListNode slow = node;
        ListNode fast = node;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Helper to reverse a linked list
    private ListNode reverseList(ListNode node) {
        ListNode prev = null;
        while (node != null) {
            ListNode nextTemp = node.next;
            node.next = prev;
            prev = node;
            node = nextTemp;
        }
        return prev;
    }
}