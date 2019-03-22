package h0210;


import  java.util.Scanner;

public class account{

    private String ano;
    private String aname;
    private int money;
    //private boolean balanced;
    public account(String ano,String aname,int money){
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
        //isbalanced(money);
        //if(balanced==true)
        this.money= money;
        //else System.out.println("Balanced out");
    }

   /* public void isbalanced(int money){
        if(money>=0 && money<=1000000){
            balanced=true;
        }
        else balanced=false;
    }*/
}
public class hw1{

   private static account[] accountArray = new account[100];
   private static Scanner scanner=new Scanner(System.in);
   static int A_count=0;
  
    public static void main(String args[]){
        boolean run=true;
       
        while(run){
            System.out.println("================================");
            System.out.println("1.CreateAccount / 2. ListofAccount / 3. input / 4. output / 5.logout");
            System.out.println("===============================");
            System.out.println("choose>");
            String selectNo=scanner.nextLine();
            switch(Integer.parseInt(selectNo)){
                case 1:
                    createAccount();
                    break;
                case 2:
                    accountList();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
                    break;
                case 5:
                    run=false;
                    System.out.println("Bye");
                    break;
                default:
                	run=false;
                break;
                
            }
        }
    }
    private static void createAccount(){
        System.out.println("Accountno:");
        String aNo=scanner.nextLine();        
        System.out.println(aNo);

        System.out.println("Accountname:");
        String aName=scanner.nextLine();

        System.out.println("BaseMoney:");
        String aInt=scanner.nextLine();
        
        int ac=Integer.parseInt(aInt);
        
        account a= new account(aNo,aName,ac);
        accountArray[A_count]=a;
        A_count++;
        System.out.println("Success!"+aName);
        
    }
    private static void accountList(){
        int i=0;
        String getname,getano;
        int getm;
        for(i=0;i<A_count;i++){
            getname=accountArray[i].getName();
            getano=accountArray[i].getAno();
            getm=accountArray[i].getmoney();
            
            System.out.println(getname+" "+ getano +" " +getm);
        }
    }
    private static void deposit(){
        System.out.println("Accountno:");
        
        String aNoo=scanner.nextLine();
        int findac,findmoney;
        findac=findAccount(aNoo);
        System.out.println("how much?:");
        String come=scanner.nextLine();

        findmoney=accountArray[findac].getmoney()+Integer.parseInt(come);
        
        accountArray[findac].setmoney(findmoney);
        System.out.println("success");
        
    }
    private static void withdraw(){
        System.out.println("Accountno:");
        String aNoo=scanner.nextLine();
        int findac,findmoney;
        findac=findAccount(aNoo);
        System.out.println("how much?:");
        String come=scanner.nextLine();
        
        findmoney=accountArray[findac].getmoney();
        
        if(Integer.parseInt(come)>findmoney) {
        	System.out.println("No money");
        	
        }
        else {
        	findmoney=accountArray[findac].getmoney()-Integer.parseInt(come);
        
        	accountArray[findac].setmoney(findmoney);
        	System.out.println("success");
        }
        
    } 
    private static int findAccount(String ano){
       int i;
       String getget;
       for(i=0;i<A_count;i++){
           getget=accountArray[i].getAno();
           if(getget.equals(ano))break;
       }
       return i;
    }
    
    
}