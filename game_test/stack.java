package personal;

public interface stack<T> {
	int length();
	boolean push(T newstack);
	Object pop();

}

class StringStackz<T> implements stack<T> {
	
	T newstack;

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return newstack.toString().length();
	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		return newstack;
	}

	@Override
	public boolean push(T newstack) {
		// TODO Auto-generated method stub
		this.newstack=newstack;
		return true;
	}
	public static void main(String[] args) {
		
		StringStackz<Integer> S=new StringStackz<Integer>();
		System.out.println("S");
		S.push(1);
		S.pop();
	}
}


