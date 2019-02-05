package chap6;
public class member{


    public String name;
    public String id;
    private String password;
    private String age;
    
    public member(String name,String password){
        this.name=name;
        this.password=password;
    }
    public void setName(String name){
        this.name=name;
    }
}