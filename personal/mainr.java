package personal;

class mainr{

 
	public static void main(String args[]) {
		

        Item sw=new Item();
        sw.purple=false;
        sw.plus=0;
        Intension kiri=new Intension();
        
        for(int i=0;i<10;i++){
            kiri.insensify(sw);
            System.out.println(sw.plus);
        }
   }
}

