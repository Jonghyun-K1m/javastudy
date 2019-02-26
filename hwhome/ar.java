package hwhome;

import java.util.ArrayList;
import java.util.*;
class Student implements Comparable<Student>{
	String name;
	int total;
	int kor,eng,math;
	Student(String name,int total){
		this.name=name;
		this.total=total;
	}
	Student(){
		
	}
	public int getTotal() {
		return total;
	}
	@Override
	public int compareTo(Student Stu) {
	//	return ((Integer)total).compareTo(Stu.getTotal());
		return ((Integer)Stu.getTotal()).compareTo((Integer)total);
		
	}
}

public class ar {
	public static void main(String args[]) {
		ArrayList<Student> list=new ArrayList<Student>();
		Student in = new Student("A",111190);
		Student in1 = new Student("B",180);
		Student in2 = new Student("C",8220);
		
		list.add(in);
		list.add(in1);
		list.add(in2);
		Collections.sort(list);
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i).name);
			System.out.println(list.get(i).total);
			
		}
	}
}
