package h0218;

public class ConversationBook extends Book {

	protected String langinfo;
	
	public ConversationBook(char what,int id, String info, String publisher,int value, int ISBN, String writer,
			String bookname, String langinfo) {
		super(what,id ,info, publisher, value, ISBN, writer, bookname);
		this.langinfo=langinfo;
	}
	

    public String getlang(){
        return langinfo;
    }
	

	
}





public interface Vehicle{
    public void run();
}
public class Bus implements Vehicle{
    public void run(){
        System.out.println("버스가 달립니다");
    }
    public void check(){
        System.out.println("버스체크입니다");
    }
}

public class VehicleMain{
    public static void main(String args[]){
        Vehicle vehi = new Bus();

        vihicle.run();
        vihicle.check();

        Bus bus=(Bus)vehicle;

        bus.run();
        bus.check();
    }

}