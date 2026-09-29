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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        // Create a Dummy node 
        // what is happening here we are adding l1 + l2 then you will have the l3 so you have to store the carry 
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            int sum = carry;

            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            } if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }

            current.next = new ListNode( sum % 10);
            current = current.next;

            carry = sum /10;
        }

        return dummy.next;
    }
}