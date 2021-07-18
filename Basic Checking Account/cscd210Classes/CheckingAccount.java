package cscd210Classes;

public class CheckingAccount 
{
	private int acctNum;
	private double bal;
	
	public CheckingAccount(int acctNum)
	{
		this.acctNum = acctNum;
		this.bal = 100;
	}
	
	public CheckingAccount(int acctNum, double bal)
	{
		if(acctNum <= 0 || bal < 100)
			throw new IllegalArgumentException("The accout number is <= 0 or the bal < 100");
		this.acctNum = acctNum;
		this.bal = bal;
	}
	
	public int getAcctNumber()
	{
		return this.acctNum;
	}
	
	public double getBalance()
	{
		return this.bal;
	}
	
	public void setAccountNumber(int acctNum)
	{
		if(acctNum <= 0)
			throw new IllegalArgumentException("The passed in acctNum is <= 0");
		this.acctNum = acctNum;
	}
	
	private void setBalance(double bal)
	{
		if(bal <= 0)
			throw new IllegalArgumentException("The passed in bal is <= 0");
		this.bal = bal;
	}
	
	public void deposit(double amt)
	{
		if(amt <= 0)
			throw new IllegalArgumentException("The amt being passed in is <= 0");
		this.setBalance(bal + amt);
	}
	
	public void withdrawal(double amt)
	{
		if(amt <= 0)
			throw new IllegalArgumentException("The amt being passed in is <= 0");
		if(amt > bal)
			{} 
		else
			this.setBalance(bal - amt);
	}
	
	@Override
	public java.lang.String toString()
	{
		String string = "Account Number: " + this.acctNum + "\n" + "Account Balance: $" + this.bal + "\n";
		return string;
	}
	
	@Override
	public boolean equals(java.lang.Object o)
	{
		if(o == this)
			return true;
		if(o == null)
			return false;
		if(!(o instanceof CheckingAccount))
			return false;
		CheckingAccount another = (CheckingAccount)o;
		boolean res = String.valueOf(this.acctNum).equals(String.valueOf(another.acctNum)) && this.bal == another.bal;
		return res;
	}
	
	@Override
	public int hashCode()
	{
		int res = String.valueOf(this.acctNum).hashCode() + String.valueOf(this.bal).hashCode();
		return res;
	}
}