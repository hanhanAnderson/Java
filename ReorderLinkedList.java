public class ReorderList {
	public ListNode reOrder(TreeNode head) {
		if(head == null || head.next == null) {
			return head;
		}
		List mid = middle(head);
		ListNode one = head;
		ListNode two = mid.next;
		mid.next = null;
		return merge(one, reverse(two));
	}
	private ListNode middle(TreeNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		  ListNode slow = head;
		  ListNode fast = head;
		  while(slow.next != null || slow.next.next != null) {
		  	slow = slow.next;
		  	fast = slow.next.next;
		  }
		  return slow;
		}
	private void reverse(ListNode head) {
		if(head == null || head.next = null) {
			ListNode curr = head;
			ListNode next = head;
			ListNode prev = null;
			while()
		}
	}
}
