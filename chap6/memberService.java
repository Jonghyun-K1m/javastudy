package chap6;
public class memberService{

    public boolean login(String id,String password){


        if(id.equals("hong")&&password.equals("12345")){
            return true;
        }
        else return false;
    }
    public void logout(String id){
       System.out.println("logout");
    }
    
}   