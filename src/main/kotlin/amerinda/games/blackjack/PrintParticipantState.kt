package amerinda.games.blackjack

class PrintParticipantState {

    companion object fun printWinner(player: Player, dealer: Dealer) {
        when {
            player.isWinner -> println("winner is ${player.name}")
            else -> println("winner is ${dealer.name}")
        }
    }

    fun printOutput(participant: Participant) {
        val list = mutableListOf<String>()
        for (card in participant.cards) {
            list.add(card.suit.symbol + (card.rank.value))
        }
        println("${participant.name}: ${list.joinToString(", ")}")
    }
}
