package hwhome;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class hw12 {
	public static void main(String[] args) {
		 ArrayList<String> Slist=new ArrayList<String>();
		 ArrayList<String> Alist=new ArrayList<String>();
		 ArrayList<String> Blist=new ArrayList<String>();
		 for(int i=0;i<10;i++) {
			 Slist.add("---");
			 Blist.add("---");
			 Alist.add("---");
		 }
		 
		 int seatL;
		 boolean run=true;
	     Scanner in=new Scanner(System.in);
	     Scanner sin=new Scanner(System.in);
	     
	        while(run)
	        {
	            System.out.println("================================");
	            System.out.println("1.예약 / 2. 조회 / 3. 취소/ 4. 끝내기 ");
	            System.out.println("===============================");
	            System.out.println("선택>");
	            String selectNo=in.nextLine();
	            switch(Integer.parseInt(selectNo))
	            {
	            	case 1:
	            		  System.out.println("1.S / 2. A / 3. B");
	            		  seatL=sin.nextInt();
	            		  if(seatL==1) {    		        
		            			Iterator it2= Slist.iterator();
		            			while(it2.hasNext()) 
		            			{
		            				System.out.print(it2.next());  
		            			}
		            			System.out.println();
		            			System.out.print("이름>");
		            			String name=sin.next();
		            			
		            			System.out.print("번호>");
		            			int num=sin.nextInt();
		            			Slist.add(num-1, name);
	            		  }
	            		  if(seatL==2) {
		            			Iterator it2= Slist.iterator();
		            			while(it2.hasNext()) 
		            			{
		            				System.out.print(it2.next());  
		            			}
		            			System.out.println();
		            			System.out.print("이름>");
		            			String name=sin.next();
		            			
		            			System.out.print("번호>");
		            			int num=sin.nextInt();
		            			Alist.add(num-1, name);
	            		  }
	            		  if(seatL==3) {
		            			Iterator it2= Slist.iterator();
		            			while(it2.hasNext()) 
		            			{
		            				System.out.print(it2.next());  
		            			}
		            			System.out.println();
		            			System.out.print("이름>");
		            			String name=sin.next();
		            			
		            			System.out.print("번호>");
		            			int num=sin.nextInt();
		            			Blist.add(num-1, name);
	            		  }
	            		  break;  		 
	            	case 2:
            			Iterator it2= Slist.iterator();
            			while(it2.hasNext()) 
            			{
            				System.out.print(it2.next());  
            			}
            			System.out.println();
            			Iterator it1= Alist.iterator();
            			while(it1.hasNext()) 
            			{
            				System.out.print(it1.next());  
            			}
            			System.out.println();
            			Iterator it3= Blist.iterator();
            			while(it3.hasNext()) 
            			{
            				System.out.print(it3.next());  
            			}
            			System.out.println();
	            		break;
	            	case 3:
	            		  System.out.println("1.S / 2. A / 3. B");
	            		  seatL=sin.nextInt();
	            		  if(seatL==1) {    		        
		            			Iterator it0= Slist.iterator();
		            			while(it0.hasNext()) 
		            			{
		            				System.out.print(it0.next());  
		            			}
		            			System.out.println();
		            			System.out.print("이름>");
		            			String name=sin.next();
		            			Slist.remove(name);
	            		  }
	            		  if(seatL==2) {
		            			Iterator it0= Alist.iterator();
		            			while(it0.hasNext()) 
		            			{
		            				System.out.print(it0.next());  
		            			}
		            			System.out.println();
		            			System.out.print("이름>");
		            			String name=sin.next();
		            			Alist.remove(name);	            			  
	            		  }
	            		  if(seatL==3) {
		            			Iterator it0= Blist.iterator();
		            			while(it0.hasNext()) 
		            			{
		            				System.out.print(it0.next());  
		            			}
		            			System.out.println();
		            			System.out.print("이름>");
		            			String name=sin.next();
		            			Blist.remove(name);
	            		  }
	            		  break;  
	            		
	            	
	            	case 4:
	            	default:
	            		run=false;
	            		break;
	            }//switch
	        }
	    
	        
	}
}
