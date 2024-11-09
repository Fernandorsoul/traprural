package com.freelancecode.traprural.implentacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.freelancecode.traprural.entities.*;
import com.freelancecode.traprural.repositories.*;
import com.freelancecode.traprural.services.*;

@Service
public class equipamentoServiceImplementacao implements equipamentoService {

    @Autowired
    private equipamentoRepository equipamentoRepository;

    @Override
    public List<equipamento> findAll() {
        return equipamentoRepository.findAll();
    }

    @Override
    public equipamento findById(Long id) {
        return equipamentoRepository.findById(id).orElse(null);
    }

    @Override
    public equipamento save(equipamento equipamento) {
        return equipamentoRepository.save(equipamento);
    }

    @Override
    public void deleteById(Long id) {
        equipamentoRepository.deleteById(id);
    }
}