package chap6_7prac;
import java.util.Scanner;
class air{
    int temp=20;
    boolean power=false;
    void tempUp(){
        temp++;
    }
    void tempDown(){
        temp--;
    }
    void power(){
        if(power==false)power=true;
        else power=false;
    }
    void powerCon(int input){
        if(input==3)power();
    }
}


public class p04{
    public static void main(String[] args) {
        boolean run=true;
        air remote=new air();
        Scanner controller = new Scanner(System.in);

        while(run){
            System.out.println("up=1 down=2 off=3");
            String num=controller.nextLine();
            switch(Integer.parseInt(num)){
                case 1:
                        remote.tempUp();
                        break;
                case 2:
                        remote.tempDown();
                        break;
                case 3:
                        remote.power();
                        run=false;
                        break;
                default:
                    run=false;
                    break;
                
            }
        }
   } 
}   