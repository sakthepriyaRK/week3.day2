package week3.day2;



import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class removeDuplicatesSet {
	public static void main(String[] args) {
		String text = "we learn java basics as part of java sessions in java week1";
		String[] str=text.split(" ");
		Set<String> input=new TreeSet<String>();
		for (String each : str) {
		input.add(each);
			}
		System.out.println(input);
		
		
	}

}
