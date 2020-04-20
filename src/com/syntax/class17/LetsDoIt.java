package com.syntax.class17;

public class LetsDoIt {
protected int sumOfArray (int[] arr){
	int sum=0;
	for (int i=0; i<arr.length; i++) {
		sum+=arr[i];
	}
	return sum;
}
	
	
	
	public static void main(String[] args) {
		LetsDoIt obj=new LetsDoIt();
		int [] arr= {3,5,7,3};
		System.out.println(obj.sumOfArray(arr));
		
	}

}
