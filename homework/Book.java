package h0218;

public class Book extends product {

	protected int ISBN;
	protected String writer;
	protected String bookname;

	public Book(char what,int id,String info,String publisher,int value,int ISBN,String writer,String bookname) {
		super(what,id,info,publisher,value);
		this.ISBN=ISBN;
		this.writer=writer;
		this.bookname=bookname;
	}
    public String getWri(){
        return writer;
    }
    public String getname(){
        return bookname;
    }
    public int getISBN(){
        return ISBN; 
    } 
}
