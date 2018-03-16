package Sim;

public class moveMobile implements Event {
	
	Router r;
	
	
	public moveMobile(Router r) {
		this.r = r;
	}
	
	public Router getRouter() {
		return this.r;
	}

	@Override
	public void entering(SimEnt locale) {
		// TODO Auto-generated method stub
		
	}
	
	

}
