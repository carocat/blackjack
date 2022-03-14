package amerinda.games.blackjack

import org.junit.Assert.assertSame
import org.junit.Test


class DealerTest {

    @Test
    fun testGiveCardToParticipant(){
        val player = Player("player")
        val dealer = Dealer("dealer")
        dealer.giveCardToParticipant(player)
        assertSame(1, player.cards.size)
    }

}
