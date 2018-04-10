public class Solution {
  public int binarySearch(int[] array, int target) {
    // Write your solution here.
    if(array == null || array.length == 0){
    	return -1;
    }
    int left = 0;
    int right = array.length -1;
    while(left <= right){
    	int mid = left - (left - right) /2;
      if(array[mid] == target){
      	return mid;
      }else if(target < array[mid]){
        right = mid - 1;
      }else {
      	left = mid +1;
      }
    }
    return -1;
  }
}

