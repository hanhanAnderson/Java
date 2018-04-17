public class Solution {
	public int[] kSmallest(int[] array, int k) {
    // Write your solution here
		if(array.length == 0 || k == 0) {
			return new int[0];
		}
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1.equals(o2)) {
					return 0;
				}
				return o1 > o2? -1 : 1;
			}
		});
		for (int i = 0; i < array.length; i++){
			if(i < k) {
				maxHeap.offer(array[i]);
			} else if(array[i] < maxHeap.peek()) {
				maxHeap.poll();
				maxHeap.offer(array[i]);
			}
		}
		int[] result = new int[k];
		for (int i = k - 1; i>= 0; i--) {
			result[i] = maxHeap.poll();
		}
		return result;
	}
}
