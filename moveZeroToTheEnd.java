public class solution{
	public int[] mov_0 (int[] array){
		if((array == null)||(array.length<1)){
			return array;
		}
		int left = 0, right = array.length-1;
		while(left<=right){
			if(array[left]!=0){
				left++;
			}else if (array[right]==0){
				right--;
			}else {
				swap(array,left++,right--);
			}
		}
		return array;
	}
	private void swap_arr(int[] array, int a, int b){
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

}