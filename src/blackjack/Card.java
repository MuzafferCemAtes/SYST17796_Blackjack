/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package blackjack;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author dancye
 */
public abstract class Card {
   private final Rank RANK;    // rank of the card
    private final Suit SUIT;    // suit of the card

    /**
     * Ranks that cards can have.
     */

    public enum Rank {
        ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(10), QUEEN(10), KING(10);

        private int value;  // value of the rank

        /**
         * Constructor for Rank object.
         *
         * @param value Value of the rank
         */

        Rank(int value) {
            this.value = value;
        }

        /**
         * Returns a string representation of the rank.
         *
         * @return the string representation of the rank
         */

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }

    /**
     * Suits that cards can have.
     */

    public enum Suit {
        CLUBS, DIAMONDS, HEARTS, SPADES;

        /**
         * Returns a string representation of the suit.
         *
         * @return the string representation of the suit
         */

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }

    /**
     * Constructor for Card object.
     *
     * @param rank Rank of the card
     * @param suit Suit of the card
     */

    public Card(Rank rank, Suit suit) {
        RANK = rank;
        SUIT = suit;
    }

    /**
     * Returns the value of the card.
     *
     * @return the value of the card
     */

    public int value() {
        return RANK.value;
    }

    /**
     * Returns the rank of the card.
     *
     * @return the rank of the card
     */

    public Rank rank() {
        return RANK;
    }

    /**
     * Returns a string representation of the card.
     *
     * @return the string representation of the card
     */

    @Override
    public String toString() {
        return RANK + "_of_" + SUIT;
    }

}
