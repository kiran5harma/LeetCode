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
        ListNode dummy=new ListNode(0);
        ListNode current = dummy;
        int carry=0;
        // ListNode current2=l2;
        while(l1!=null || l2!=null || carry==1){
            // int temp=l1.val;
            // int sum=(l1.val+l2.val)%10;
            // l1.val=sum +carry;
            // carry=(temp+l2.val)/10;
            // l1=l1.next;
            // l2=l2.next;
            int sum=0;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            sum+=carry;
            ListNode node = new ListNode(sum%10);
            carry=sum/10;
            current.next=node;
            current=current.next;
            
        }
        // while(carry){
        //     if(l1.next!=null){
        //         sum=(l1.val+carry)%10;
        //         l
        //     }
        // }
      
        return dummy.next;
    }
}