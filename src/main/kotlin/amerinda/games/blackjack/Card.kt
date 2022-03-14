package amerinda.games.blackjack


/**
 * Card from Deck
 */
data class Card(
    val suit: Suits,
    val rank: Rank
)
/**
 * Suits of cards
 */
enum class Suits(val symbol: String) {
    CLUBS("C"),
    DIAMONDS("D"),
    HEARTS("H"),
    SPADES("S")
}

/**
 * Rank of cards
 */
enum class Rank(val value: Int, val symbol: String) {
    TWO(2, "2"),
    THREE(3, "3"),
    FOUR(4, "4"),
    FIVE(5, "5"),
    SIX(6, "6"),
    SEVEN(7, "7"),
    EIGHT(8, "8"),
    NINE(9, "9"),
    TEN(10, "10"),
    JACK(10, "J"),
    QUEEN(10, "Q"),
    KING(10, "K"),
    ACE(11, "A")
}
