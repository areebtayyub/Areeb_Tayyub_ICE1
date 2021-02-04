/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;
import java.util.Arrays;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 */
public class CardTrick {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            magicHand[i] = new Card((int) (Math.random() * 14),
                    (int) (Math.random() * 4));
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }

        Card c = new Card();
        System.out.print("Enter a card value between 1 to 13"
                + "(Ace=1,JacktoKing=11-13): ");
        int value = a.nextInt();
        do {
            if (value > 13 || value < 1) {
                System.out.print("Wrong Number try again 1 to 13 "
                        + "(Ace=1,Jack to King= 11-13): ");
                value = a.nextInt();
            }
        } while (value > 13 || value < 1);
        c.setValue(value);
        System.out.print("Enter a Suit (Hearts=0, Diamonds=1,"
                + " Spades=2 and Clubs=3): ");
        int suit = a.nextInt();
        do {
            if (suit < 0 || suit > 3) {
                System.out.print("Ivalid Input: Enter a suit"
                        + "(Hearts=0, Diamonds=1, Spades=2 and Clubs=3): ");
                suit = a.nextInt();
            }
        } while (suit < 0 || suit > 3);
        c.setSuit(suit);
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        int match = 0;
        for (int index = 0; index < magicHand.length; index++) {
            if (magicHand[index].getSuit() == c.getSuit()
                    && magicHand[index].getValue() == c.getValue()) {
                match = index;
            }

        }
        if (magicHand[match].getSuit() == c.getSuit()
                && magicHand[match].getValue() == c.getValue()) {
            System.out.println("Card is in hand");
        } else {
            System.out.println("Card is not in hand");
        }
    }
}
