/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {

        //HASHMAP

        // HashSet<ListNode> set = new HashSet<>();
        // ListNode current=head;
        // while(current!=null){
        //     if(set.contains(current))
        //     return true;
        //     set.add(current);
        //     current=current.next;
        // }
        // return false;

        //TWO POINTERS----SLOW AND FAST

        if(head==null)
        return false;
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null&&fast.next!=null){
            if(slow==fast)
            return true;
            slow=slow.next;
            fast=fast.next.next;
        }
        return false;
    }
}