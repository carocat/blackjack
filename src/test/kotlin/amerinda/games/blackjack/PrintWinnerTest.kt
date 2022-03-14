package amerinda.games.blackjack

import org.junit.After
import org.junit.Before
import org.junit.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.assertEquals

class PrintWinnerTest {

    private val outContent = ByteArrayOutputStream()
    private val originalOut = System.out

    @Before
    fun beforeTest() {
        System.setOut(PrintStream(outContent))
    }

    @Test
    fun printWinner() {
        val player = Player("player")
        val dealer = Dealer("dealer")
        dealer.isWinner = true
        PrintWinner.printWinner(player, dealer)
        assertEquals("winner is dealer\n", outContent.toString());
    }

    @After
    fun restoreStreams() {
        System.setOut(originalOut)
    }
}

