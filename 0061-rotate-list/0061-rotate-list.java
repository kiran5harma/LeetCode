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
    public ListNode rotateRight(ListNode head, int k) {

        if(head==null || head.next==null ||k==0)
        return head;
        
        //find length
        ListNode idk=head;
        int len=0;
        while(idk.next!=null){
            idk=idk.next;
            len++;
        }
        len++;

        while(k>len){
            k=k%len;
        }
        if(len==k)
        return head;

        // int count=0;
        // ListNode current=head;
        // ListNode prev=null;
        // while(count!=k){
        //     count++;
        //     prev=current;
        //     current=current.next;
            
        // }
        // ListNode newhead=current.next;
        // current.next=null;
        // ListNode  con=newhead;
        // if(con==null)
        // {
        //     current.next=prev;
        //     prev.next=null;
        //     return current;
        // }
        // while(con.next!=null){
        //     con=con.next;
        // }
        // con.next=head;
        // return newhead;

        idk.next=head;

        idk = head;

        int count=1;
        while(count!=len-k){
            idk=idk.next;
            count++;
        }
        head=idk.next;
        idk.next=null;
        return head;
    }
}