package h0212;
import java.util.*;

abstract class Calculator{
    public abstract int add(int a,int b);
    public abstract int subtract(int a,int b);
    public abstract double average(int[] a);
    
}
public class test extends Calculator{

    public int add(int a,int b){
        return a+b;
    }

    public int subtract(int a,int b){
        return a-b;
    }

    
    public double average(int[] a){
        int i,sum=0;
        for(i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        return sum/a.length;
    }

    public static void main(String args[]){

        test c= new test();
        System.out.println(c.add(2,3));
        System.out.println(c.subtract(2,3));
        System.out.println(c.average(new int[] {2,3,4}));
        
    }

}