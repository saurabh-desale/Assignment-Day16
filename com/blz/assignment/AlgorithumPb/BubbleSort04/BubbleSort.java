package com.blz.assignment.AlgorithumPb.BubbleSort04;

public class BubbleSort {
	public static void main(String[] args) {
		int array[] = {2,1,-8,4,2,3};
		int n = array.length;
		System.out.println("before sorting: ");	
		for(int item: array) {
			System.out.print(item+" ");
		}
		System.out.println();
		
		for (int i =0; i<n-1; i++) {
			for (int j=0; j<n-1 ;j++) {
				if (array[j+1] < array[j]) {
					int temp = array[j+1];
					array[j+1]=array[j];
					array[j]=temp;
			}
		}
	}
	System.out.println("after sorting: ");	
	for(int item: array) {
		System.out.print(item+" ");
	}
}
}