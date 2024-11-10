package com.freelancecode.traprural.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.freelancecode.traprural.entities.Equipamento;
import com.freelancecode.traprural.services.EquipamentoService;



@RestController
@RequestMapping("/api/equipamentos")
public class EquipamentoController {

    @Autowired
    private EquipamentoService equipamentoService;

    @GetMapping
    public List<Equipamento> listarTodos() {
        return equipamentoService.findAll();
    }

    @GetMapping("/{id}")
    public Equipamento buscarPorId(@PathVariable Long id) {
        return equipamentoService.findById(id);
    }

    @PostMapping
    public Equipamento criar(@RequestBody Equipamento equipamento) {
        return equipamentoService.save(equipamento);
    }

    @PutMapping("/{id}")
    public Equipamento atualizar(@PathVariable Long id, @RequestBody Equipamento equipamento) {
        equipamento.setId(id);
        return equipamentoService.save(equipamento);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        equipamentoService.deleteById(id);
    }
}