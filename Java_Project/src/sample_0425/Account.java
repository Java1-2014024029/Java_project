package sample_0425;

public class Account {
	private int regNumber;
	private String name;
	private int balance;
	
	Account(int regNumber, String name, int balance){
		this.regNumber = regNumber; 
		this.name = name;
		this.balance = balance;
	}
	
	Account(){regNumber = 1; name = "2"; balance = 1000;}
		// Account(){Account(1, "2", 1000) ---(X)
		// Account(){this(1, "2", 1000) ---(O)
	////
		
	public String getName(){
		return name; 
	}
	public void setName(String name){
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance)
	{
		this.balance = balance;		
	}

}
