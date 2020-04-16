/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution 
{
       
         
    public ListNode middleNode(ListNode head) {

        
//    approch1
// ListNode[] A = new ListNode[100];
//         int t = 0;
//         while (head.next != null) {
//             A[t++] = head;
//             head = head.next;
//         }
//         return A[t / 2];
  
           // approch2
       ListNode slow = head;
       ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
       
    }      
    
}