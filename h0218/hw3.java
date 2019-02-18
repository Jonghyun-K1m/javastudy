package hw;

import java.util.Scanner;



public class hw3 {


	static product[] parray= new product[10];
	 
	static Scanner in=new Scanner(System.in);
	static int arraycount=0;
	public static void main(String[] args) {
		  boolean run=true;
		  int input;
		  int c1input;
	      
		  while(run) {
			  System.out.println("상품추가(1),조회(2),종료(3)>>");
			  input=in.nextInt();
			  switch(input) {
			  
			  	case 1:
			  		System.out.println("상품종류 책(1),음악CD(2),회화책(3)>>");
			  		c1input=in.nextInt();
			  		switch(c1input) {
			  			case 1:
			  				bcall();
			  				break;
			  			case 2:
			  				cdcall();
			  				break;
			  			case 3:
			  				cbcall();
			  				break;
			  			default:
			  				break;
			  		}
			  		break;
			  	case 2:
			  		List();
			  		break;
			  	case 3:
			  	default:
			  		run=false;
			  		break;
			  }
		  }
		  
	}
	public static void cdcall() {


        System.out.print("상품설명:");
        String cinfo=in.next();

        System.out.print("가격:");
        int cvalue=in.nextInt();
        
        System.out.print("생산자:");
        String cpub=in.next();
        
        System.out.print("앨범제목:");
        String cname=in.next();
      
        System.out.print("가수:");
        String csin=in.next();
        
        CompactDisc a= new CompactDisc('d',arraycount,cinfo,cpub,cvalue,cname,csin);
        parray[arraycount]=a;
        arraycount++;
        System.out.println("Success!");
	}
	public static void bcall() {


        System.out.print("상품설명:");
        String cinfo=in.next();

        System.out.print("가격:");
        int cvalue=in.nextInt();
        
        System.out.print("생산자:");
        String cpub=in.next();
        
        System.out.print("ISBN:");
        int cisbn=in.nextInt();
      
        System.out.print("작가:");
        String cwri=in.next();
        
        System.out.print("책제목:");
        String cname=in.next();
        
        
        Book a= new Book('b',arraycount,cinfo,cpub,cvalue,cisbn,cwri,cname);
        parray[arraycount]=a;
        arraycount++;
        System.out.println("Success!");
	}
	public static void cbcall() {


        System.out.print("상품설명:");
        String cinfo=in.next();

        System.out.print("가격:");
        int cvalue=in.nextInt();
        
        System.out.print("생산자:");
        String cpub=in.next();
        
        System.out.print("ISBN:");
        int cisbn=in.nextInt();
      
        System.out.print("작가:");
        String cwri=in.next();
        
        System.out.print("책제목:");
        String cname=in.next();
        
        System.out.print("언어:");
        String clang=in.next();
        
        ConversationBook a= new ConversationBook('C',arraycount,cinfo,cpub,cvalue,cisbn,cwri,cname,clang);
        parray[arraycount]=a;
        arraycount++;
        System.out.println("Success!");
	}
    public static void List(){
        int i=0;
        int isbn;
        String wri,name,info;
        for(i=0;i<arraycount;i++){
           if(parray[i].what=='b') {
       		   isbn=((Book) parray[i]).getISBN();
       		   wri=((Book) parray[i]).getWri();
       		   name=((Book) parray[i]).getname();	   
        	   System.out.println("상품ID>>"+ parray[i].id);
        	   System.out.println("상품info>>"+ parray[i].info);
        	   System.out.println("상품생산자>>"+ parray[i].publisher);
        	   System.out.println("상품가격>>"+ parray[i].value);
        	   System.out.println("상품isbn>>"+isbn);
        	   System.out.println("상품작가>>"+ wri);
        	   System.out.println("상품책이름>>"+ name);
           }
           if(parray[i].what=='c') {
       		   isbn=((Book) parray[i]).getISBN();
       		   wri=((Book) parray[i]).getWri();
       		   name=((Book) parray[i]).getname();	 
       		   info=((ConversationBook) parray[i]).getlang();
        	   System.out.println("상품ID>>"+ parray[i].id);
        	   System.out.println("상품info>>"+ parray[i].info);
        	   System.out.println("상품생산자>>"+ parray[i].publisher);
        	   System.out.println("상품가격>>"+ parray[i].value);
        	   System.out.println("상품isbn>>"+isbn);
        	   System.out.println("상품작가>>"+ wri);
        	   System.out.println("상품책이름>>"+ name);
        	   System.out.println("상품언어>>"+ info);
        	   
           }            
           if(parray[i].what=='d') {
       		   wri=((CompactDisc) parray[i]).getsin();
       		   name=((CompactDisc) parray[i]).getname();	   
        	   System.out.println("상품ID"+ parray[i].id);
        	   System.out.println("상품info"+ parray[i].info);
        	   System.out.println("상품생산자"+ parray[i].publisher);
        	   System.out.println("상품가격"+ parray[i].value);
        	   System.out.println("상품가수"+ wri);
        	   System.out.println("상품cd제목"+ name);
           }            
        }
    }
}

