package amerinda.games.blackjack


/**
 * Create Deck with Cards
 */
class Deck {

    /**
     * cards is a mutable list
     */
    private var cards: MutableList<Card> = mutableListOf()

    /**
     * Create deck using ranks and suits
     */
    init {
        for (suit in Suits.values())
            for (rank in Rank.values())
                cards.add(Card(suit, rank))
        shuffle()
    }

    /**
     * Shuffles the cards
     */
    private fun shuffle() = cards.shuffle()

    /**
     * Removes the first card form deck
     */
    fun getOneCard() = if (cards.isNotEmpty()) cards.removeAt(0) else throw gameEnded()

    /**
     * Game ends the game if the deck is empty
     */
    private fun gameEnded(): Nothing {
        throw IllegalArgumentException("Deck is empty, start a new game")
    }


}
