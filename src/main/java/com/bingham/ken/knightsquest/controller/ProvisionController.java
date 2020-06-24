package com.bingham.ken.knightsquest.controller;
import com.bingham.ken.knightsquest.model.Money;
import com.bingham.ken.knightsquest.model.Tote;
import com.bingham.ken.knightsquest.model.Weapon;
import com.bingham.ken.knightsquest.service.CharacterProvisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/provide")
public class ProvisionController {

    @Autowired
    CharacterProvisionService characterProvisionService;

    @GetMapping("/tote/{characterId}/{toteId}")
    public Tote getTote(@PathVariable Long characterId,
                        @PathVariable Long toteId){


        return characterProvisionService.provideTote(characterId, toteId);
    }

    @GetMapping("/money/{characterId}/{moneyId}")
    public Money getMoney(@PathVariable Long characterId,
                          @PathVariable Long moneyId){


        return characterProvisionService.provideMoney(characterId, moneyId);
    }

    @PostMapping("/amount/{characterId}/{moneyId}/{amount}")
    public Money addEarnedMoney(@PathVariable Long characterId,
                          @PathVariable Long moneyId,
                                @PathVariable Integer amount){


        return characterProvisionService.addMoney(characterId, moneyId,
                amount);
    }

    @GetMapping("/weapon/{characterId}/{weaponId}")
    public Weapon getWeapon(@PathVariable Long characterId,
                            @PathVariable Long weaponId){


        return characterProvisionService.provideWeapon(characterId, weaponId);
    }

    @GetMapping("/armor/{characterId}/{armorId}")
    public Weapon getArmor(@PathVariable Long characterId,
                            @PathVariable Long armorId){


        return characterProvisionService.provideWeapon(characterId, armorId);
    }
}
