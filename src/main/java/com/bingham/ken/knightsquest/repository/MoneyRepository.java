package com.bingham.ken.knightsquest.repository;

import com.bingham.ken.knightsquest.model.Money;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoneyRepository extends CrudRepository<Money, Long> {
}
