package Domains;

public class Boolean {
	public static final Boolean UNKNOWN = new Boolean(-1);
	public static final Boolean FALSE = new Boolean(0);
	public static final Boolean TRUE = new Boolean(1);	
	public static final Boolean DEFAULT = new Boolean(2);
	
	private int value;
	
	public Boolean(int value){
		this.value = value;
	}
	
	public boolean isUnknown(){
		return value == UNKNOWN.getInt();
	}
	
	public boolean isFalse(){
		return value == FALSE.getInt();
	}
	
	public boolean isTrue(){
		return value == TRUE.getInt();
	}
	
	public boolean isDefault(){
		return value == DEFAULT.getInt();
	}
	
	public String toString(){
		if(isUnknown())
			return "unknown";
		if(isFalse())
			return "false";
		if(isTrue())
			return "true";
		if(isDefault())
			return "default";
		else
			return "undefined";
	}
	
	private int getInt(){
		return value;
	}
	

}
