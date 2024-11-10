package com.freelancecode.traprural.services;

import java.util.List;

import com.freelancecode.traprural.entities.Equipamento;

public interface EquipamentoService {
    List<Equipamento> findAll();
    Equipamento findById(Long id);
    Equipamento save(Equipamento equipamento);
    void deleteById(Long id);
}