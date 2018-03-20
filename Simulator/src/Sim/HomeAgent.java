package Sim;

import java.util.HashMap;

public class HomeAgent {
	
	HashMap<NetworkAddr, NetworkAddr> agentTable;
	
	public HomeAgent() {
		agentTable = new HashMap<NetworkAddr, NetworkAddr>();
		
	}
	
	public void addressUpdate(AddressUpdate update) {
		agentTable.put(update.getHomeOfAddress(), update.getCareOfAddress());
	}
	
	public boolean checkHashMap(NetworkAddr addr) {
		return agentTable.containsKey(addr);
	}
	
}
