package amerinda.games.blackjack

/**
 * Print winner in console
 */
class PrintWinner {

    /**
     * Print in the format winner is name
     */
    companion object {
        fun printWinner(player: Player, dealer: Dealer) {
            when {
                player.isWinner -> println("winner is ${player.name}")
                else -> println("winner is ${dealer.name}")
            }
        }

    }
}
