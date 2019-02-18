package h0218;

public class product {

	protected int id;
	protected String info;
	protected String publisher;
	protected int value;
	public char what;
	public product(char what,int id,String info,String publisher,int value) {
		this.what=what;
		this.id=id;
		this.info=info;
		this.publisher=publisher;
		this.value=value;
		
	}
}