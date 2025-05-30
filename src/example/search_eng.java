package example;

import java.util.*;

//Array list because allows duplicates efficient for indexed access
public class search_eng {
	public static void list(){
		List<String> results = new ArrayList<>();
		results.add("Article: How to learn Java");
		results.add("Video: Java tutorial for beginners");
		results.add("blog: Java learning path");
		results.add("Article: How to learn Java");
		System.out.println(" The search results: "+ results);
	}

}
