package chap6;
public class mainservice{ //메인

  
    public static void main(String args[]){

        memberService memService= new memberService();
        boolean result =memService.login("hong","12345");
        System.out.println("sss");
        if(result){
            System.out.println("login");
            memService.logout("hong");
        }
        else {  
            System.out.println("login failure");
        }  
    }
}   
