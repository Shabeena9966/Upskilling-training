package com.cg.LambdaAssignments;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.Collection;

interface RemoveDup {
	public int removeDup(String str);
}

public class Remove4 {
	public ArrayList<String> removeOddLength(ArrayList<String>employeeList) {
		ArrayList<String> list=new ArrayList<>();
		
		Predicate<String> filterEmp=(p)->{
			if(Math.floorMod(p.length(),2)==0)
				return true;
			else
				return false;
		};
		
		employeeList.stream().filter(filterEmp).forEach(p->list.add(p));
		return list;
	}

	public static void main(String[] args) {
		ArrayList<String> employeeList=new ArrayList<>();
		employeeList.add("Shabeena");
		employeeList.add("Surekha");
		employeeList.add("Manasa");
		employeeList.add("Chandana");
		employeeList.add("Tejaswini");
		
		Remove4 remove=new Remove4();
		System.out.println(remove.removeOddLength(employeeList));
	}
}
