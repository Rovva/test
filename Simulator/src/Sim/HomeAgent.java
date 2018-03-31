package Sim;

import java.util.HashMap;

public class HomeAgent {
	
	HashMap<String, String> agentTable;
	
	public HomeAgent() {
		agentTable = new HashMap<String, String>();
		
	}
	
	public void addressUpdate(AddressUpdate update) {
		agentTable.put(update.getHomeOfAddress().networkId() + "."
				+ update.getHomeOfAddress().nodeId(), update.getCareOfAddress().networkId()
				+ "." + update.getCareOfAddress().nodeId());
		
		//agentTable.put(update.getHomeOfAddress(), update.getCareOfAddress());
	}
	
	public boolean checkHashMap(NetworkAddr temp) {
		return agentTable.containsKey(temp.networkId() + "."
				+ temp.nodeId());
		//return agentTable.containsKey(addr);
	}
	
	public NetworkAddr getCOA(NetworkAddr HOA) {
		String addr = agentTable.get(HOA.networkId()+"."+HOA.nodeId());
		System.out.println(addr);
		
		String[] temp = addr.split("\\.");
		return new NetworkAddr( Integer.parseInt(temp[0]),Integer.parseInt(temp[1]));
		//return new NetworkAddr(agentTable.get(HOA.networkId() + "." + HOA.nodeId());
		
	}
	
}
