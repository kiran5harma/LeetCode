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
    ListNode merge(ListNode list1, ListNode list2){
        ListNode temp = new ListNode(0);
        ListNode curr=temp;
        while(list1 !=null && list2!=null){
            if(list1.val<list2.val){
                curr.next=list1;
                list1=list1.next;
            }
            else{
                curr.next=list2;
                list2=list2.next;
            }
            
            curr=curr.next;
        }
        if(list1!=null)
            curr.next=list1;
        else if(list2!=null)
            curr.next=list2;
        
        return temp.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {

        int n =lists.length-1;

        if(n==-1)
        return null;
        
        int i=0;
        
        ListNode head=lists[0];

        while(i!=n){
           i++;
            head=merge(head,lists[i]);
        }
        return head;
    }
}