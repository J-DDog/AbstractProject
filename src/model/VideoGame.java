package model;

public abstract class VideoGame implements FoundOnTheInternet
{
	//Three Data Members
	private String gameName;
	private int players;
	private String developer;
	
	public String getGameName()
	{
		return gameName;
	}
	public int getPlayers()
	{
		return players;
	}
	public String getDeveloper()
	{
		return developer;
	}
	public void setGameName(String gameName)
	{
		this.gameName = gameName;
	}
	public void setPlayers(int players)
	{
		this.players = players;
	}
	public void setDeveloper(String developer)
	{
		this.developer = developer;
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
