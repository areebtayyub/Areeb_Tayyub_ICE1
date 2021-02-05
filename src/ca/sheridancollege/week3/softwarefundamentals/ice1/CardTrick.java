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

        Card luckyCard = new Card("Hearts",12);
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        int match = 0;
        for (int index = 0; index < magicHand.length; index++) {
            if (magicHand[index].getSuit() == luckyCard.getSuit()
                    && magicHand[index].getValue() == luckyCard.getValue()) {
                match = index;
            }

        }
        if (magicHand[match].getSuit() == luckyCard.getSuit()
                && magicHand[match].getValue() == luckyCard.getValue()) {
            System.out.println("Card is in hand");
        } else {
            System.out.println("Card is not in hand");
        }
    }
}
