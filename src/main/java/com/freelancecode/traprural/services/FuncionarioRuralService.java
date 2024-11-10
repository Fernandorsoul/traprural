package com.freelancecode.traprural.services;

import java.util.List;

import com.freelancecode.traprural.entities.FuncionarioRural;

public interface FuncionarioRuralService {
    List<FuncionarioRural> findAll();
    FuncionarioRural findById(Long id);
    FuncionarioRural save(FuncionarioRural funcionarioRural);
    void deleteById(Long id);
}