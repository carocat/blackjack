package amerinda.games.blackjack

fun main() {

    val dealer = Dealer("dealer")
    val player = Player("sam")
    val blackJackGameRound = BlackJackGameRound(player, dealer)
    val blackJackWinnerRound = BlackJackWinnerRound(player, dealer)

    blackJackGameRound.startGame()
    blackJackWinnerRound.checkIfWinnerStartGameRound()
    var hasWinner = blackJackWinnerRound.hasWinner()

    /**
     * PLayer must stop drawing cards from the deck if their total reaches 17 or higher
     */
    while (!hasWinner && (blackJackGameRound.getConditionPLayerRound())) {
        blackJackGameRound.playerRound()
        blackJackWinnerRound.checkIfWinnerPlayerRound()
        hasWinner = blackJackWinnerRound.hasWinner()
    }

    /**
     * The Dealer must stop drawing cards when their total is higher than player.
     */
    while (!hasWinner && (blackJackGameRound.getConditionDealerRound())) {
        blackJackGameRound.dealerRound()
        blackJackWinnerRound.checkIfWinnerDealerRound()
        hasWinner = blackJackWinnerRound.hasWinner()
    }
    blackJackWinnerRound.checkWinnerAfterRounds()
    PrintParticipantState().printWinner(player, dealer)
    PrintParticipantState().printOutput(player)
    PrintParticipantState().printOutput(dealer)

}




