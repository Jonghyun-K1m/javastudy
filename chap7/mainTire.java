package chap7;

public class mainTire{

    public static void main(String args[]){
        snowTire snowT = new snowTire();
        Tire tire = snowT;

    
        snowT.run();
        tire.run();

    }
     
}