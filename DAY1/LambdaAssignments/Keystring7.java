package com.cg.LambdaAssignments;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
public class Keystring7 {
	public static void main(String[] args) {
		HashMap<String,Integer> map=new HashMap<>();
		map.put("Shabeena",452);
		map.put("Chandana",473);
		map.put("Tejaswini",489);
        
		Keystring7 k=new Keystring7();
		k.convertKeyValueToString(map);
	}
	public String convertKeyValueToString(HashMap<String,Integer> map) {
		
		StringBuilder str=new StringBuilder();
		Consumer<Map.Entry> consumer=(p)->str.append(p.getKey()).append(p.getValue());
		Set set=map.entrySet();
		set.stream().forEach(consumer);
		System.out.println(str);
		return str.toString();
	
        
	}

}
