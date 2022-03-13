package amerinda.games.blackjack

import org.junit.Assert.*
import org.junit.Test

class BlackJackWinnerRoundTest {

    var blackJackWinnerRound = BlackJackWinnerRound(Player("Horacio"), Dealer("HappyDealer"))

    @Test
    fun hasWinner() {
        assertSame(false, blackJackWinnerRound.hasWinner())
    }
}
