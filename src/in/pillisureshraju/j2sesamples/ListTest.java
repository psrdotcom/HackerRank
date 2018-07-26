package in.pillisureshraju.j2sesamples;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		 List<Integer> elements = new ArrayList<>();
		 elements.add(10);
		 int firstElmnt = elements.get(0);
		 System.out.println(firstElmnt);
		 
		 StringBuilder s1 = new StringBuilder("Java");
		 String s2 = "Love";
		 s1.append(s2);
		 s1.substring(4);
		 int foundAt = s1.indexOf(s2);
		 System.out.println(foundAt);
		 
		 }
}
