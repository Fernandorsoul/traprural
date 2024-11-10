package com.freelancecode.traprural.implentacao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freelancecode.traprural.entities.FuncionarioRural;
import com.freelancecode.traprural.repositories.FuncionarioRepository;
import com.freelancecode.traprural.services.FuncionarioRuralService;

@Service
public class FuncionarioRuralServiceImplementacao implements FuncionarioRuralService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Override
    public List<FuncionarioRural> findAll() {
        return funcionarioRepository.findAll();
    }

    @Override
    public FuncionarioRural findById(Long id) {
        return funcionarioRepository.findById(id).orElse(null);
    }

    @Override
    public FuncionarioRural save(FuncionarioRural funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    @Override
    public void deleteById(Long id) {
        funcionarioRepository.deleteById(id);
    }
}