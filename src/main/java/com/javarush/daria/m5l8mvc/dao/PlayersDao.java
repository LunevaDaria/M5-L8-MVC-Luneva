//package com.javarush.daria.m5l8mvc.dao;
//
//import com.javarush.daria.m5l8mvc.model.Player;
//import com.javarush.daria.m5l8mvc.model.Race;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Component
//public class PlayersDao {
//    List<Player> players = new ArrayList<>();
//    {
//        players.add(Player.builder().id(1L).name("Player1").title("title").race(Race.DWARF).build());
//        players.add(Player.builder().id(2L).name("Player2").title("title").race(Race.HUMAN).build());
//        players.add(Player.builder().id(3L).name("Player3").title("title").race(Race.HOBBIT).build());
//        players.add(Player.builder().id(4L).name("Player4").title("title").race(Race.DWARF).build());
//    }
//
//    public List<Player> getAll(){
//        return players;
//    }
//
//    public Player getById(Long id) {
//        return players.stream().filter(player -> player.getId().equals(id)).findFirst().orElse(null);
//    }
//}
