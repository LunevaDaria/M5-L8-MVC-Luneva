package com.javarush.daria.m5l8mvc.controller;

import com.javarush.daria.m5l8mvc.model.Player;
import com.javarush.daria.m5l8mvc.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/players")
@RequiredArgsConstructor
public class PlayersController {

//    private final PlayersDao playersDao;

    private final PlayerService playerService;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("players", playerService.getAll());
        return "players/index";
    }

    @GetMapping("/{id}")
    public String showPlayerPage(@PathVariable long id, Model model){
        model.addAttribute("player", playerService.getById(id));
        return "players/player-page";
    }
    @GetMapping("/update/{id}")
    public String updatePlayerPage(@PathVariable long id, Model model){
        model.addAttribute("player", playerService.getById(id));
        return "players/update";
    }
    @GetMapping("/create")
    public String createPlayerPage(Model model){
        model.addAttribute("player", new Player());
        return "players/create";
    }

    @PostMapping("/create")
    public String createPlayer(Player player){
        playerService.savePlayer(player);
        return "redirect:/players/" + player.getId();
    }

    @PostMapping("/update/{id}")
    public String updatePlayer(@PathVariable long id, Player player) {
        playerService.savePlayer(player);
        return "redirect:/players/" + id;
    }
    @GetMapping("/delete/{id}")
    public String deletePlayer(@PathVariable long id) {
        playerService.deleteById(id);
        return "redirect:/players";
    }
}
