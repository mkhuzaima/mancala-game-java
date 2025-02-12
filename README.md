# Mancala Game
## About the Game
### For 2 players – Ages 7 to Adult
Mancala is an ancient family of board games, and there are numerous variants. This is a version of the basic game, known as two-rank Mancala also known as Kalah.
### Contents:
- 1 Mancala board
- 48 colored plastic pieces (also called "stones")
### Set Up:
- The Mancala board is made up of two rows of six pockets (also called "holes," or "pits") each.
- Four pieces are placed in each of the 12 pockets. The color of the pieces is irrelevant.
- Each player has a "store" (also called a "Mancala") on his/her right side of the Mancala board.
### Object:
The object of the game is to collect the most pieces by the end of the game.
Game Play:
1. The game begins with one player picking up all the pieces in any of the pockets on his/her side.
2. Moving counter-clockwise, the player deposits one of the stones in each pocket until the stones run out.
3. If you run into your own Mancala (store), deposit one piece. If you run into your opponent's Mancala, skip it and
 continue moving to the next pocket.
4. If you drop the last piece in your own Mancala, you take another turn.
5. If the last piece you drop is in an empty pocket on your side, you capture that piece and any pieces in the pocket directly opposite.
6. Always place all captured pieces in your Mancala (store).
7. The game ends when all six pockets on one side of the Mancala board are empty.
8. The player who still has pieces on his/her side of the board when the game ends captures all of those pieces.
9. Count all the pieces in each Mancala. The winner is the player with the most pieces.
## Implementation
The game is console-based and is implemented in Java. It is played between a human player and a computer.
## How to Run
To run the game, clone the repository and run the following command in the root directory of the project:
```bash
javac MancalaGame.java
java MancalaGame
```
## Sample Run of the Game
```
+---------------------------------------------+
|                  Mancala Game               |
+---------------------------------------------+

Enter your name to continue: Khuzaima
     |  1 |  2 |  3 |  4 |  5 |  6 |
+----+----+----+----+----+----+----+----+
|    |  4 |  4 |  4 |  4 |  4 |  4 |    |
|  0 |----+----+----+----+----+----|  0 |
|    |  4 |  4 |  4 |  4 |  4 |  4 |    |
+----+----+----+----+----+----+----+----+
Khuzaima! choose a pit [1-6]: 2
+----+----+----+----+----+----+----+----+
|    |  4 |  4 |  4 |  4 |  4 |  4 |    |
|  0 |----+----+----+----+----+----|  0 |
|    |  4 |  0 |  5 |  5 |  5 |  5 |    |
+----+----+----+----+----+----+----+----+

Computer chooses pit 3
Press enter to continue...
+----+----+----+----+----+----+----+----+
|    |  5 |  5 |  0 |  4 |  4 |  4 |    |
|  1 |----+----+----+----+----+----|  0 |
|    |  5 |  0 |  5 |  5 |  5 |  5 |    |
+----+----+----+----+----+----+----+----+

Khuzaima! choose a pit [1-6]: 3
+----+----+----+----+----+----+----+----+
|    |  5 |  5 |  0 |  4 |  4 |  5 |    |
|  1 |----+----+----+----+----+----|  1 |
|    |  5 |  0 |  0 |  6 |  6 |  6 |    |
+----+----+----+----+----+----+----+----+

Computer chooses pit 5
Press enter to continue...
+----+----+----+----+----+----+----+----+
|    |  6 |  6 |  1 |  5 |  0 |  5 |    |
|  1 |----+----+----+----+----+----|  1 |
|    |  5 |  0 |  0 |  6 |  6 |  6 |    |
+----+----+----+----+----+----+----+----+

Khuzaima! choose a pit [1-6]: 1
+----+----+----+----+----+----+----+----+
|    |  6 |  6 |  1 |  5 |  0 |  5 |    |
|  1 |----+----+----+----+----+----|  1 |
|    |  0 |  1 |  1 |  7 |  7 |  7 |    |
+----+----+----+----+----+----+----+----+

Computer chooses pit 4
Press enter to continue...
+----+----+----+----+----+----+----+----+
|    |  7 |  7 |  2 |  0 |  0 |  5 |    |
|  2 |----+----+----+----+----+----|  1 |
|    |  1 |  1 |  1 |  7 |  7 |  7 |    |
+----+----+----+----+----+----+----+----+

Khuzaima! choose a pit [1-6]: 5
+----+----+----+----+----+----+----+----+
|    |  7 |  8 |  3 |  1 |  1 |  6 |    |
|  2 |----+----+----+----+----+----|  2 |
|    |  1 |  1 |  1 |  7 |  0 |  8 |    |
+----+----+----+----+----+----+----+----+

Computer chooses pit 2
Press enter to continue...
+----+----+----+----+----+----+----+----+
|    |  8 |  0 |  3 |  1 |  1 |  6 |    |
|  3 |----+----+----+----+----+----|  2 |
|    |  2 |  2 |  2 |  8 |  1 |  9 |    |
+----+----+----+----+----+----+----+----+

Khuzaima! choose a pit [1-6]: 2
+----+----+----+----+----+----+----+----+
|    |  8 |  0 |  3 |  1 |  1 |  6 |    |
|  3 |----+----+----+----+----+----|  2 |
|    |  2 |  0 |  3 |  9 |  1 |  9 |    |
+----+----+----+----+----+----+----+----+

Computer chooses pit 4
Press enter to continue...
+----+----+----+----+----+----+----+----+
|    |  8 |  0 |  4 |  0 |  1 |  6 |    |
|  3 |----+----+----+----+----+----|  2 |
|    |  2 |  0 |  3 |  9 |  1 |  9 |    |
+----+----+----+----+----+----+----+----+

Khuzaima! choose a pit [1-6]: 4
+----+----+----+----+----+----+----+----+
|    |  9 |  1 |  5 |  1 |  2 |  7 |    |
|  3 |----+----+----+----+----+----|  3 |
|    |  2 |  0 |  3 |  0 |  2 | 10 |    |
+----+----+----+----+----+----+----+----+

Computer chooses pit 3
Press enter to continue...
+----+----+----+----+----+----+----+----+
|    | 10 |  2 |  0 |  1 |  2 |  7 |    |
|  4 |----+----+----+----+----+----|  3 |
|    |  3 |  1 |  3 |  0 |  2 | 10 |    |
+----+----+----+----+----+----+----+----+

Khuzaima! choose a pit [1-6]: 5
+----+----+----+----+----+----+----+----+
|    | 10 |  2 |  0 |  1 |  2 |  7 |    |
|  4 |----+----+----+----+----+----|  4 |
|    |  3 |  1 |  3 |  0 |  0 | 11 |    |
+----+----+----+----+----+----+----+----+

Khuzaima! choose a pit [1-6]: 1
+----+----+----+----+----+----+----+----+
|    | 10 |  2 |  0 |  0 |  2 |  7 |    |
|  4 |----+----+----+----+----+----|  6 |
|    |  0 |  2 |  4 |  0 |  0 | 11 |    |
+----+----+----+----+----+----+----+----+

Computer chooses pit 1
Press enter to continue...
+----+----+----+----+----+----+----+----+
|    |  0 |  2 |  0 |  0 |  3 |  8 |    |
|  7 |----+----+----+----+----+----|  6 |
|    |  1 |  3 |  5 |  0 |  1 | 12 |    |
+----+----+----+----+----+----+----+----+

Khuzaima! choose a pit [1-6]: 6
+----+----+----+----+----+----+----+----+
|    |  1 |  3 |  1 |  1 |  4 |  9 |    |
|  7 |----+----+----+----+----+----|  7 |
|    |  2 |  4 |  6 |  1 |  2 |  0 |    |
+----+----+----+----+----+----+----+----+

Computer chooses pit 1
Press enter to continue...
+----+----+----+----+----+----+----+----+
|    |  0 |  3 |  1 |  1 |  4 |  9 |    |
|  8 |----+----+----+----+----+----|  7 |
|    |  2 |  4 |  6 |  1 |  2 |  0 |    |
+----+----+----+----+----+----+----+----+

Computer chooses pit 2
Press enter to continue...
+----+----+----+----+----+----+----+----+
|    |  1 |  0 |  1 |  1 |  4 |  9 |    |
|  9 |----+----+----+----+----+----|  7 |
|    |  3 |  4 |  6 |  1 |  2 |  0 |    |
+----+----+----+----+----+----+----+----+

Khuzaima! choose a pit [1-6]: 5
+----+----+----+----+----+----+----+----+
|    |  1 |  0 |  1 |  1 |  4 |  9 |    |
|  9 |----+----+----+----+----+----|  8 |
|    |  3 |  4 |  6 |  1 |  0 |  1 |    |
+----+----+----+----+----+----+----+----+

Khuzaima! choose a pit [1-6]: 4
+----+----+----+----+----+----+----+----+
|    |  1 |  0 |  1 |  1 |  0 |  9 |    |
|  9 |----+----+----+----+----+----| 13 |
|    |  3 |  4 |  6 |  0 |  0 |  1 |    |
+----+----+----+----+----+----+----+----+

Computer chooses pit 1
Press enter to continue...
+----+----+----+----+----+----+----+----+
|    |  0 |  0 |  1 |  1 |  0 |  9 |    |
| 10 |----+----+----+----+----+----| 13 |
|    |  3 |  4 |  6 |  0 |  0 |  1 |    |
+----+----+----+----+----+----+----+----+

Computer chooses pit 4
Press enter to continue...
+----+----+----+----+----+----+----+----+
|    |  0 |  0 |  2 |  0 |  0 |  9 |    |
| 10 |----+----+----+----+----+----| 13 |
|    |  3 |  4 |  6 |  0 |  0 |  1 |    |
+----+----+----+----+----+----+----+----+

Khuzaima! choose a pit [1-6]: 6
+----+----+----+----+----+----+----+----+
|    |  0 |  0 |  2 |  0 |  0 |  9 |    |
| 10 |----+----+----+----+----+----| 14 |
|    |  3 |  4 |  6 |  0 |  0 |  0 |    |
+----+----+----+----+----+----+----+----+

Khuzaima! choose a pit [1-6]: 3
+----+----+----+----+----+----+----+----+
|    |  0 |  0 |  2 |  0 |  1 | 10 |    |
| 10 |----+----+----+----+----+----| 15 |
|    |  3 |  4 |  0 |  1 |  1 |  1 |    |
+----+----+----+----+----+----+----+----+

Computer chooses pit 6
Press enter to continue...
+----+----+----+----+----+----+----+----+
|    |  1 |  1 |  3 |  1 |  2 |  0 |    |
| 11 |----+----+----+----+----+----| 15 |
|    |  4 |  5 |  1 |  2 |  1 |  1 |    |
+----+----+----+----+----+----+----+----+

Khuzaima! choose a pit [1-6]: 2
+----+----+----+----+----+----+----+----+
|    |  1 |  1 |  3 |  1 |  2 |  0 |    |
| 11 |----+----+----+----+----+----| 16 |
|    |  4 |  0 |  2 |  3 |  2 |  2 |    |
+----+----+----+----+----+----+----+----+

Khuzaima! choose a pit [1-6]: 5
+----+----+----+----+----+----+----+----+
|    |  1 |  1 |  3 |  1 |  2 |  0 |    |
| 11 |----+----+----+----+----+----| 17 |
|    |  4 |  0 |  2 |  3 |  0 |  3 |    |
+----+----+----+----+----+----+----+----+

Khuzaima! choose a pit [1-6]: 3
+----+----+----+----+----+----+----+----+
|    |  1 |  1 |  3 |  1 |  0 |  0 |    |
| 11 |----+----+----+----+----+----| 20 |
|    |  4 |  0 |  0 |  4 |  0 |  3 |    |
+----+----+----+----+----+----+----+----+

Computer chooses pit 3
Press enter to continue...
+----+----+----+----+----+----+----+----+
|    |  2 |  2 |  0 |  1 |  0 |  0 |    |
| 12 |----+----+----+----+----+----| 20 |
|    |  4 |  0 |  0 |  4 |  0 |  3 |    |
+----+----+----+----+----+----+----+----+

Computer chooses pit 2
Press enter to continue...
+----+----+----+----+----+----+----+----+
|    |  3 |  0 |  0 |  1 |  0 |  0 |    |
| 13 |----+----+----+----+----+----| 20 |
|    |  4 |  0 |  0 |  4 |  0 |  3 |    |
+----+----+----+----+----+----+----+----+

Computer chooses pit 1
Press enter to continue...
+----+----+----+----+----+----+----+----+
|    |  0 |  0 |  0 |  1 |  0 |  0 |    |
| 14 |----+----+----+----+----+----| 20 |
|    |  5 |  1 |  0 |  4 |  0 |  3 |    |
+----+----+----+----+----+----+----+----+

Khuzaima! choose a pit [1-6]: 4
+----+----+----+----+----+----+----+----+
|    |  0 |  0 |  0 |  1 |  0 |  1 |    |
| 14 |----+----+----+----+----+----| 21 |
|    |  5 |  1 |  0 |  0 |  1 |  4 |    |
+----+----+----+----+----+----+----+----+

Computer chooses pit 4
Press enter to continue...
+----+----+----+----+----+----+----+----+
|    |  0 |  0 |  1 |  0 |  0 |  1 |    |
| 14 |----+----+----+----+----+----| 21 |
|    |  5 |  1 |  0 |  0 |  1 |  4 |    |
+----+----+----+----+----+----+----+----+

Khuzaima! choose a pit [1-6]: 2
+----+----+----+----+----+----+----+----+
|    |  0 |  0 |  0 |  0 |  0 |  1 |    |
| 14 |----+----+----+----+----+----| 23 |
|    |  5 |  0 |  0 |  0 |  1 |  4 |    |
+----+----+----+----+----+----+----+----+

Computer chooses pit 6
Press enter to continue...
+----+----+----+----+----+----+----+----+
|    |  0 |  0 |  0 |  0 |  0 |  0 |    |
| 16 |----+----+----+----+----+----| 23 |
|    |  5 |  0 |  0 |  0 |  0 |  4 |    |
+----+----+----+----+----+----+----+----+

Khuzaima wins!
```
