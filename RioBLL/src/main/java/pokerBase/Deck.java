package pokerBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import pokerEnums.eRank; 
import pokerEnums.eSuits;

public class Deck{
	ArrayList<Card> deck = new ArrayList<Card>();
	private int deck_size;

	public Deck(){
		
		for (pokerEnums.eSuits i : pokerEnums.eSuits.values()){
			for (pokerEnums.eRank j : pokerEnums.eRank.values())
				deck.add(new Card(i, j, deck_size++));
		}
	
		
	}
	
	public Card Draw(){
		Random generator = new Random();
		int index= generator.nextInt( deck.size() );
		return deck.remove(index);
		
		
	}

	private int GetDeckSize(){
		deck_size = deck.size();
		System.out.println(deck_size);
		return deck_size;
	}
	
}

