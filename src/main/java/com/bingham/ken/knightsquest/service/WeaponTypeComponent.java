package com.bingham.ken.knightsquest.service;

import com.bingham.ken.knightsquest.model.WeaponType;
import com.bingham.ken.knightsquest.repository.WeaponTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WeaponTypeComponent implements ProvisionService<WeaponType> {

    @Autowired
    private WeaponTypeRepository weaponTypeRepository;

    @Override
    public void save(WeaponType weaponType) {
        weaponTypeRepository.save(weaponType);
    }

    @Override
    public List<WeaponType> getAll() {
        return (List<WeaponType>) weaponTypeRepository.findAll();
    }

    @Override
    public WeaponType get(Long id) {

        return weaponTypeRepository.findById(id).get();
    }

    @Override
    public void delete(WeaponType weaponType) {
         weaponTypeRepository.delete(weaponType);
    }
}
