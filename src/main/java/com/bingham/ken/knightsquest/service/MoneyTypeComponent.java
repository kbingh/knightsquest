package com.bingham.ken.knightsquest.service;

import com.bingham.ken.knightsquest.model.MoneyType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MoneyTypeComponent implements ProvisionService<MoneyType> {

    @Autowired
    private MoneyTypeComponent moneyTypeComponent;

    @Override
    public void save(MoneyType moneyType) {
        moneyTypeComponent.save(moneyType);
    }

    @Override
    public List<MoneyType> getAll() {
        return moneyTypeComponent.getAll();
    }

    @Override
    public MoneyType get(Long id) {

        return moneyTypeComponent.get(id);
    }

    @Override
    public void delete(MoneyType moneyType) {

        moneyTypeComponent.delete(moneyType);
    }
}
