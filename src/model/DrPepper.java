package model;

public class DrPepper extends Soda
{
	public DrPepper()
	{
		this.setBrand("DrPepper");
		this.setColor("black");
		this.setLiters(-1);
	}
	
	public DrPepper(double liters)
	{
		this.setBrand("DrPepper");
		this.setColor("black");
		this.setLiters(liters);
	}
}
