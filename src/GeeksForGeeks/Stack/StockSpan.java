package aman.ds.stack;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StockSpan {
	public void calculateSpan(int a[],int b[]){
		for (int i = 1; i < a.length; i++) {
			int span=1;
			b[0]=1;
			for (int j = i-1; (j>=0)&&(a[j]>a[i]); j--) {
			span=span+1;
			
			}
			b[i]=span;

		}
		
	}
	
	
	public static void main(String[] args) {
		int a[]={11,3,5,9,1};
		int b[]=new int[a.length];
		StockSpan sp=new StockSpan();
		sp.calculateSpan(a, b);
		System.out.println(Arrays.toString(b));

	}

}
