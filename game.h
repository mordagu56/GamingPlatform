#ifndef GAME_H
#define GAME_H

#include<string>
#include<iostream>
#include<memory>
#include<vector>
#include<map>

using namespace std;

class GameKey;
class Player;
class Game : public enable_shared_from_this<Game>{

 private:
 string name;
 shared_ptr<Player> host;
 map<string, shared_ptr<Player>> players;
 
 public:
 Game(string name, shared_ptr<Player> host);
 string get_name() const;
 map<string, shared_ptr<Player>> get_players() const;
 bool is_allowed(int n) const;
 bool remove_player(const GameKey&, shared_ptr<Player>);
 bool add_player(const GameKey&, shared_ptr<Player>);
 shared_ptr<Player> best_player() const;
 size_t number_of_players() const;
 shared_ptr<Player> play(size_t i);
 virtual int change(bool) const = 0;
  
 virtual ~Game()=default;
 virtual ostream& print(ostream& o) const;
 

};

ostream& operator << (ostream& o, const Game& g);

class RGame: public Game {
public:
 RGame(string, shared_ptr<Player>);
 int change(bool x) const;
 ostream& print(ostream& o) const;

};

class UGame: public Game {

public:
 UGame(string, shared_ptr<Player>);
 int change(bool) const;
 ostream& print(ostream& o) const;

};

#endif