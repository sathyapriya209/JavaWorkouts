package com.collection;

public class DivisorTest {
	public final String str;
	public DivisorTest() {
		str = "test";
	}
	public final int divisor_sum(int n){
		int sum=0;
        for(int i=1;i<=n ;i++){
            if(n%i==0){
            	sum=sum+i;
            }
        }
		return sum;
            
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object d1= new DivisorTest();
		System.out.println(d1.getClass());
		if(d1 instanceof DivisorTest) {
			DivisorTest d2 = (DivisorTest) d1;
			int total=d2.divisor_sum(6);
			System.out.println(total);
		}
		
	}

}
