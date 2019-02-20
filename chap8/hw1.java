package chap8;
import java.util.Scanner;
				//끝말잇기게임
public class hw1 {

	public static void main(String[] args) {
		boolean run=true;
		int count=1;
		int hlong;
		Scanner in=new Scanner(System.in);
		String array[] = new String[11];
		String word = null;
		String beforeword="지";
		String Myword;
		int num=in.nextInt();
		
		for(int i=0;i<num;i++) {
			array[i]=in.next();
		}

		System.out.println("시작하는단어는 아버지입니다");
		/*System.out.print(array[count]+">>");
		word=in.next();
		
		firstword=word.substring(0,1);
		if(firstword.equals(beforeword)) {
			System.out.println(array[0]+"졌습니다");
			run=false;
		}*/
			
		while(run) {
			if(count==num)count=0;
			System.out.print(array[count]+">>");
			word=in.next();
			hlong=word.length();
			Myword=word.substring(0,1);
			if(Myword.equals(beforeword)) {
				beforeword=word.substring(hlong-1,hlong);
			}
			else {
				System.out.println(array[count]+"졌습니다");
				run=false;
			}
		}
		
		
		
	}
}
