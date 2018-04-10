pulic class TreeNode{
	int value;
	TreeNode next;
	public TreeNode(int val) {
		this.value = val;
	}
}

public void postOrder(TreeNode root){
	if(root == null) {
		return ;
	}
	Deque<TreeNode> stack = new LinkedList<>();
	TreeNode prev = null;
	stack.offerFirst(root);

	while(!stack.isEmpty()) {
		TreeNode curr = stack.peekFirst();
		if(prev == null || curr == prev.left || curr == prev.right){
			if(curr.left != null){
				stack.offerFirst(curr.left);
			} else if (curr.right != null) {
				stack.offerFirst(curr.right);
			} else {
				System.out.println(curr.value);
				stack.pollFirst();
			}
		} else if(prev == curr.left) {
			if (curr.right != null) {
				stack.offerFirst(curr.right);
			} else {
				System.out.println(curr.value);
				stack.pollFirst();
			}
		} else { //prev == cur.right
			System.out.println(curr.value);
			stack pollFirst();
		}
		prev = curr;
	}
}