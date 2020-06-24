package com.bingham.ken.knightsquest.service;

import com.bingham.ken.knightsquest.model.Armor;
import com.bingham.ken.knightsquest.repository.ArmorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ArmorComponent implements ProvisionService<Armor>{

    @Autowired
    private ArmorRepository armorRepository;

    @Override
    public void save(Armor armor) {
        armorRepository.save(armor);
    }

    @Override
    public List<Armor> getAll() {
        return (List<Armor>) armorRepository.findAll();
    }

    @Override
    public Armor get(Long id) {
        return armorRepository.findById(id).get();
    }

    @Override
    public void delete(Armor armor) {
        armorRepository.delete(armor);
    }

}
