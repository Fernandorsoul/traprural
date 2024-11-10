package com.freelancecode.traprural.services;

import java.util.List;

import com.freelancecode.traprural.entities.equipamento;

public interface equipamentoService {
    List<equipamento> findAll();
    equipamento findById(Long id);
    equipamento save(equipamento equipamento);
    void deleteById(Long id);
}