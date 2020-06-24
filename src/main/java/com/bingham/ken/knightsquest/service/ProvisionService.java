package com.bingham.ken.knightsquest.service;

import com.bingham.ken.knightsquest.model.Character;
import com.bingham.ken.knightsquest.model.Money;
import com.bingham.ken.knightsquest.model.Tote;
import org.springframework.stereotype.Component;

import java.util.List;


public interface ProvisionService<T> {

    void save(T t);
    List<T> getAll();
    T get(Long id);
    void delete(T t);

}
