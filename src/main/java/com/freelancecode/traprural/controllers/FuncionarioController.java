package com.freelancecode.traprural.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.freelancecode.traprural.entities.FuncionarioRural;
import com.freelancecode.traprural.services.FuncionarioRuralService;

@RestController
@RequestMapping("/api/funcionarios")

public class FuncionarioController {

    @Autowired
    private FuncionarioRuralService funcionarioRuralService;

    @GetMapping
    public List<FuncionarioRural> listarTodos() {
        return funcionarioRuralService.findAll();
    }

    @GetMapping("/{id}")
    public FuncionarioRural buscarPorId(@PathVariable Long id) {
        return funcionarioRuralService.findById(id);
    }

    @PostMapping
    public FuncionarioRural criar(@RequestBody FuncionarioRural funcionario) {
        return funcionarioRuralService.save(funcionario);
    }

    @PutMapping("/{id}")
    public FuncionarioRural atualizar(@PathVariable Long id, @RequestBody FuncionarioRural funcionario) {
        funcionario.setId(id);
        return funcionarioRuralService.save(funcionario);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        funcionarioRuralService.deleteById(id);
    }
}