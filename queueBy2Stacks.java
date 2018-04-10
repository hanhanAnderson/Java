public class Solution {
	private LinkedList<Integer> in;
	private LinkedList<Integer> out;	

	public Solution() {
    // Write your solution here.
		in = new LinkedList<Integer>();
		out = new LinkedList<Integer>();		
	}
	public Integer poll() {
		move();
		if(out.isEmpty()) {
		return null;
		}
		return out.pollFirst();
	}

	public void offer(int value) {
		in.offerFirst(value);
	}

	public Integer peek() {
		move();
		if(out.isEmpty()) {
			return null;
		}
		return out.peekFirst();
	}


	private void move() {
		if(out.isEmpty()) {
			while (!in.isEmpty()){
				out.offerFirst(in.pollFirst());
			}
		}
	}
	public int size (){
		return in.size() + out.size();
	}
	public boolean isEmpty() {
		return in.size() ==0 && out.size() == 0;
	}
}


