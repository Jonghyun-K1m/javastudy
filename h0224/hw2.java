package h0224;

import java.util.*;

class SearchStr{
	
	public void ser(String abc) {
		int len=abc.length();
		int[] arr=new int[100];
		for(int i=0;i<100;i++) {
			arr[i]=0;
		}
		for(int i=0;i<len;i++) {
			arr[abc.charAt(i)]++;
		}
		
		for(char i='A';i<='Z';i++) {
			System.out.print(i+">>");
			System.out.println(arr[i]);
			
		}
	}
}

public class hw2 {


	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		String strinput,cut;
		
		strinput=in.nextLine();

		
		cut=strinput.toUpperCase();
		
		SearchStr strr=new SearchStr();
		strr.ser(cut);


	}
}
