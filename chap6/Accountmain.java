package chap6;
public class Accountmain{

   
    public static void main(String args[]){

        Account A=new Account();
        A.setAccount(10000);
        System.out.println("savedMoney = "+A.savedMoney);
        A.setAccount(100000);
        System.out.println("savedMoney = "+A.savedMoney);
        A.setAccount(10000000);
        System.out.println("savedMoney = "+A.savedMoney);
        
    }
    
}