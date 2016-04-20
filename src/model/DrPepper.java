package model;

import javax.swing.JOptionPane;

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

	@Override
	public int cat()
	{
		return -1;
	}

	@Override
	public void troll(int troll)
	{
		JOptionPane.showMessageDialog(null, "Troll by MountainDew TM");
	}

	@Override
	public String meme()
	{
		return "DR.MEMES";
	}

	@Override
	public void clickBait(int hate)
	{
		while(hate > 0)
		{
			JOptionPane.showMessageDialog(null, "BUY DR.PEPPER TODAYYYY");
			hate--;
		}
		JOptionPane.showMessageDialog(null, "BUY IT OR SUFFER");
		
	}

	public String toString()
	{
		String descript = "this is a " + this.getClass().getName() + " and has " + cat() + " cats.";
		
		return descript;
	}
	
	@Override
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
