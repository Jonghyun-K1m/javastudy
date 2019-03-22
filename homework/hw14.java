package hwhome;

import java.util.Scanner;
import java.util.Vector;

class WordG extends Thread{
	Vector<String> vc=new Vector<>();
	String [] data = 
		{"태연", "유리", "윤아", "효연", "수영", "서현", "티파니", "써니", "제시카"};	
	
	public void run() {
		for(int i=0;i<9;i++) {
			try {Thread.sleep(1000);}
			catch(InterruptedException e) {};
			vc.add(data[i]);
			//System.out.print(vc.elementAt(i));
			
		}
	}
	public synchronized void set(String str) {
		vc.remove(str);
		for(int i=0;i<vc.size();i++) {
			System.out.print(vc.elementAt(i));
		}
	}
	
}
public class hw14 {
	public static void main(String[] args) {
		boolean run=true;
		Scanner in=new Scanner(System.in);
		WordG word=new WordG();
		word.start();
		while(run) {
			
			String input=in.next();
			if(input.equals("끝"))run=false;
			word.set(input);
		}
	}
}
