package amerinda.games.blackjack

import org.junit.After
import org.junit.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.assertEquals


class PrintParticipantHandTest {

    private val outContent = ByteArrayOutputStream()
    private val originalOut = System.out

    @Test
    fun printOutput() {
        val card = Card(Suits.HEARTS, Rank.FIVE)
        val player = Player("player")
        player.addCardToHand(card)
        System.setOut(PrintStream(outContent))
        PrintParticipantHand.printOutput(player)
        assertEquals("player: H5\n", outContent.toString())
    }

    @After
    fun restoreStreams() {
        System.setOut(originalOut)
    }
}
