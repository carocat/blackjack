package amerinda.games.blackjack

class Dealer(name: String): Participant(name) {

    /**
     * Dealer initiate deck and shuffle
     */
    private val deck = Deck()

    /**
     * Dealer gives the cards to the PLayer
     */
    fun giveCardToParticipant(participant: Participant) {
        participant.addCardToHand(deck.getOneCard())
    }
}
