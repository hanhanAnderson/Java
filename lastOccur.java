public class Solution {
  public int lastOccur(int[] array, int target) {
    // Write your solution here
    if(array == null || array.length == 0){
    	return -1;
    }
    int left = 0;
    int right = array.length - 1;
    while(left < right - 1){
    int mid = left - (left - right)/2;
      if(array[mid] > target){
      	right = mid;
      }else{
      	left = mid;
      }
    }
    if(array[right] == target){
    	return right;
    }else if(array[left] == target){
    	return left;
    }
    return -1;
    
    
  }
}
