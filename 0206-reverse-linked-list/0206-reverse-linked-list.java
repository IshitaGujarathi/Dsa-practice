
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        
        ListNode prev = null;
        ListNode curr = head;
        ListNode temp = head.next;  

        while(temp != null){
            curr.next = prev;
            prev = curr;
            curr = temp;
            temp = temp.next;
        }

        curr.next = prev;

        return curr;
    }
}