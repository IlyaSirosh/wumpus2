package Domains.Map;

import Domains.Boolean;

public class Sensories{
	


	private Boolean glitter;
	private Boolean stink;	
	private Boolean breeze;
	
	public Sensories(){
		this.breeze = Boolean.DEFAULT;
		this.stink = Boolean.DEFAULT;
		this.glitter = Boolean.DEFAULT;
	}
	
	public Sensories(Boolean glitter,Boolean stink,Boolean breeze){
		this.breeze = breeze;
		this.stink = stink;
		this.glitter = glitter;
	}
	
	public Sensories(Boolean b){
		this.breeze = b;
		this.stink = b;
		this.glitter = b;
	}
	
	public Boolean getBreeze(){
		return breeze;
	}
	public Boolean getStink(){
		return stink;
	}
	public Boolean getGlitter(){
		return glitter;
	}
	
	public void setBreeze(Boolean breeze){
		this.breeze = breeze;
	}
	public void  setStink(Boolean stink){
		this.stink = stink;
	}
	public void setGlitter(Boolean glitter){
		this.glitter = glitter;
	}
	
	public Boolean[] getArray(){
		Boolean[] ar = new Boolean[3];
		ar[0] = glitter;
		ar[1] = stink;
		ar[2] = breeze;
		
		return ar;
	}
	
}