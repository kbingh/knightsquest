package com.bingham.ken.knightsquest.repository;

import com.bingham.ken.knightsquest.model.CharacterType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterTypeRepository extends CrudRepository<CharacterType, Long> {
}
