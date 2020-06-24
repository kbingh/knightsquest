package com.bingham.ken.knightsquest.service;

import com.bingham.ken.knightsquest.model.ArmorType;
import com.bingham.ken.knightsquest.repository.ArmorTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ArmorTypeComponent implements ProvisionService<ArmorType> {

    @Autowired
    private ArmorTypeRepository armorTypeRepository;

    @Override
    public void save(ArmorType armorType) {
        armorTypeRepository.save(armorType);
    }

    @Override
    public List<ArmorType> getAll() {
        return (List<ArmorType>) armorTypeRepository.findAll();
    }

    @Override
    public ArmorType get(Long id) {
        return armorTypeRepository.findById(id).get();
    }

    @Override
    public void delete(ArmorType armorType) {
        armorTypeRepository.delete(armorType);
    }
}
