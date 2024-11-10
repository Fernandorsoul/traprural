package com.freelancecode.traprural.Assembler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freelancecode.traprural.entities.PropriedadeRural;
import com.freelancecode.traprural.repositories.PropriedadeRepository;
import com.freelancecode.traprural.services.PropriedadeService;
@Service
public class PropriedadeServiceAssembler implements PropriedadeService {
	
	

	    @Autowired
	    private PropriedadeRepository propriedadeRepository;

	    @Override
	    public List<PropriedadeRural> findAll() {
	        return propriedadeRepository.findAll();
	    }

	    @Override
	    public PropriedadeRural findById(Long id) {
	        return propriedadeRepository.findById(id).orElse(null);
	    }

	    @Override
	    public PropriedadeRural save(PropriedadeRural propriedade) {
	        return propriedadeRepository.save(propriedade);
	    }

	    @Override
	    public void deleteById(Long id) {
	        propriedadeRepository.deleteById(id);
	    }
	}