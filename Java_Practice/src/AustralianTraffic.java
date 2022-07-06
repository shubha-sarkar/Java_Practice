
public class AustralianTraffic implements CentralTraffic {
	
	public static void main(String[] arg){
	
		CentralTraffic ct=new AustralianTraffic();
		ct.redStop();
		ct.flashYellow();
		ct.greenGo();
	}

	@Override
	public void greenGo() {
		
		System.out.println("green go implementation");
		
	}

	@Override
	public void redStop() {
		
		System.out.println("red stop implementation");
		
	}

	@Override
	public void flashYellow() {
		
		System.out.println("flash yellow implementation");
		
	}
	
}
