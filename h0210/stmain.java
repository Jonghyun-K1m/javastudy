package h0210;
import java.util.Random;
public class stmain{

    public static void main(String args[]){

        sogaeting[] starray= new sogaeting[6];
        double nnum;
        Random ran=new Random(3);
        starray[0]= new sogaeting("남자1",0.0,"Male");
        starray[1]= new sogaeting("남자2",0.0,"Male");
        starray[2]= new sogaeting("남자3",0.0,"Male");
        starray[3]= new sogaeting("여자1",0.0,"FeMale");
        starray[4]= new sogaeting("여자1",0.0,"FeMale");
        starray[5]= new sogaeting("여자1",0.0,"FeMale");
        
        for(int i=0;i<6;i++){
            starray[i].value=ran.nextDouble()*4.5;
        }
      
        for(int i=0;i<6;i++){
            double total = Math.floor((starray[i].value) * 10d) / 10d;
            System.out.println(total);
        }
       
    }
 
}

