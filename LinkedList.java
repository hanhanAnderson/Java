class ListNode {
	public int val;
	ListNode next;
	//ListNode prev; 
	public ListNode(int val){
		this.val = val;
	}

}


reverse(ListNode head){
	if(head == null || head.next = null){
		return head;
	}

}

class ListNode{

	public int val;
	public ListNode next;
}
// N1   N2   N3
  head  next
reverse1(ListNode head){
	 
	ListNode pre = null;     int x = 1;
							   
							int y = x;
							
	ListNode cur = head;
	ListNode next =null;
	while(cur != null){
		next = cur.next;
		cur.next = pre;   //*****
		pre = cur;
		cur = next;
	}   
	return pre;
}


N1 -> N2 -> N3 -> N4;

ListNode reverse2(ListNode head)
{
	if(head == null|| head.next == null)
	{
		return head;
	}
	ListNode NewHead = reverse2(head.next);
	head.next.next = head;
	head.next = null;
	return NewHead;

}
reverse(N1)---------------
head: N1    ListNode NewHead = reverse(N2) 
head: N2    ListNode NewHead = reverse(N3) = N3
head: N3




			N1  ->     null<-N2  <-  N3     
	 
N1:    ListNode NewHead = reverse(N2) = N3
N2:    ListNode NewHead = reverse(N3) = N3            Null <- N1 <- N2 <- N3
N3:    reverse(N3) = N3 















