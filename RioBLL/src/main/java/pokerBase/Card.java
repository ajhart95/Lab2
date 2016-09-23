package pokerBase;

import java.util.Comparator;

import pokerEnums.eRank;
import pokerEnums.eSuits;

public class Card {
	
	private eSuits eSuit;
	private eRank eRank;
	private int icardnum;
	
	public Card(pokerEnums.eSuits eSuit, pokerEnums.eRank eRank, int icardnum){
		this.eSuit = eSuit;
		this.eRank = eRank; 
		this.icardnum = icardnum;
		
	}
	
	public eSuits getCardSuit(){
		return eSuit;
	}
	
	public eRank getCardRank(){
		return eRank;
	}
	
	
}
