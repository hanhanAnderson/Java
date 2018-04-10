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


// if multiple same values for target:
// small -> equal -> large
public class Solution {
	public ListNode partition(ListNode head, int target) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode small = new ListNode(0);
		ListNode large = new ListNode(0);
		ListNode currSmall = small;
		ListNode currLarge = large;
		ListNode curr = head;
		while (curr != null) {
			if(curr.value < target) {
				currSmall.next = curr;
				currSmall = currSmall.next;
			} else {
				currLarge.next = curr;
				currLarge = currLarge.next;
			}
			curr = curr.next;
		}
		currSmall.next = large.next;
		currLarge.next = null;
		return small.next;
	}
}

