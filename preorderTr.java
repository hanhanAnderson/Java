public List<Integer> preorder(TreeNode root) {
	List<Integer> preorder = new ArrayList<Integer>();
	if(root == null) {
		return preorder;
	}
	Deque<TreeNode> stack = new LinkedList<TreeNode>();
	stack.offerFirst(root);
	while(!stack.isEmpty()) {
		TreeNode curr = stack.pollFirst();
		if(curr.right != null) {
			stack.offerFirst(curr.right);
		}
		if(curr.left != null) {
			stack.offerFirst(curr.left);
		}
		preorder.add(curr.key);
	}
	return preorder;
}