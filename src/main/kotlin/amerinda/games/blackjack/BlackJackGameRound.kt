package amerinda.games.blackjack

class BlackJackGameRound(private val player: Player, private val dealer: Dealer) {

    /**
     * Each player is given two cards from the top of a shuffled deck of cards.
     */
    fun startGame() {
        dealer.giveCardToParticipant(player)
        dealer.giveCardToParticipant(dealer)
        dealer.giveCardToParticipant(player)
        dealer.giveCardToParticipant(dealer)
    }

    /**
     * Condition to the player get a new card
     */
    fun getConditionPLayerRound() = player.score < BlackJackScores.CUT_DRAWING_CARDS

    /**
     * Player gets a new card in the player round
     */
    fun playerRound() {
        dealer.giveCardToParticipant(player)
    }

    /**
     * Condition for the dealer add a card to the table
     */
    fun getConditionDealerRound() =
        dealer.score <= player.score && dealer.score < BlackJackScores.BLACK_JACK

    /**
     * Dealer gets a new card in the dealer round
     */
    fun dealerRound() {
        dealer.giveCardToParticipant(dealer)
    }

}
