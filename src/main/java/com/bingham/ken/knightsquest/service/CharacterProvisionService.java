package com.bingham.ken.knightsquest.service;

import com.bingham.ken.knightsquest.model.*;
import com.bingham.ken.knightsquest.model.Character;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CharacterProvisionService {

    @Autowired
    private CharacterService characterService;
    @Autowired
    private ToteComponent toteComponent;
    @Autowired
    private MoneyComponent moneyComponent;
    @Autowired
    private WeaponComponent weaponComponent;
    @Autowired
    private ArmorComponent armorComponent;

    public Tote provideTote(Long characterId,
                                     Long toteId){

        Tote tote = toteComponent.get(toteId);
        getCharacter(characterId).getToteList().add(tote);
        return tote;
    }

    public Money provideMoney(Long characterId,
                             Long moneyId){

        Money money = moneyComponent.get(moneyId);

        getCharacter(characterId).getMoneyList().add(money);

        return money;
    }

    public Money addMoney(Long characterId,
                         Long moneyId,
                         Integer amount){

        Money money = moneyComponent.get(moneyId);
        money.setAmount(money.getAmount() + amount);

        return money;
    }

    public Weapon provideWeapon(Long characterId,
                             Long weaponId){

        Weapon weapon = weaponComponent.get(weaponId);

        getCharacter(characterId).getWeaponList().add(weapon);

        return weapon;
    }

    public Armor provideArmor(Long characterId,
                              Long armorId){


        Armor armor = armorComponent.get(armorId);

        getCharacter(characterId).getArmorList().add(armor);

        return armor;
    }

    public Character getCharacter(Long characterId){

        return characterService.getCharacter(characterId);
    }
}
