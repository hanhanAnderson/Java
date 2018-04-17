/**
 * public class GraphNode {
 *   public int key;
 *   public List<GraphNode> neighbors;
 *   public GraphNode(int key) {
 *     this.key = key;
 *     this.neighbors = new ArrayList<GraphNode>();
 *   }
 * }
 */
public class Solution {
	public boolean isBipartite(List<GraphNode> graph) {
    // write your solution here



		HashMap<GraphNode, Integer> visited = new HashMap<GraphNode, Integer>();
		for(GraphNode node : graph) {
			if(!BFS(node, visited)) {
				return false;
			}
		}
		return true;
	}
	private boolean BFS(GraphNode node, HashMap visited) {
		if(visited.containsKey(node)) {
			return true;
		}
		Queue<GraphNode queue = new LinkedList<GraphNode>();
		queue.offer(node);
		visited.put(node, 0);
		while(!queue.isEmpty()) {
			GraphNode curr = queue.poll();
			int currGroup = visited.get(curr);
			int neibGroup = (currGroup == 0 ? 1 : 0);
			for (GraphNode nei : curr.neighbors) {
				if(!visited.containsKey(nei)) {
					visited.put(nei, neibGroup) ;
					queue.offer(nei);
				} else if(visited.get(nei) != neibGroup) {
					return false;
				}
			}
		}
		return true;
 	}
}
