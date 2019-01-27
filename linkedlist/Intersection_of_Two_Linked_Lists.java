package linkedlist;

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
public class Intersection_of_Two_Linked_Lists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        if(headA == null || headB == null){
            return null;
        }
        ListNode A = headA;
        ListNode B = headB;
        while(A != B){
            if(A == null){
                A = headB;
            } else {
                A = A.next;
            }  
            if(B == null) {
                B = headA;
            }else{
                B = B.next;
            }
        }
        return A;
    }
}
