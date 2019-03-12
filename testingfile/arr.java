package hwhome;

import java.util.ArrayList;

import java.util.Iterator;

public class arr {
	public static void main(String args[]) {
		
		ArrayList<Integer> list1=new ArrayList<Integer>();
		ArrayList<Integer> list2=new ArrayList<Integer>();

		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		System.out.println("교집합");	
		System.out.println(list1.retainAll(list2));
		Iterator it3= list1.iterator();
		while(it3.hasNext()){
			System.out.println(it3.next());
		}

		System.out.println("합집합");	
		System.out.println(list1.addAll(list2));
		Iterator it2= list1.iterator();
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
		
		System.out.println("차집합");	
		System.out.println(list1.removeAll(list2));
		Iterator it1= list1.iterator();
		while(it1.hasNext()){
			System.out.println(it1.next());
		}
		
	}
}
