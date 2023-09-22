package com.javarush.daria.m5l8mvc.service;

import com.javarush.daria.m5l8mvc.model.Player;
import com.javarush.daria.m5l8mvc.repository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayerService {

    private final PlayerRepository repository;

    public Player savePlayer(Player player){
        return repository.save(player);
    }

    public Player getById(long id){
        return repository.findById(id).orElse(null);
    }

    public List<Player> getAll(){
        return repository.findAll();
    }

    public void deleteById(long id) {
        repository.deleteById(id);
    }
}
