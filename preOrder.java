pulic class TreeNode{
	int value;
	TreeNode next;
	public TreeNode(int val) {
		this.value = val;
	}
}

public void preOrder(TreeNode root) {
	if(root == null) {
		return;
	}
	Deque<TreeNode> stack = new LinkedList<>();
	stack.offerFirst(root);
	while(!stack.isEmpty) {
		TreeNode curr = stack.pollFirst();
		System.out.println(curr.value);
		if(curr.right != null) {
			stack.offerFirst(curr.right);
		}
		if(curr.left != null) {
			stack.offerFirst(curr.left);
		}
	}
}