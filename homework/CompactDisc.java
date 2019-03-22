package h0218;

public class CompactDisc extends product{

	protected String albumname;
	protected String singer;
	public CompactDisc(char what,int id, String info, String publisher, int value,String albumname,String singer) {
		super(what,id, info, publisher, value);
		this.albumname=albumname;
		this.singer=singer;
	}
    public String getsin(){
        return singer;
    }
    public String getname(){
        return albumname;
    }
	
}
