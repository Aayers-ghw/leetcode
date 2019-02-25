package linkedlist;

import java.util.HashSet;
import java.util.Set;

public class Linked_List_Components {

    public int numComponents(ListNode head, int[] G) {
        int res = 0;
        Set<Integer> set = new HashSet<>();
        for(int g : G){
            set.add(g);
        }
        while(head != null){
            if(set.contains(head.val) && (head.next == null || !set.contains(head.next.val))){
                res++;
            }
            head = head.next;
        }
        return res;
    }
}
