package com.cg.Collections;
import java.util.Comparator;
import java.util.*;
import java.util.Set;
import java.util.TreeSet;

class Employee {
	private int id;
	private String name;
	private String Department;
	private int Salary;
	
	public Employee(int id,String name,String Department,int Salary) {
		this.id=id;
		this.name=name;
		this.Department=Department;
		this.Salary=Salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return Department;
	}

	public int getSalary() {
		return Salary;
	}
}
class idComparartor implements Comparator<Employee> {
	public int compare(Employee e1,Employee e2) {
		return e1.getId()-e2.getId();
	}
}
class nameComparator implements Comparator<Employee> {
	public int compare(Employee e1,Employee e2) {
		return e1.getName().compareTo(e2.getName());
	}
}
class depComparator implements Comparator<Employee> {
	public int compare(Employee e1,Employee e2) {
		return e1.getDepartment().compareTo(e2.getDepartment());
		
	}
}
class salComparator implements Comparator<Employee> {
	public int compare(Employee e1,Employee e2) {
		return e1.getSalary()-e2.getSalary();
	}
}


public class Tree3 {

	public static void main(String[] args) {
		
		Employee e1=(new Employee(46290692,"Shabeena","IT",33000));
		Employee e2=(new Employee(45367727,"Rani","IT",25000));
		Employee e3=(new Employee(46872793,"Sindhu","IT",35000));
		Employee e4=(new Employee(43673777,"Pallavi","IT",20000));
		Employee e5=(new Employee(45373727,"Surekha","IT",33000));
		Employee e6=(new Employee(45368977,"Manasa","IT",33000));
		Employee e7=(new Employee(42378337,"Lasya","IT",30000));
		Employee e8=(new Employee(48784734,"Meenakshi","IT",27000));
		Employee e9=(new Employee(47938288,"Usha","IT",24000));
		Employee e10=(new Employee(4536627,"Vidya","IT",40000));
		
		Set<Employee> ts1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1.Id,2.Name,3.Department,4.Salary ");
		int n=sc.nextInt();
		sc.close();
		
		if(n==1)
		{
			ts1=new TreeSet<>(new idComparartor());
		}
		else if(n==2) {
			ts1=new TreeSet<>(new nameComparator());
		}
		else if(n==3) {
			ts1=new TreeSet<>(new depComparator());
		}
		else {
			ts1=new TreeSet<>(new salComparator());
		}
		ts1.add(e1);
		ts1.add(e2);
		ts1.add(e3);
		ts1.add(e4);
		ts1.add(e5);
		ts1.add(e6);
		ts1.add(e7);
		ts1.add(e8);
		ts1.add(e9);
		ts1.add(e10);
		
		for(Employee e:ts1) {
			System.out.println(e.getId()+" "+e.getName()+" "+e.getDepartment()+" "+e.getSalary());
		}
	}
}
