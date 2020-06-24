package com.bingham.ken.knightsquest.repository;

import com.bingham.ken.knightsquest.model.Weapon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeaponRepository extends CrudRepository<Weapon, Long> {
}
