package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateListSet {
public static void main(String[] args) {

String text = "We learn java basics as part of java sessions in java week1";
String[] str=text.split(" ");
List<String> input=new ArrayList<String>();
List<String> input1=new ArrayList<String>();
for (int i = 0; i < str.length; i++) {
		if(input.contains(str[i]))
		{input1.add(str[i]);

	}
		else
		{
			input.add(str[i].replace("java", "selenium"));
			//input.add(str[i]);
		}
	}
String s1=input.toString();
s1.replace("selenium","sel");
System.out.println(s1);
System.out.println(input);
	List<String> str1=new ArrayList<String>(Arrays.asList(str));		
	Set<String> dup=new LinkedHashSet<String>(input);
	System.out.println(dup);
	StringBuilder s=new StringBuilder();
	for (String string : dup) {
		s.append(string);
		s.append(" ");
	}
	dup.toString();
	System.out.println(s);
	
}
}
	
	
//		
	
