package exercise1;

import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 * @author Brandon Yaeck Feb 5, 2023
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            hand[i] = new Card();
	    hand[i].setValue((int) (Math.random() * 13 + 1));
	    hand[i].setSuit(Card.SUITS[(int) (Math.random() * 4)]);
	    // System.out.printf("card %d is %d of %s.\n", i, hand[i].getValue(), hand[i].getSuit());
        }

	System.out.printf("Enter a card value and suit:\n");
	System.out.printf("For example, 3 Hearts\n");
	System.out.printf("Valid values: 1 (Ace), 2-10, 11 (Jack), 12 (Queen), 13 (King)\n");
	System.out.printf("Valid suits: %s %s %s %s\n", Card.SUITS[0], Card.SUITS[1], Card.SUITS[2], Card.SUITS[3]);
	Scanner keyboard = new Scanner(System.in);
        int userValue = keyboard.nextInt();
        String userSuit = keyboard.nextLine().replaceAll("\\s", "");

	// System.out.printf("uservalue: %d\n", userValue);
	// System.out.printf("usersuit: %s\n", userSuit);

	boolean match = false;

        for(int i = 0;i < hand.length; i++) {
            if (hand[i].getValue() == userValue && hand[i].getSuit().equals(userSuit)) {
		match = true;
		System.out.printf("%d %s matches!\n", userValue, userSuit);
            }
	}

	if (match) {
                printInfo();
	} else {
		System.out.printf("No match in 7 cards!\n");
	}
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Paul, but you can call me prof, Paul or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
        
    
    }

}
