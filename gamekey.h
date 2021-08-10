#ifndef GAMEKEY_H
#define GAMEKEY_H

#include "player.h"

using namespace std;

class Player;
class Game;
class GameKey{
private:
 GameKey();
   friend bool Player::join_game(std::shared_ptr<Game>);
   friend bool Player::leave_game(std::shared_ptr<Game>);


};
#endif