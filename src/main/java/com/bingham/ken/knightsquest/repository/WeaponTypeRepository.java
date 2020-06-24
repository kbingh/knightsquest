package com.bingham.ken.knightsquest.repository;

import com.bingham.ken.knightsquest.model.WeaponType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeaponTypeRepository extends CrudRepository<WeaponType, Long> {
}
