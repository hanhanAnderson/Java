public class Solution {
    public int[] solve(int[] array) {
    // Write your solution here
        if (array == null || array.length == 0){
          return array;
      }
      for(int i = 0; i< array.length - 1; i++){
         int min = i;
         for(int j = i + 1; j< array.length; j++){
           if (array[j] < array[min]){
             min = j;
         } 
     }
        swap(array, min , i); 
}
    return array;
}
    public void swap(int [] array , int ii, int jj){
    int temp = array[ii];
    array[ii] = array[jj];
    array[jj] = temp;
}
}
