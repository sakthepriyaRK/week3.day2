package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class PrintDuplicates {
	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		List <Integer>PrintDupe=new ArrayList<Integer>();
		for (Integer number : arr) {
			PrintDupe.add(number);
		}
		System.out.println("size:"+PrintDupe.size());int count=0;int t=0;
		for (int i = 0; i <PrintDupe.size()-1 ; i++) {
			
			for (int j = i+1; j <PrintDupe.size()-1 ; j++) {
				if(PrintDupe.get(i).equals(PrintDupe.get(j)))
				{System.out.println("Duplicate Elements"+PrintDupe.get(i));}
				}
			}
		// get the length of the array
		// declare an int variable named count
		
		// iterate from 0 to the array length-1 (outer loop starts here)
		
			// assign 0 to count 
			
			// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
			
					// compare both the loop variables & check they're equal
				
							// increase the count if both the arrays are equal
					
			// Out of the inner loop, check and print the first array variable if count is more than
	}
	 
}
