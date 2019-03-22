package hwhome;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

class filecall {
	
	
	public String choice(){
		
		BufferedReader br=null;
		Random rd=new Random();
        int count=0;
		int i,run=0;
		String str=null;
		try {
			br=new BufferedReader(new FileReader("src/hwhome/word.txt"));
		
			while((str=br.readLine())!=null) {
				count++;
			}
			
			i=rd.nextInt(count);
			br=new BufferedReader(new FileReader("src/hwhome/word.txt"));
			while(run<i) {	
				str=br.readLine();
			//	System.out.println(str);
				run++;
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return str;
		
	}
}
public class hw10 {
	
	public static void ab() {
	
		
	}
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		filecall fc= new filecall();
		String hank=fc.choice();
		String guess;
		String ba;
		String newhank=hank;
		String non="-";

		//hank=hank.toLowerCase();
		//System.out.println(hank);
		System.out.println("행맨 라이프는 5개입니다 ");

		System.out.println("맞춰야할 단어의 개수는 " + hank.length());

		
		for(int k=0;k<hank.length();k++) {
			System.out.print(" _");
		}
		System.out.println();

		
		for(int i=0;i<5;i++) {
			guess=in.next();	
			for(int m=0;m<hank.length();m++) {
			
				ba=hank.substring(m, m+1);
				if(guess.equals(ba)) {
					//System.out.println("Good");
					newhank=newhank.replace(ba, non);	
				}	
				
			}
			//System.out.println(newhank);
			for(int h=0;h<hank.length();h++) {
				ba=newhank.substring(h, h+1);
				if(ba.equals("-")){
					System.out.print(hank.substring(h,h+1));			
				}else System.out.print(" _");
				
			}
			System.out.println();
	
		
		
		}
		System.out.println(hank);
	}

}
