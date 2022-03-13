package amerinda.games.blackjack

import org.junit.Test
import kotlin.test.assertEquals

class BlackJackGameRoundTest {

    var blackJackGameRound = BlackJackGameRound(Player("name"), Dealer("name"))

    @Test
    fun getConditionPLayerRound() {
        assertEquals(true, blackJackGameRound.getConditionPLayerRound())
    }

    @Test
    fun getConditionDealerRound() {
        assertEquals(true, blackJackGameRound.getConditionDealerRound())
    }
}
