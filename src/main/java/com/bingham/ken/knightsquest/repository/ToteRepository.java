package com.bingham.ken.knightsquest.repository;

import com.bingham.ken.knightsquest.model.Tote;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToteRepository extends CrudRepository<Tote, Long>{
}
