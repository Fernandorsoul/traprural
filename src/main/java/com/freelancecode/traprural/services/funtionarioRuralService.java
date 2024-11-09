package com.freelancecode.traprural.services;

import java.util.List;

import com.freelancecode.traprural.entities.funcionarioRural;

public interface funtionarioRuralService {
    List<funcionarioRural> findAll();
    funcionarioRural findById(Long id);
    funcionarioRural save(funcionarioRural funcionarioRural);
    void deleteById(Long id);
}