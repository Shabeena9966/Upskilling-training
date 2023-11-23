package com.example.demo;

import java.util.List;

public interface Courseservice {
	
	public List<Course> getCourses();
	
	public Course getCourse(long courseid);
	
}
