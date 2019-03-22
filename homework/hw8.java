package hwhome;

import java.util.Scanner;
import java.util.Vector;

public class hw8 {
	public static void main(String args[]) {
		
		Vector vc= new Vector();
		Scanner in=new Scanner(System.in);
		int temp;
		for(int i=0;i<10;i++) {
			temp=in.nextInt();
			vc.add(temp);
		}
		temp=(int)vc.elementAt(0);
		for(int i=1;i<10;i++) {
			if(temp<(int)vc.elementAt(i))temp=(int)vc.elementAt(i);
		}
		System.out.println(temp);
	}
}
