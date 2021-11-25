package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargest {
	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		List <Integer> SecondLarge=new ArrayList<Integer>();
				for (Integer number : data) {
					SecondLarge.add(number);
				}
				System.out.println("given list:"+SecondLarge);
			Collections.sort(SecondLarge);	
			System.out.println("Sorted list:"+SecondLarge);
			
				System.out.println("Secondlargest in list:"+SecondLarge.get(SecondLarge.size()-2));
				}
}

