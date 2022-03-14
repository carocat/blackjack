package amerinda.games.blackjack

import org.junit.Test
import kotlin.test.assertEquals

class BlackJackGameRoundTest {

    var player = Player("player")
    var dealer = Dealer("dealer")
    var blackJackGameRound = BlackJackGameRound(player, dealer)

    @Test
    fun startGame() {
        blackJackGameRound.startGame()
        assertEquals(2, player.cards.size)
        assertEquals(2, dealer.cards.size)
    }

    @Test
    fun getConditionPLayerRound() {
        assertEquals(true, blackJackGameRound.getConditionPLayerRound())
    }

    @Test
    fun getConditionDealerRound() {
        assertEquals(true, blackJackGameRound.getConditionDealerRound())
    }

    @Test
    fun dealerRound() {
        blackJackGameRound.dealerRound()
        assertEquals(1, dealer.cards.size)
    }

    @Test
    fun playerRound() {
        blackJackGameRound.playerRound()
        assertEquals(1, player.cards.size)
    }
}
