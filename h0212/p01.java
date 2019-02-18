package h0212;

import java.util.*;



public class p02 {

    public static void main(String args[]){

       String text;
       char temp;
       int called=0;
       int count=1;
       int len;
       Scanner in=new Scanner(System.in);

        text=in.nextLine();
        len=text.length();
        temp=text.charAt(0);
        for(int i=1;i<len;i++){
   
        	if(text.charAt(i)==temp) {	
        		count++;
        	}
        	
        	if(text.charAt(i)!=temp) {
        		System.out.print(temp);
        	
        		temp=text.charAt(i);
        		if(count!=1)	{
        					System.out.println(count);
        						count=1;
        		}
        		else System.out.println(count); 
        	}
        }
    	System.out.print(temp);
    	System.out.println(1);
    }

}
