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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       if(head==null)
        return head;

        if(head.next==null&&n==1)
        return null;
        ListNode temp=null;
        ListNode current=head;
        int count=0;
        while(current!=null){
            count++;
            current=current.next;
        }
        if(count==n)
        return head.next;
        current=head;
        n=count-n;
        // System.out.println(n);
        count=0;
        while(n!=count){
            temp=current;
            current=current.next;
            count++;
        }
        
        temp.next=current.next;
        current.next=null;
        
        return head;
    }
}