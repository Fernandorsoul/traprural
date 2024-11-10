package com.freelancecode.traprural.servicesTest;

import com.freelancecode.traprural.entities.Equipamento;
import com.freelancecode.traprural.repositories.EquipamentoRepository;
import com.freelancecode.traprural.services.EquipamentoService;


import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class EquipamentoServiceTest {

    @Mock
    private EquipamentoRepository equipamentoRepository;

    @InjectMocks
    private EquipamentoService equipamentoService;

    @Test
    public void testSalvarEquipamento() {
        
        Equipamento equipamento = new Equipamento();
        equipamento.setNome("Trator");
        equipamento.setTipo("Máquina");
        equipamento.setEstado("Novo");

       
        when(equipamentoRepository.save(Mockito.any(Equipamento.class))).thenReturn(equipamento);

       
        Equipamento equipamentoSalvo = equipamentoService.save(equipamento);

        
        assertEquals("Trator", equipamentoSalvo.getNome());
    }
}