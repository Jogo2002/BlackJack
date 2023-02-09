package BlackJack;

import java.util.Random;

public class BlackJack {
    public static void main(String[] args){
        RandomQueue<Cards> cardDeck =  new RandomQueue<Cards>(); //creates shoe
        for (int i = 0; i < 6; i++) {
            for (Suit suit : Suit.values()) {
                for (Rank rank : Rank.values()) {
                    cardDeck.enqueue(new Cards(suit, rank));
                }
            }

        }
        Cards[] hand1 = {cardDeck.dequeue(),cardDeck.dequeue()};
        System.out.println("hand 1 is  " hand1[0] + " and "); //it won't let me print hand[0] + hand[1]
        System.out.println(hand1[1]);

        Cards[] hand2 = {cardDeck.dequeue(),cardDeck.dequeue()};
        System.out.println("hand 2 is " + hand2[0]+ " and ");
        System.out.println(hand2[1]);
    }
}