package com.cg.LambdaAssignments;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class String5 {
	List<String> list=Arrays.asList("Apple","peach","pancake","lion","eagle","sun");

	public static void main(String[] args) {
		String5 s=new String5();
		processWords(s.list);

	}
	public static String processWords(List<String> list) {
		StringBuilder words=new StringBuilder();
		Consumer<String> consumer=p->words.append(p.charAt(0));
		list.stream().forEach(consumer);
		System.out.println(words);
		return words.toString();
	}

}
