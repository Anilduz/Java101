package final3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class School {
	
	ArrayList<Student> students = new ArrayList<Student>();
	
	void addStudent(Student stu) {
		this.students.add(stu);
	}
	
	void writeFile() throws IOException {
		File file = new File("C:\\Users\\Win10\\Desktop\\Java reader-writer files\\finalTutorial1.txt");
		FileWriter fwriter = new FileWriter(file);
		BufferedWriter bfwriter = new BufferedWriter(fwriter);
		
		for (Student s : students) {
			bfwriter.write(s.name);
			bfwriter.newLine();
			
			bfwriter.write(s.surname);
			bfwriter.newLine();
			
			bfwriter.write(String.valueOf(s.age));
		    bfwriter.newLine();
			
			bfwriter.write(s.surname);
			bfwriter.newLine();
			
			bfwriter.write(s.getCity());
			bfwriter.newLine();
			
			bfwriter.write(s.department.title);
			bfwriter.newLine();
			
			bfwriter.write(s.department.faculty);
			bfwriter.newLine();
			
			for (Course c : s.department.courses) {
				bfwriter.write(c.title);
				bfwriter.newLine();
				
				bfwriter.write(String.valueOf(c.credits));
				bfwriter.newLine();
			}
		}
		
		bfwriter.close();
	}

	public static void main(String[] args) throws IOException {
		
		School obj = new School();
		
		Department dept = new Department();
		dept.title = "Computing";
		dept.faculty = "Engineering";
		dept.courses = new ArrayList<Course>();
		dept.addCourse(new Course("Network", 3));
		dept.addCourse(new Course("Web Design", 5));
		
		Department dept2 = new Department();
		dept2.title = "Literature";
		dept2.faculty = "Art&Scince";
		dept2.courses = new ArrayList<Course>();
		dept2.addCourse(new Course("Novel", 2));
		dept2.addCourse(new Course("Drama", 3));
		
		Student stu = new Student("Lisa", "Gray", 20, "Female");
		stu.setCity("London");
		stu.setStuNubmer(111);
		stu.department = new Department();
		stu.department = dept;
		
		Student stu2 = new Student("Ahmet", "Y�lmaz", 21, "Male");
		stu2.setCity("Istanbul");
		stu2.setStuNubmer(222);
		stu2.department = new Department();
		stu2.department = dept2;
		
		obj.addStudent(stu);
		obj.addStudent(stu2);
		obj.writeFile();
		
	}

}
