package com.cg.Collections;
import java.util.*;

public class Products {

	public static void main(String[] args) {
	
		HashSet<String> set=new HashSet<String>();
		set.add("Candies");
		set.add("Icecream");
		set.add("Choclate");
		set.add("Biscuits");
		set.add("Icecream");
		set.add("Candies");
		set.add("shampoo");
		set.add("cake");
		set.add("watch");
		set.add("Biscuits");
		set.add("Bottle");
		set.add("soap");
		set.add("Bedsheets");
		Iterator<String> i=set.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
}
