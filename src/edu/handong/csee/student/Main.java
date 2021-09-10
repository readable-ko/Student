package edu.handong.csee.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> al = new ArrayList<Student>();
		System.out.println("Student List (ordered by name)");
		
		Student s1 = new Student(101,"Daniel",23);
		al.add(s1);
		Student s2 = new Student(102,"Choi",21);
		al.add(s2);
		al.add(new Student(103,"Park",25));
		al.add(new Student(104,"Ko",24));
		al.add(new Student(105,"Lee",22));
		al.add(new Student(106,"Moon",23));
		al.add(new Student(107,"Abram",25));
		al.add(new Student(108,"Hong",35));
		al.add(new Student(109,"Seo",22));
		al.add(new Student(110,"Jang",24));
		
		Collections.sort(al);
		for(Student s : al) {
			System.out.println(s.toString());
		}
		System.out.println("\nStudent List (reverse ordered by name)");
		
		Collections.sort(al, Collections.reverseOrder());
		
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i).toString());
		}
	}

}
