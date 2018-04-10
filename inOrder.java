pulic class TreeNode{
	int value;
	TreeNode next;
	public TreeNode(int val) {
		this.value = val;
	}
}

public void inOrder(TreeNode root) {
	if (root == null) {
		return;
	}
	Deque<TreeNode> stack = new LinkedList<>();
	TreeNode next = root;
	while(next != null || !stack.isEmpty()) {
		if(next != null) {
			stack.offerFirst(next);
			next = next.left;
		} else {
			next = stack.pollFirst();
			System.out.println(next.value);
			next = next.right;
		}
	}
}