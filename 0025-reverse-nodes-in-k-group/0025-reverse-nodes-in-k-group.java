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
    public ListNode getkthnode(ListNode temp,int k){
        k-=1;
        while(temp!=null&&k>0){
            k--;
            temp=temp.next;
        }
        return temp;
    }
    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
          ListNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prevnode=null;
        while(temp!=null){
            ListNode kthnode=getkthnode(temp,k);
            if(kthnode==null){
                if(prevnode!=null){
             prevnode.next=temp;
                }
                break;
            }
            ListNode nextnode=kthnode.next;
            kthnode.next=null;
            reverse(temp);
            if(temp==head){
                head=kthnode;  
            } else{
                prevnode.next=kthnode;
            }
            prevnode=temp;
            temp=nextnode;
        }
        return head;
    }
}