package amerinda.games.blackjack

/**
 * Print winner in console
 */
class PrintWinner {

    /**
     * Print winner name
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
