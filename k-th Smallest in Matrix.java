public class Solution {
  static class Cell {
  	int row;
  	int column;
  	int value;

  	Cell(int row, int column, int value) {
  		this.row = row;
  		this.column = column;
  		this.value = value;
  	}
  }

  public int kthSmallest(int[][] matrix, int k) {
    // Write your solution here
    if (matrix.length == 0 || k == 0) {
    	return 0;
    }
    int rows = matrix.length;
    int columns = matrix[0].length;

    PriorityQueue<Cell> minHeap = new PriorityQueue<Cell>(k, new Comparator<Cell>() {
    	@Override
    	public int compare (Cell c1, Cell c2) {
    		if (c1.value== c2.value) {
    			return 0;
    		}
    		return c1.value < c2.value ? -1 : 1;
    	}
    });
    boolean visited[][] = new boolean[rows][columns];
    minHeap.offer(new Cell(0, 0, matrix[0][0]));
    visited[0][0] = true;

    for (int i = 0; i < k -1; i++) {
    	Cell curr = minHeap.poll();
    	if(curr.row +1 < rows && !visited[curr.row +1][curr.column]) {
    		minHeap.offer(new Cell(curr.row+1, curr.column , matrix[curr.row+1][curr.column]));
    		visited[curr.row+1][curr.column] = true;
    	}
    	if(curr.column +1 < columns && !visited[curr.row][curr.column +1]) {
    		minHeap.offer(new Cell(curr.row, curr.column +1, matrix[curr.row][curr.column +1]));
    		visited[curr.row][curr.column + 1] = true;
    	}
    }
    return minHeap.peek().value;
  }
}
