package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindIntersectionList {
public static void main(String[] args) {
	int[] a= {3,2,11,4,6,7};
	int [] b={1,2,8,4,9,7};
	List<Integer> list1=new ArrayList<Integer>();
	List<Integer> list2=new ArrayList<Integer>();
	for (Integer a1 : a) {
		list1.add(a1);
	}
	System.out.println(list1);
	for (Integer b1 : b) {
		list2.add(b1);
		}
list2.retainAll(list1);
System.out.println(list2);
	
		

}}

