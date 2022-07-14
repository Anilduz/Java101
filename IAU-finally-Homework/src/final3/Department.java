package final3;

import java.util.ArrayList;

public class Department {
	
	String title, faculty;
	
	ArrayList<Course> courses;
	
	void addCourse(Course course) {
		this.courses.add(course);
	}

}
