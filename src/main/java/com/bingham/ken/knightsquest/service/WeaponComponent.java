package com.bingham.ken.knightsquest.service;

import com.bingham.ken.knightsquest.model.Weapon;
import com.bingham.ken.knightsquest.repository.WeaponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WeaponComponent  {

    @Autowired
    private WeaponRepository weaponRepository;


    public void save(Weapon weapon) {

        weaponRepository.save(weapon);
    }


    public List<Weapon> getAll() {
        return (List<Weapon>) weaponRepository.findAll();
    }


    public Weapon get(Long id) {
        return weaponRepository.findById(id).get();
    }


    public void delete(Weapon weapon) {
         weaponRepository.delete(weapon);
    }
}
