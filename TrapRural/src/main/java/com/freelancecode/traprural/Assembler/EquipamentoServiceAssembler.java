package com.freelancecode.traprural.Assembler;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freelancecode.traprural.entities.Equipamento;
import com.freelancecode.traprural.repositories.EquipamentoRepository;
import com.freelancecode.traprural.services.EquipamentoService;

@Service
public class EquipamentoServiceAssembler implements EquipamentoService {

    @Autowired
    private EquipamentoRepository equipamentoRepository;

    @Override
    public List<Equipamento> findAll() {
        return equipamentoRepository.findAll();
    }

    @Override
    public Equipamento findById(Long id) {
        return equipamentoRepository.findById(id).orElse(null);
    }

    @Override
    public Equipamento save(Equipamento equipamento) {
        return equipamentoRepository.save(equipamento);
    }

    @Override
    public void deleteById(Long id) {
        equipamentoRepository.deleteById(id);
    }
}