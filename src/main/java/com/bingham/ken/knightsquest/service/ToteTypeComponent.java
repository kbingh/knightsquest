package com.bingham.ken.knightsquest.service;

import com.bingham.ken.knightsquest.model.ToteType;
import com.bingham.ken.knightsquest.repository.ToteTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ToteTypeComponent implements ProvisionService<ToteType> {

    @Autowired
    private ToteTypeRepository toteTypeRepository;

    @Override
    public void save(ToteType toteType) {
        toteTypeRepository.save(toteType);
    }

    @Override
    public List<ToteType> getAll() {
        return (List<ToteType>) toteTypeRepository.findAll();
    }

    @Override
    public ToteType get(Long id) {
        return toteTypeRepository.findById(id).get();
    }

    @Override
    public void delete(ToteType toteType) {
        toteTypeRepository.delete(toteType);
    }
}
