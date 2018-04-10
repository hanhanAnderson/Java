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
  public ListNode merge(ListNode one, ListNode two) {
    // write your solution here
    ListNode dummy = new ListNode(-100);
    ListNode curr = dummy;
    while(one != null && two != null){
    	if(one.value <= two.value) {
    		curr.next = one;
    		one = one.next;
    	} else {
    		curr.next = two;
    		two = two.next;
    	}
      curr = curr.next;
    }
    if(one == null){
    	curr.next =two;
    } else {
    	curr.next = one;
    }
    return dummy.next;
  }
}


