package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementList {
public static void main(String[] args) {
	int[] arr = {1,2,3,4,6,7,8};
	List<Integer> array=new ArrayList<Integer>();
for (Integer num : arr) {
			array.add(num);
		}	
		System.out.println(array);
		for(int i=1;i<array.size();i++)
			{
			if(i!=array.get(i-1))
			{
			System.out.println((i));
			break;
		}
		}
		}
}	
			
			

			
		


