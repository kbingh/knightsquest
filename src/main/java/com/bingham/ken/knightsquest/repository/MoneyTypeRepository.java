package com.bingham.ken.knightsquest.repository;

import com.bingham.ken.knightsquest.model.MoneyType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoneyTypeRepository extends CrudRepository<MoneyType, Long> {
}
