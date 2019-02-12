package h0212;
import java.util.*;



public class p01 {

    public static void main(String args[]){

       String text;
       int len;
       Scanner in=new Scanner(System.in);

        text=in.nextLine();
        len=text.length();
        for(int i=0;i<len;i++){

            System.out.print(text.charAt(i));
            
        }

       

    }

}