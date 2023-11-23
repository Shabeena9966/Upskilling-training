package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CourseServiceimpl implements Courseservice {
	
	List<Course> list;
	
	public  CourseServiceimpl() {
		
		list=new ArrayList<>();
		list.add(new Course(145,"Java core course", "this course contains basics of java"));
		list.add(new Course(4343,"spring rest course", "creating rest demo"));

	}

	@Override
	public List<Course> getCourses() {
		return list;
	}
	
	@Override
     public Course getCourse(long courseid) {
		
		Course c=null;
		for(Course course:list)
		{
			if(course.getId()==courseid)
			{
				c=course;
				break;
			}
		}
		return c;
	}

}
