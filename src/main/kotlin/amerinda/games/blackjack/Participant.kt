package amerinda.games.blackjack

/**
 * The Participant is part of the game as a dealer or Player
 */
open class Participant(val name: String, var isWinner: Boolean = false) {

    /**
     * Cards in the participant Hand
     */
    var cards = mutableListOf<Card>()

    /**
     * Score of the cards that consists, initiated with 0 (meaning no cards)
     */
    var score = 0

    /**
     * The Participant gets a new card and it increments score
     */
    fun addCardToHand(card: Card) {
        cards+=card
        addToScore(card)
        println("$name: $card and score: $score")
    }

    private fun addToScore(card: Card){
        score+=card.rank.value
    }

}
