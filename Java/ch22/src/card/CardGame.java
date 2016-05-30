package card;

import java.util.*;

class Card {
	String suit;
	String number;
	public Card(String suit, String number) {
		this.suit = suit;
		this.number = number;
	}
	
	public String toString() {
		return "(" +  suit + "" + number + ")";
	}
}

class Deck {
	ArrayList<Card> deck = new ArrayList<Card>();
	String[] suit = {"CULB", "DIAMOND", "HEART", "SPADE"};
	String[] number = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q",
			"k", "A"};
	
	public Deck() {
		for (int i = 0; i < suit.length; i++)
			for(int j = 0; j < number.length; j++)
				deck.add((new Card(suit[i], number[j])));
		
	}
	public void shuffle() {
		Collections.shuffle(deck);
	}
	
	public Card deal() {
		return deck.remove(0);
	}
}

class Player {
	ArrayList<Card> list = new ArrayList<Card>();
	
	public void getCard(Card card){
		list.add(card);
	}
	
	public void showCards(){
		System.out.println(list);
	}
}

public class CardGame {

	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle();
		Player p1 = new Player();
		Player p2 = new Player();
		p1.getCard(deck.deal());
		p2.getCard(deck.deal());
		p1.showCards();
		p2.showCards();
	}

}
