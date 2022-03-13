package amerinda.games.blackjack

/**
 * This class is used to chek a winner in each round of the game
 */
class BlackJackWinnerRound(private val player: Player, private val dealer: Dealer) {

    /**
     * Check if winner in player round
     */
    fun checkIfWinnerPlayerRound() {
        when {
            player.score == BlackJackScores.BLACK_JACK -> player.isWinner = true
            player.score > BlackJackScores.BLACK_JACK -> dealer.isWinner = true
        }
    }

    /**
     * Check if winner in dealer round
     */
    fun checkIfWinnerDealerRound() {
        when {
            dealer.score > BlackJackScores.BLACK_JACK -> player.isWinner = true
        }
    }

    /**
     * Set winner at the end of the game if not exists
     */
    fun checkWinnerAfterRounds() {
        when {
            !hasWinner() && player.score > dealer.score -> player.isWinner = true
            !hasWinner() && dealer.score > player.score -> dealer.isWinner = true
        }
    }

    /**
     * Returns true if there is already a winner in the game
     */
    fun hasWinner(): Boolean {
        return player.isWinner || dealer.isWinner
    }

    /**
     * Check if there is a winner after the dealer distributed the cards
     */
    fun checkIfWinnerStartGameRound() {
        when {
            player.score == BlackJackScores.BLACK_JACK -> player.isWinner = true
            isGreaterThanBlackJack(dealer) && isGreaterThanBlackJack(player) -> dealer.isWinner = true
        }
    }

    /**
     * Check if the score == 22
     */
    private fun isGreaterThanBlackJack(participant: Participant) = participant.score == BlackJackScores.GT_THAN_BLACK_JACK
}
