package Domains.Map;

import Domains.Boolean;

public class RoomData{
	
	private Sensories sensories;
	private Physicals physicals;
	
	
	public RoomData(){
		this.sensories = new Sensories();
		this.physicals = new Physicals();
	}
	
	public RoomData(Boolean b){
		this.sensories = new Sensories(b);
		this.physicals = new Physicals(b);
	}
	
	public Sensories getSensories(){
		return sensories;
	}
	
	public Physicals getPhysicals(){
		return physicals;
	}
	
}
