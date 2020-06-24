package com.bingham.ken.knightsquest.service;

import com.bingham.ken.knightsquest.model.Character;
import com.bingham.ken.knightsquest.model.CharacterClass;
import com.bingham.ken.knightsquest.model.CharacterType;
import com.bingham.ken.knightsquest.model.Tote;
import com.bingham.ken.knightsquest.repository.CharacterClassRepository;
import com.bingham.ken.knightsquest.repository.CharacterRepository;
import com.bingham.ken.knightsquest.repository.CharacterTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CharacterServiceImpl implements CharacterService {

    @Autowired
    private CharacterRepository characterRepository;
    @Autowired
    private CharacterTypeRepository characterTypeRepository;
    @Autowired
    private CharacterClassRepository characterClassRepository;

    @Autowired
    private ToteComponent toteComponent;

    @Autowired
    private MoneyComponent moneyComponent;

    @Autowired
    private WeaponComponent weaponComponent;

    @Override
    public List<Character> getAllCharacters() {

        List<Character> characterList = new ArrayList<>();

        for(Character character : characterRepository.findAll()){

            characterList.add(character);
        }
        return characterList;
    }

    @Override
    public Character getCharacter(Long characterId) {
        return characterRepository.findById(characterId).get();
    }

    @Override
    public Character createCharacter(String characterName,
                                Long characterClassId,
                                Long characterTypeId,
                                String sex,
                                Integer strength,
                                Integer weightLimit,
                                Integer charisma,
                                Integer constitution,
                                String alignment
                                ) {

        Character character = new Character();
        character.setAlignment(alignment);
        character.setActive(true);
        character.setCharisma(charisma);
        character.setConstitution(constitution);
        character.setSex(sex);
        character.setStrength(strength);
        character.setCharacterName(characterName);
        character.setCharacterType(getCharacterType(characterTypeId));
        character.setCharacterClass(getCharacterClass(characterClassId));

        return character;
    }

    @Override
    public void updateCharacter(Character character) {

        characterRepository.save(character);
    }

    @Override
    public void deleteCharacter(Character character) {

        characterRepository.delete(character);
    }

    public void setCharacterType(Character character,
                                 Long CharacterTypeId){

        CharacterType characterType =
                characterTypeRepository.findById(CharacterTypeId).get();
        character.setCharacterType(characterType);
    }

    public CharacterType getCharacterType(Long characterTypeId){

        CharacterType charactertype = characterTypeRepository.findById(characterTypeId).get();

        return charactertype;
    }

    public void setCharacterClass(Character character,
                                  Long characterClassId){

        CharacterClass characterClass =
                characterClassRepository.findById(characterClassId).get();
        character.setCharacterClass(characterClass);
    }

    public CharacterClass getCharacterClass(Long characterClassId){

        CharacterClass characterClass = characterClassRepository.findById(characterClassId).get();

        return characterClass;
    }

    public void createCharacterType(String characterType){

        CharacterType characterTp = new CharacterType();
        characterTp.setCharacterType(characterType);

        characterTypeRepository.save(characterTp);
    }

    public void createCharacterClass(String characterClass){

         CharacterClass characterClazz = new CharacterClass();
         characterClazz.setCharacterType(characterClass);

         characterClassRepository.save(characterClazz);
    }
}
