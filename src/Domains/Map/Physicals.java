package Domains.Map;

import Domains.Boolean;

public class Physicals{
	
	private Boolean gold;
	private Boolean wumpus;
	private Boolean pit;
	
	public Physicals (){
		this.wumpus = Boolean.DEFAULT;
		this.gold = Boolean.DEFAULT;
		this.pit = Boolean.DEFAULT;
	}
	
	
	public Physicals (Boolean gold,Boolean wumpus,Boolean pit){
		this.gold = gold;
		this.wumpus = wumpus;
		this.pit = pit;
	}
	
	public Physicals (Boolean b){
		this.wumpus = b;
		this.gold = b;
		this.pit = b;
	}
	

	
	public Boolean getGold(){
		return gold;
	}
	
	public Boolean getWumpus(){
		return wumpus;
	}
	
	public Boolean getPit(){
		return pit;
	}
	
	
	
	public void  setGold(Boolean gold){
		this.gold = gold;
	}
	public void setWumpus(Boolean wumpus){
		this.wumpus = wumpus;
	}
	public void setPit(Boolean pit){
		this.pit = pit;
	}
	
	public Boolean[] getArray(){
		Boolean[] ar = new Boolean[3];
		ar[0] = gold;
		ar[1] = wumpus;
		ar[2] = pit;
		
		return ar;
	}
}
