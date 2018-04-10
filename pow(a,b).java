public class Solution {
  public long power(int a, int b) {
    // Write your solution here
    if(a == 1) return 1;
    if(b == 0) return 1;
    if(b == 1) return a;
    if(b % 2 == 1){
        //long temp = power(a,b);
        // return temp*temp;
    	return power(a, b/2)*power(a, b/2)*a;
    }else{
    	return power(a, b/2)*power(a, b/2);
    }
  }
}