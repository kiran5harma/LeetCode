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
    int gcd(int a, int b){
        int min=a>b?b:a;
        int gcd=0;
        for (int i=1;i<=min;i++){
            if(a%i==0 && b%i==0)
                gcd=i;
        }
        return gcd;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode current = head;
        ListNode next= head.next;
        
        while(next!=null){
            ListNode temp = new ListNode(gcd(current.val,next.val));
            current.next=temp;
            temp.next=next;
            current= next;
            next= next.next;
            
        }
        return head;
    }
}