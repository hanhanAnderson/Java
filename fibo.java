//recursive way
public long fibo0(int k){
	if(k <= 0){
		return 0;
	}
	if(k == 1 || k == 2){
		return 1;
	}
	else return fibo0(k-1)+ fibo0(k-2);
}

//dp solution
public long fibo1(int k){
	if(k <= 0){
		return 0;
	}
	long[] array = new long[k+1];
	array[0] = 0;
	array[1] = 1;
	array[2] = 1;
	for(int i = 3; i<=k; i++){
		array[i] = array[i-2]+ array[i-1];
	}
	return array[k];
}