package com.bingham.ken.knightsquest.service;

import com.bingham.ken.knightsquest.model.Money;
import com.bingham.ken.knightsquest.model.MoneyType;
import com.bingham.ken.knightsquest.repository.MoneyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MoneyComponent implements ProvisionService<Money>{

    @Autowired
    private MoneyRepository moneyRepository;


    @Override
    public void save(Money money) {
        moneyRepository.save(money);
    }

    @Override
    public List<Money> getAll() {
        return (List<Money>) moneyRepository.findAll();
    }

    @Override
    public Money get(Long id) {
        return moneyRepository.findById(id).get();
    }

    @Override
    public void delete(Money money) {
        moneyRepository.delete(money);
    }
}
