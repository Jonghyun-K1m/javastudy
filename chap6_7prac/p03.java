package chap6_7prac;

import java.util.*;


public class p03{
    public static void main(String[] args) {
        int input=3;
        int[] intarr=new int[6];
        Random ran = new Random();
        int num;
     
        for(int i=0;i<input;i++){
            for(int j=0;j<6;j++){
                num=(int)(Math.random()*45+1);
                 intarr[j]=num;

                 for(int k=0;k<j;k++){
                     if(intarr[k]==intarr[j])j--;
                     break;
                 }
            }
        }
        bubble(intarr);

        for(int i=0;i<input;i++){
            for(int j=0;j<6;j++){
               System.out.print(intarr[j]+ " ");
            }
            System.out.println();
        }

   } 
   static public void bubble(int[] arr){
       int temp;
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
   }
}   
