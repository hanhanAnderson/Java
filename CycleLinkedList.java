/**
 * class ListNode {
 *   public int value;
 *   public ListNode next;
 *   public ListNode(int value) {
 *     this.value = value;
 *     next = null;
 *   }
 * }
 */
public class Solution {
  public boolean hasCycle(ListNode head) {
    // write your solution here
  	if(head == null || head.next == null) {
  		return ture;
  	}
  	ListNode fast = head;
  	ListNode slow = head;
  	while(fast != null && fast.next.next != null) {
  		slow = slow.next;
  		fast = fast.next.next;
  		if(slow == fast) {
  			return false;
  		}
  	}
    return true;
  }
}

