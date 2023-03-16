package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		String string = null;
		String[] split = text.split(" ");
		List<String> list = new ArrayList<String>(Arrays.asList(split));
		//list.add(split);
		Set<String> set = new LinkedHashSet<String>(list);
		System.out.println(set);

	}

}
