package com.freelancecode.traprural.services;

import java.util.List;

import com.freelancecode.traprural.entities.propriedadeRural;

public interface propriedadeService {
    List<propriedadeRural> findAll();
    propriedadeRural findById(Long id);
    propriedadeRural save(propriedadeRural propriedade);
    void deleteById(Long id);
}