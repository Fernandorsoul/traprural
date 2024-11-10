package com.freelancecode.traprural.services;

import java.util.List;

import com.freelancecode.traprural.entities.PropriedadeRural;

public interface PropriedadeService {
    List<PropriedadeRural> findAll();
    PropriedadeRural findById(Long id);
    PropriedadeRural save(PropriedadeRural propriedade);
    void deleteById(Long id);
}