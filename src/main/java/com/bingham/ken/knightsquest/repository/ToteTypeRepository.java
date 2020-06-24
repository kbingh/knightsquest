package com.bingham.ken.knightsquest.repository;

import com.bingham.ken.knightsquest.model.ToteType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToteTypeRepository extends CrudRepository<ToteType, Long> {
}
