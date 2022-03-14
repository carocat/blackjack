package amerinda.games.blackjack

fun main() {

    val dealer = Dealer("dealer")
    val player = Player("sam")
    val blackJackGameRound = BlackJackGameRound(player, dealer)
    val blackJackWinnerRound = BlackJackWinnerRound(player, dealer)

    blackJackGameRound.startGame()
    var hasWinner = blackJackWinnerRound.checkIfWinnerStartGameRound()

    /**
     * PLayer must stop drawing cards from the deck if their total reaches 17 or higher
     */
    while (!hasWinner && (blackJackGameRound.getConditionPLayerRound())) {
        blackJackGameRound.playerRound()
        hasWinner = blackJackWinnerRound.checkIfWinnerPlayerRound()
    }

    /**
     * The Dealer must stop drawing cards when their total is higher than player.
     */
    while (!hasWinner && (blackJackGameRound.getConditionDealerRound())) {
        blackJackGameRound.dealerRound()
        hasWinner = blackJackWinnerRound.checkIfWinnerDealerRound()
    }
    blackJackWinnerRound.checkWinnerAfterRounds()
    PrintWinner.printWinner(player, dealer)
    PrintParticipantHand.printOutput(player)
    PrintParticipantHand.printOutput(dealer)

}






