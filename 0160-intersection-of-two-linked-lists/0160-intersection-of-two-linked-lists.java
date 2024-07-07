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
        ListNode temp1=headA;
        ListNode temp2=headB;
        int c1=0;int c2=0;
        while(temp1!=null){
            temp1=temp1.next;
            c1++;
        }
        while(temp2!=null){
            temp2=temp2.next;
            c2++;
        }
         temp1=headA;
        temp2=headB;
        int diff=Math.abs(c1-c2);
        if(c1>c2){
            for(int i=0;i<diff;i++){
                temp1=temp1.next;
            }
        }
       else  if(c2>c1){
            for(int i=0;i<diff;i++){
                temp2=temp2.next;
            }
        }
        while(temp1!=null && temp2!=null){
            if(temp1==temp2){
                return temp1;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return null;
    }
    
}