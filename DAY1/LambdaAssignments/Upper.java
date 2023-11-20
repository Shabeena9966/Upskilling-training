package com.cg.LambdaAssignments;
import java.util.ArrayList;
import java.util.function.UnaryOperator;

class Op implements UnaryOperator<String> {
	public String apply(String str) {
		return str.toUpperCase();
	}
}

public class Upper {

	public static void main(String[] args) {
	  ArrayList<String> list=new ArrayList<>();
	  list.add("Tom and Jerry");
	  list.add("Doraemon");
	  list.add("Chotha Bheem");
	  list.add("Pokemon");
	  list.add("Takeshi's Castle");
	  System.out.println("contents:"+list);
	  list.replaceAll(new Op());
	  System.out.println("contents after replace operation:"+list);

	}

}
