package model;

public abstract class Soda implements FoundOnTheInternet, Comparable
{
	private String brand;
	private String color;
	private double liters;

	public String getBrand()
	{
		return brand;
	}

	public void setBrand(String brand)
	{
		this.brand = brand;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public double getLiters()
	{
		return liters;
	}

	public void setLiters(double liters)
	{
		this.liters = liters;
	}
	
	public int compareTo(Object compared)
	{
		int comparedValue = Integer.MIN_VALUE;
		
		if(compared instanceof FoundOnTheInternet)
		{
			if(this.cat() > ((FoundOnTheInternet)compared).cat())
			{
				comparedValue = 1;
			}
			else if(this.cat() < ((FoundOnTheInternet)compared).cat())
			{
				comparedValue = -1;
			}
			else
			{
				comparedValue = 0;
			}
			
		}
		
		return comparedValue;
	}
	
}
