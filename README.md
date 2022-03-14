# <span style="color:blue"> **BlackJack Game** </span>

### Model the game

create a single deck of playing cards

  * two players (called Sam and the Dealer) who will play against each other
  * each player is given two cards from the top of a shuffled deck of cards. Cards
  are given in the following order: [sam, dealer, sam, dealer]

#### Rules to implement

* determine score of a hand[1]
* check if either player has Blackjack with their initial hand and wins the game.
Blackjack is an initial score of 21 with two cards: A + [10, J, Q, K
* sam wins when both players starts with Blackjack
* dealer wins when both players starts with 22 (A + A)
* if neither player has Blackjack then sam can start drawing cards from the top
of the deck
* sam must stop drawing cards from the deck if their total reaches 17 or higher
* sam has lost the game if their total is higher than 21
* when sam has stopped drawing cards the dealer can start drawing cards from
the top of the deck
* the dealer must stop drawing cards when their total is higher than sam.
* the dealer has lost the game if their total is higher than 21
* determine which player wins the game (highest score wins)
