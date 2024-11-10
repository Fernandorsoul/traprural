package com.freelancecode.traprural.implentacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.freelancecode.traprural.entities.*;
import com.freelancecode.traprural.repositories.*;
import com.freelancecode.traprural.services.*;

@Service
public class funcionarioRuralServiceImplementacao implements funcionarioRuralService {

    @Autowired
    private funcionarioRepository funcionarioRepository;

    @Override
    public List<funcionarioRural> findAll() {
        return funcionarioRepository.findAll();
    }

    @Override
    public funcionarioRural findById(Long id) {
        return funcionarioRepository.findById(id).orElse(null);
    }

    @Override
    public funcionarioRural save(funcionarioRural funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    @Override
    public void deleteById(Long id) {
        funcionarioRepository.deleteById(id);
    }
}