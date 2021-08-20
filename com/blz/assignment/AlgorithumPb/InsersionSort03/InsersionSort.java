package com.blz.assignment.AlgorithumPb.InsersionSort03;


public class InsersionSort {

	public static void main(String[] args) {
		
	String array[] = {"papu","Bunty","Bubly","jamun","rocky","Bheem"};
	int n = array.length;
	System.out.println("before sorting: ");	
	for(String item: array) {
		System.out.print(item+" ");
	}
	System.out.println();
	
	for (int i =1; i<n ; i++) {
		String temp = array[i];
		int j = i-1;
		while(j >= 0 && array[j].compareTo(temp)>0) {
			array[j+1] = array[j];
			j--;
		}
		array[j+1]=temp;
	}
	
	System.out.println("after sorting: ");	
	for(String item: array) {
		System.out.print(item+" ");
	}
	}
}
