package chap6;
public class Account{

    protected int savedMoney;

    boolean ac;
    private boolean isbalance(int balance){
        
        if(balance>=0 && balance<=1000000)return true; 
        else return false;
    }
    public void setAccount(int money){
        ac=isbalance(money);
        if(ac)savedMoney=money;
        else {
            System.out.println("balance out");
        }
    }

}