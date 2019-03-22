package hwhome;

public class hw13 {

	static boolean stopped=false;
	static synchronized void setStopped() {
		if(stopped==false)stopped=true;
		else stopped=false;
	}
	public static void main(String[] args) {
		Thread5 th1 = new Thread5();
		th1.start();
		try {
			Thread.sleep(6*1000);
		}catch(Exception e) {}
		
		stopped=true;
		System.out.println("st");
	}
}

class Thread5 extends Thread{
	public void run() {
		for(int i=0;!hw13.stopped;i++) {
			System.out.println(i);
		 try {
			Thread.sleep(3*1000);
		 }catch(Exception e) {}
		}
	}
}