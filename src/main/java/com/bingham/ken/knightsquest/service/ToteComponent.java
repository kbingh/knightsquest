package com.bingham.ken.knightsquest.service;

import com.bingham.ken.knightsquest.model.Tote;
import com.bingham.ken.knightsquest.model.ToteType;
import com.bingham.ken.knightsquest.repository.ToteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ToteComponent implements ProvisionService<Tote> {

    @Autowired
    private ToteRepository toteRepository;

    @Override
    public void save(Tote tote) {
        toteRepository.save(tote);
    }

    @Override
    public List<Tote> getAll() {
        return (List<Tote>) toteRepository.findAll();
    }

    @Override
    public Tote get(Long id) {
        return toteRepository.findById(id).get();
    }

    @Override
    public void delete(Tote tote) {
        toteRepository.delete(tote);
    }
}
