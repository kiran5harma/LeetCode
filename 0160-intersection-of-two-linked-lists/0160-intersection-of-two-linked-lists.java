/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null)
        return null;
        HashSet<ListNode> set = new HashSet<>();
        while(headA!=null){
            if(!set.contains(headA))
            set.add(headA);
            else
            return headA;
            headA=headA.next;}
        while(headB!=null){
            if(!set.contains(headB))
            set.add(headB);
            else
            return headB;
            headB=headB.next;
        }
        return null;
    }
}