package chap6;
public class newAccount{

    private String ano;
    private String aname;
    private int money;
    private boolean balanced;
    public newAccount(String ano,String aname,int money){
        this.ano=ano;
        this.aname=aname;
        this.money=money;
    }

    public String getAno(){
        return ano;
    }
    public void setAno(String ano){
        this.ano= ano;
    }
   
    public String getName(){
        return aname;
    }
    public void setName(String aname){
        this.aname= aname;
    }
    
    
    public int getmoney(){
        return money;
    }
    
    public void setmoney(int money){
        isbalanced(money);
        if(balanced==true)this.money= money;
        else System.out.println("Balanced out");
    }

    public void isbalanced(int money){
        if(money>=0 && money<=1000000){
            balanced=true;
        }
        else balanced=false;
    }
}