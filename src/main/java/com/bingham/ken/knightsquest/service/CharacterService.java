package com.bingham.ken.knightsquest.service;


import com.bingham.ken.knightsquest.model.Character;

import java.util.List;

public interface CharacterService {

    List<Character> getAllCharacters();
    Character getCharacter(Long characterId);
    Character createCharacter(String characterName,
                         Long characterClassId,
                         Long characterTypeId,
                         String sex,
                         Integer strength,
                         Integer weightLimit,
                         Integer charisma,
                         Integer constitution,
                         String alignment);
    void updateCharacter(Character character);
    void deleteCharacter(Character character);
}
