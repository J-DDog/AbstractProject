package model;

public abstract class Cards implements FoundOnTheInternet
{
	
		public int amount;
		public String cardName;
		public boolean isItAGoodDeck;
		public double price; 
		
		
		public double getcost()
		{
			return  price;
		}
		public int getAmount()
		{
			return amount;
		}
		public String getCardName()
		{
			return cardName;
		}
		public boolean isItAGoodDeck()
		{
			return isItAGoodDeck;
		}
		public void setPrice(double price)
		{
			this.price = price;
		}
		public void setAmount(int amount)
		{
			this.amount = amount;
		}
		public void setCardName(String cardName)
		{
			this.cardName = cardName;
		}
		public void setItAGoodDeck(boolean isItAGoodDeck)
		{
			this.isItAGoodDeck = isItAGoodDeck;
		}
		public String toString()
		{
			String description = "This is a " + this.getClass().getName() + " and has this deck:" + cardName;
			return description;
		}
		/**
		 * 
		 *if the supplied variable comes before the calling variable 
		 *return 1
		 *if the supplied variable is after the calling variable return -1
		 *Else if they are the same, return 0.
		 * @return
		 */
		public int compareTo(Object compared)
		{
			int comparedValue = Integer.MIN_VALUE;
			
			if(compared instanceof Cards)
			{
				if (this.cat() > ((FoundOnTheInternet) compared).cat())
				{
					comparedValue = 1;
				}
				else if(this.cat() < ((FoundOnTheInternet) compared).cat())
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
