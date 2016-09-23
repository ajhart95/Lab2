package pokerBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;

public class Hand {
	
	private UUID HandID;
	private Boolean bScored;
	
	private ArrayList<Card> hand = new ArrayList<Card>();
	
	
	public Hand(){
		
		for (int i = 0; i<5; i++){
			Deck Card_Draw = new Deck();
			hand.add(i ,Card_Draw.Draw()); 
			
		}
		System.out.println(hand.size());
	}
	
	
}
