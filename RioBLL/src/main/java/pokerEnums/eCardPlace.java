package pokerEnums;

public enum eCardPlace {FIRSTCARD(1), SECONDCARD(2), THRIDCARD(3), FOURTHCARD(4), FIFTHCARD(5);
	private int CardPlace;
	
	eCardPlace(int CardPlace){
		this.CardPlace = CardPlace;
	}
	public int getCardPlace(){
		return CardPlace;
	}
}
