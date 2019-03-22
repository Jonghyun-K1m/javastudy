package h0212;
import java.util.*;

//import com.sun.org.apache.xpath.internal.operations.String;
class point{
    public int p,q;
    public void move(int a,int b){
        p=a;
        q=b;
    }
    public String toString(){
        return " "+p+" "+q+" (의 점)";
    }
}
class Positivepoint extends point{

    public void move(int a,int b){
        if(a>0 && b>0){
           super.move(a,b);
        }
        
    }
    Positivepoint(int a,int b){
        if(a>0 && b>0){
            p=0;
            q=0;
        }
    }
    Positivepoint(){
    }
}


public class p05 {

   
    public static void main(String args[]){


        Positivepoint p=new Positivepoint();
       p.move(10,10);
       System.out.println(p.toString()+"입니다");

       p.move(-5,5);
       System.out.println(p.toString()+"입니다");
       
       Positivepoint p2=new Positivepoint(-10,-10);
       //p2.move(10,10);
       System.out.println(p2.toString()+"입니다");

    }

}k