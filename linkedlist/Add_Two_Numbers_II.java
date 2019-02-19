package linkedlist;

import java.util.Stack;

public class Add_Two_Numbers_II {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        
        while(l1 != null){
            s1.push(l1.val);
            l1 = l1.next;
        }
        
        while(l2 != null){
            s2.push(l2.val);
            l2 = l2.next;
        }
        
        int sum = 0;
        ListNode res = new ListNode(0);
        while(!s1.isEmpty() || !s2.isEmpty()){
            if(!s1.isEmpty())   sum += s1.pop();
            if(!s2.isEmpty())   sum += s2.pop();
            res.val = sum % 10;
            ListNode temp = new ListNode(sum / 10);
            temp.next = res;
            res = temp;
            sum /= 10;
        }
        return res.val == 0 ? res.next : res;        
    }
}
