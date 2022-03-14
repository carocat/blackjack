package amerinda.games.blackjack

import org.junit.Assert.assertEquals
import org.junit.Assert.assertSame
import org.junit.Test

class ParticipantTest {

    private var participant = Participant("Carol")

    @Test
    fun getCards() {
        assertEquals(mutableListOf<Card>(), participant.cards)
    }

    @Test
    fun setCards() {
        val mutableCardsList = mutableListOf(Card(Suits.DIAMONDS, Rank.ACE), Card(Suits.HEARTS, Rank.EIGHT))
        participant.cards = mutableCardsList
        assertSame(mutableCardsList, participant.cards)
    }

    @Test
    fun getScore() {
        assertSame(0, participant.score)
    }

    @Test
    fun setScore() {
        participant.score = 10
        assertSame(10, participant.score)
    }

    @Test
    fun addCardToHand() {
        val card = Card(Suits.DIAMONDS, Rank.ACE)
        participant.addCardToHand(card)
        assertSame(true, participant.cards.contains(card))
    }

    @Test
    fun getName() {
        assertSame("Carol", participant.name)
    }

    @Test
    fun isWinner() {
        assertSame(false, participant.isWinner)
    }

    @Test
    fun setWinner() {
        participant.isWinner = true
        assertSame(true, participant.isWinner)
    }
}
