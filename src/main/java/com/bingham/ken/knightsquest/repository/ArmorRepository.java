package com.bingham.ken.knightsquest.repository;

import com.bingham.ken.knightsquest.model.Armor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArmorRepository extends CrudRepository<Armor, Long> {
}
