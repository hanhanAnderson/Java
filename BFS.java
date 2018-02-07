public void BFS(Node root){
	if(root == null){
		return;
	}
	Queue<Node> q = new LinkList<Node>();
	q.offer(root);
	int level = 0;
	while(!q.empty()){
		int size = q.size();
		for(int i = 0; i< size; i++) {
			Node n = q.remove();
			if(n.left != null) {
				q.offer(n.left);
			}
			if(n.right != null) {
				q.offer(n.right);
			}
			System.out.print(n.val+"");
		}
		level++;
		System.out.println();
	}
}