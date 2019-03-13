package chap01;

import java.util.*; 
public class LocationMain {
	 
	
	public static void main(String args[]) {
		
		HashMap<String,Location> mapt=new HashMap<>();
		Scanner in=new Scanner(System.in);
		int input,input2;
		String strinput;
		for(int i=0;i<3;i++) {
			strinput=in.next();
			Location a=new Location();
			a.kyung=in.nextInt();
			a.we=in.nextInt();
					
			mapt.put(strinput, a);
		}
		
		
		strinput=in.next();
		if(mapt.containsKey(strinput)) {
			System.out.println(mapt.get(strinput).kyung);
			System.out.println(mapt.get(strinput).we);
			
		}
	}
	
	
	
	
}
