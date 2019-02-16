package blackjack;

public class Dealer {
	Hand dealersHand;
	Deck deck;
	Player player;
	
	public void pDecision() {
		//switch case for calling methods corresponding to player's decisions
	}
	
	public void dDecision() {
		//switch case for calling methods corresponding to dealer's decisions
		//switch case needs to be called in a loop until game is won or 
		//dealer busts.
	}
	
	public void stand() {
		//dealer hits and compareHands
	}
	
	public void hit() {
		//draw cards and check for busts
	}
	
	public void doubleDown() {
		//double the bet
	}
	
	public void surrender() {
		//calculate bets
	}
	
	public void split() {
		//add a new hand to player
		//double bet
	}
	
	public void blackjack() {
		//check for an ace and a 10-value card just after the cards are dealt
		//called only the first time and never again
		//NOTE: do we need a variable to track if it's the first iteration of 
		//dealing cards in the current game
	}
	
	public void endGame() {
		//call to compareHands()
		//calculateBets()
	}
	
	//Can return:
	//	1 for win
	//	0 for tie
	//	-1 for lose
	public int compareHands() {
		//comapre dealers and player's hands total value.
		//return a win, lose or tie.
		return 0;
	}
	
	//NOTE: Do we need a method to calculateBets?
}
