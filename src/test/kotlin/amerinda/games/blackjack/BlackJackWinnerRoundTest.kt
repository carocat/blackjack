package amerinda.games.blackjack

import org.junit.Assert.assertSame
import org.junit.Test

class BlackJackWinnerRoundTest {

    var player = Player("Horacio")
    var dealer = Dealer("HappyDealer")

    private var blackJackWinnerRound = BlackJackWinnerRound(player, dealer)

    @Test
    fun checkIfWinnerPlayerRound() {
        player.score = BlackJackScores.BLACK_JACK
        val hasWinner = blackJackWinnerRound.checkIfWinnerPlayerRound()
        assertSame(true, player.isWinner)
        assertSame(true, hasWinner)
    }

    @Test
    fun checkIfWinnerDealerRound() {
        dealer.score = BlackJackScores.GT_THAN_BLACK_JACK
        val hasWinner = blackJackWinnerRound.checkIfWinnerDealerRound()
        assertSame(true, player.isWinner)
        assertSame(true, hasWinner)
    }

    @Test
    fun checkIfWinnerStartGameRound() {
        player.score = BlackJackScores.BLACK_JACK
        blackJackWinnerRound.checkIfWinnerStartGameRound()
        assertSame(true, player.isWinner)
    }
}
