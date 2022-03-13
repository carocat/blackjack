package amerinda.games.blackjack


/**
 * Card from Deck
 */
data class Card(
    val suit: Suits,
    val rank: Rank
)
/**
 * Enumerate suits of cards
 */
enum class Suits(val symbol: String) {
    CLUBS("C"), DIAMONDS("D"), HEARTS("H"), SPADES("S")
}

/**
 * Enumerate rank of cards
 */
enum class Rank(val value: Int) {
    ACE(11), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7),
    EIGHT(8), NINE(9), TEN(10), JACK(10), QUEEN(10), KING(10)
}
