package com.bingham.ken.knightsquest.repository;

import com.bingham.ken.knightsquest.model.CharacterClass;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterClassRepository extends CrudRepository<CharacterClass, Long> {
}
