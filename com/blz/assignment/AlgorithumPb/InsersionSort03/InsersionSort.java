package com.blz.assignment.AlgorithumPb.InsersionSort03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InsersionSort {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Shubham");
		list.add("Saurabh");
		list.add("Bazeela");
		list.add("Pallavi");
		list.add("Bittu");
		list.add("Rudra");
		System.out.println("before sorting: \n"+list);
		Collections.sort(list);
		System.out.println("after sorting: \n"+list);
		
	}
}
