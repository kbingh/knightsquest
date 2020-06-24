package com.bingham.ken.knightsquest.repository;

import com.bingham.ken.knightsquest.model.Character;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends CrudRepository<Character, Long> {

}
