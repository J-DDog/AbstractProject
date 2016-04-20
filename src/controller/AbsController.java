package controller;

import java.util.ArrayList;

import view.AbsFrame;
import model.*;

public class AbsController
{
	
	private ArrayList<FoundOnTheInternet> internetThings;
	private AbsFrame baseFrame;
	private AbsFrame absSecoundFrame;
	
	public AbsController()
	{
		baseFrame = new AbsFrame(this);
		absSecoundFrame = new AbsFrame(this);
		internetThings = new ArrayList<FoundOnTheInternet>();
		makeInternetList();
	}

	private void makeInternetList()
	{
		internetThings.add(new MountainDew());
		internetThings.add(new CallofDuty());
		internetThings.add(new DrPepper());
		internetThings.add(new BicycleCardDeck());
	}
	
	public void start()
	{
		// TODO Auto-generated method stub
		
	}
	
	public void swap(int firstLocation, int secoundLocation)
	{
		FoundOnTheInternet temp = internetThings.get(firstLocation);
		internetThings.set(firstLocation, internetThings.get(secoundLocation));
		internetThings.set(firstLocation, temp);
	}
	
	public void insertionSort()
	{
		for(int outerLoop = 1; outerLoop < internetThings.size(); outerLoop++)
		{
			int innerLoop = outerLoop;
			while(innerLoop > 0 && (internetThings.get(innerLoop-1).compareTo(internetThings.get(innerLoop))) > 0)
			{
				swap(innerLoop, innerLoop-1);
				innerLoop--;
			}
		}
	}
	
	public void quickSort(int lo, int hi)
	{
		if(lo < hi)
		{
			int midPoint = partition(lo, hi);
			quickSort(lo, midPoint-1);
			quickSort(midPoint+1, hi);
		}
	}
	
	private int partition(int lo, int hi)
	{
		int partitionPoint = 0;
		FoundOnTheInternet pivot = internetThings.get(hi);
		int position = lo;
		for(int spot = lo; spot < hi-1; spot++)
		{
			if(internetThings.get(spot).compareTo(pivot) <= 0)
			{
				swap(position, spot);
				position++;
			}
		}
		swap(position, hi);
	
		return position;
	}
	
	public String showMemes()
	{
		String memes = "";
		for(FoundOnTheInternet currentThing: internetThings)
		{
			memes += currentThing.toString()
					+ " and has its meme is " + currentThing.meme() + "\n";
		}
		
		return memes;
	}
	
}
