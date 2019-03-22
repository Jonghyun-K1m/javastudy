import java.util.Scanner;
//import chap7.*;

public class test{
  
    public static void main(String args[]){
        
        Scanner aScanner = new Scanner(System.in);
        String a;

         System.out.println("input");

        int arr[]= new int[5];
        arr[0]=111;
        arr[1]=10;
        arr[2]=1;
        arr[3]=2;
        arr[4]=311;
        int i,j,temp;
        for(i=0;i<5;i++){
            for(j=0;j<i;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(i=0;i<5;i++)System.out.print(" "+arr[i]);
     
    } 
}