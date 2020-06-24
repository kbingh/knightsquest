package com.bingham.ken.knightsquest.repository;

import com.bingham.ken.knightsquest.model.ArmorType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArmorTypeRepository extends CrudRepository<ArmorType, Long> {
}
