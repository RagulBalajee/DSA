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
    public ListNode mergeNodes(ListNode head) {
        int sum=0;
        ListNode copy = new ListNode(0);
        ListNode dummy = copy;
        head=head.next;
        while(head!=null){
            if(head.val != 0){
                sum+=head.val;
            }else if(head.val==0){
                dummy.next = new ListNode(sum); 
                sum=0;
                dummy = dummy.next;
            }head=head.next;
        }return copy.next;
    }
}