package personal;
import java.util.Random;
class Intension{

 

    public void insensify(Item e){
        int stance;
        boolean run;
        stance=e.plus;
        if(!e.purple){
               run=isSuccess(stance);
               if(run){
                   stance++;
                   e.plus++;
               }
        }
    }


    public boolean isSuccess(int stance){
        Random rd=new Random();
        int[] arr=new int[15];
        arr[1]=arr[2]=arr[3]=arr[4]=100;
        arr[5]=80;
        arr[6]=70;
        arr[7]=60;
        arr[8]=50;
        arr[9]=40;
        arr[10]=30;
        arr[11]=25;
        arr[12]=18;
        arr[13]=12;
        arr[14]=8;
        arr[15]=5;
        int i=rd.nextInt(100);
        if(i<arr[stance]){
            return true;
        }
        else return false;
    }
}

