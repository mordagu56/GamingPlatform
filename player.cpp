#include "player.h"
#include "game.h"
#include "gamekey.h"
#include<string>
#include<iostream>
#include<memory>
#include<algorithm>
#include<vector>
#include<map>

using namespace std;

Player::Player(string name, int mmr): name(name), mmr(mmr) {
	if (name.size() == 0 || mmr <= 0 || mmr >= 9999) throw runtime_error("darf nicht!!!");
  
}

string Player::get_name() const{
	return this->name;
}

int Player::get_mmr() const{
	return this->mmr;
}

shared_ptr<Game> Player::get_hosted_game() const{

	return this->hosted_game;
}

void Player::change_mmr(int n){
	if(this->mmr + n <= 9999 && this->mmr + n >= 0) this->mmr += n;
}

bool Player::host_game(string s, Mode m){
	if (s.size() == 0) throw runtime_error(" darf nicht leer");
	if (hosted_game == nullptr) {
    if(m == Mode::Ranked){
	  	hosted_game = make_shared<RGame>(s, shared_from_this());
     
    }
  
    else if(m == Mode::Unranked){
		 hosted_game = make_shared<UGame>(s, shared_from_this());
     
    }
  
		return true;
	}
	return false;
}

bool Player::join_game(shared_ptr<Game> g){
  auto tmp = games.find(g->get_name());
   GameKey gm;
  if( g->add_player(gm,shared_from_this()) ) {
    games[g->get_name()] = g;
    
    return true;
  }
  
  return false;
}

bool Player::leave_game(shared_ptr<Game> g){
 map<string,weak_ptr<Game>>ret;
 bool check = false;
  for(auto it : games){
   if(it.second.lock() == g){
     it.second.reset();
     check = true;
   }
   else{
     ret[it.first] = it.second; 
   }
  }
  GameKey gk;
  if(check && g->remove_player(gk,shared_from_this())){
     games=ret;
    return true;
  }
 
  return check ;
}
  
vector<weak_ptr<Player>> Player::invite_players(const vector<weak_ptr<Player>>& v){
 vector<weak_ptr<Player>> gs;
 for(const auto& a : v){
   if(a.expired() == true || !a.lock()->join_game(this->hosted_game)){
       gs.push_back(a);
     
   }
 
 }
  
  return gs;
}

 bool Player::close_game(){
  if(hosted_game){
    hosted_game.reset();
    return true;
  }
   return false;
 }
 
 ostream& Player::print(ostream& o) const{
  o<<"[";
  o << this->name <<", ";
  o << this->mmr << ", ";
  if(this->hosted_game==nullptr) {  o <<"hosts: " << "nothing" << ", ";}
  else{ o <<"hosts: " << this->hosted_game->get_name()<< ", "; }
//	int size = games.size();
//	int cnt = 0;
   bool first = true;
  o <<"games: {";
	for (auto tmp : games) {
    if(!tmp.second.expired()){
      if(first) first = false;
      else{o << ", ";}
		 // auto gm = tmp.second.lock();
		  o << tmp.second.lock()->get_name();
     
	//	if (cnt++ < size - 1)
		//	o << ", ";
	} }
	o << "}]";
	return o;
 }
 ostream& operator<< (ostream& o, const Player& p) {
	 return p.print(o);
 }
