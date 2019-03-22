package h0210;
import java.util.Random;
public class stmain{

    public static void main(String args[]){

        sogaeting[] starray= new sogaeting[6];
        double nnum;
        Random ran=new Random(3);
        starray[0]= new sogaeting("m1",3.9,"Male");
        starray[1]= new sogaeting("m2",2.0,"Male");
        starray[2]= new sogaeting("m3",4.0,"Male");
        starray[3]= new sogaeting("fe1",3.5,"FeMale");
        starray[4]= new sogaeting("fe3",2.8,"FeMale");
        starray[5]= new sogaeting("fe2",4.5,"FeMale");
        /*
        for(int i=0;i<6;i++){
            double total = Math.floor((ran.nextDouble()*4.5) * 10d) / 10d;
            starray[i].value=total;
        }
      
        for(int i=0;i<6;i++){
            
            System.out.println(starray[i].value);
        } */
       
        for(int i=0;i<6;i++){
            for(int j=0;j<i;j++){
                if(!starray[i].gender.equals(starray[j].gender)){
                    if(starray[i].value-starray[j].value<0.8 &&  starray[i].value-starray[j].value>-0.8)
                   /* System.out.println("("+starray[i].name+")" + starray[i].value); 
                    System.out.println("match " + "["+starray[j].name +"]"+ starray[j].value); */
                    System.out.println(starray[i].name+ starray[j].name);
                    
                }
            }
            System.out.println();
        }
    }
 
}

