package com.bingham.ken.knightsquest.controller;

import com.bingham.ken.knightsquest.model.Character;
import com.bingham.ken.knightsquest.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CharacterController {

    @Autowired
    private CharacterService characterService;

    @GetMapping("/character/{id}")
    public Character getCharacter(@PathVariable Long id){

        Character character = characterService.getCharacter(id);

         return character;
    }
}
