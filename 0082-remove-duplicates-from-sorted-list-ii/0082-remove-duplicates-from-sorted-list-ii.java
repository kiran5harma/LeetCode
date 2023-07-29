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
    public ListNode deleteDuplicates(ListNode head) {
       if(head==null)
        return null;
        // HashSet<Integer> set = new HashSet<>();
        ListNode dummy = new ListNode();
        dummy.next=head;
        ListNode current=dummy;
      
        while(current.next!=null&& current.next.next!=null){
     
            if(current.next.val==current.next.next.val){
                int value=current.next.val;
                 while(current.next!=null&&(value==current.next.val)){
                    current.next=current.next.next;
                }
            }
            else{          
               current=current.next; 
            }
          
        }
        return dummy.next;
    }
}