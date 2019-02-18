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
