package amerinda.games.blackjack

/**
 * Print participant hand in the console at the end of the game
 */
class PrintParticipantHand {

    /**
     * Print in the format -> name: CA, H9 where C is club and
     */
    companion object {
        fun printOutput(participant: Participant) {
            val list = mutableListOf<String>()
            for (card in participant.cards) {
                list.add(card.suit.symbol + (card.rank.symbol))
            }
            println("${participant.name}: ${list.joinToString(", ")}")
        }
    }
}
