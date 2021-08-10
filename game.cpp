#include "game.h"
#include "player.h"
#include "gamekey.h"
#include<string>
#include<iostream>
#include<algorithm>
#include<memory>
#include<numeric>
#include<vector>
#include<map>

using namespace std;

Game::Game(string name, shared_ptr<Player> host): name(name), host(host){
 if(name.size()==0 || host == nullptr) throw runtime_error("name darf nicht leer sein");
  
}

string Game::get_name() const{
 return this->name;
}

bool Game::is_allowed(int n) const{
 if(( n > host->get_mmr() * 90/100) && (n < host->get_mmr() * 110/100) ) return true;
 
 return false;
}

bool Game::remove_player(const GameKey&, shared_ptr<Player> p){
	if (players.find(p->get_name()) == players.end()) return false;
	players.erase(players.find(p->get_name()));
	return true;
}

bool Game::add_player(const GameKey&, shared_ptr<Player> p){
  auto tmp = players.find(p->get_name());
	if ( tmp != players.end()) {  return false; }
  if ( tmp == players.end() && is_allowed(p->get_mmr()) ){ 
		players[p->get_name()] = p;
    
		return true;
	}
	
	return false;
}

shared_ptr<Player> Game::best_player() const{
  if (players.size() == 0) throw runtime_error("darf nicht 0 sein");
  auto bp = max_element(players.begin(), players.end(), [] ( const auto& pl1, const auto& pl2 ) {  return pl1.second->get_mmr() < pl2.second->get_mmr(); });
  return bp->second;
}

size_t Game::number_of_players() const{
	return players.size();
}
 
shared_ptr<Player> Game::play(size_t i){
 shared_ptr<Player> sieger;
 size_t counter=0;
 for(auto& it : players){
  if(i == counter) {
   sieger = it.second;
   break;
  }
   counter++;
  }
  for(auto& it : players){
    if( it.second != sieger){
      if (it.second->get_mmr() > sieger->get_mmr()) {
				it.second->change_mmr(change(false) * 2);
		  }
		  else {
			  it.second->change_mmr(change(false) * 1);
		}
      
    }
    
  }
   sieger->change_mmr(change(true));
	return sieger;
}

ostream& Game::print(ostream& o) const
{
  o<<"[";
  o << this->name << ", ";
  o << host->get_name() << ", ";
  o << host->get_mmr() << ", ";
	int size = players.size();
	int cnt = 0;
 // o << "players Size : "<< players.size();
  o << "player: ";
  o << "{";
	for (auto tmp : players) {
    o << "[";
		o << tmp.second->get_name() << ", ";
    o << tmp.second->get_mmr();
    o << "]";
		if (cnt++ < size - 1)
			o << ", ";
    
	}
	o << "}]";
  
	return o;
}
ostream& operator<< (ostream& o, const Game& g) {
	return g.print(o);
}

 
RGame::RGame(string name, shared_ptr<Player>host): Game(name,host){
 
}

int RGame::change(bool x) const{
 if(x) return 5;
 return -5;
}

ostream& RGame::print(ostream& o) const{
  o << "Ranked Game: ";
	Game::print(o);
	return o;
}


UGame::UGame(string name, shared_ptr<Player>host): Game(name,host){

}

int UGame::change(bool) const{
  return 0;
}
 
ostream& UGame::print(ostream& o) const{
  o << "Unranked Game: ";
	Game::print(o);
	return o;
}

