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

import com.freelancecode.traprural.entities.PropriedadeRural;
import com.freelancecode.traprural.services.PropriedadeService;

@RestController
@RequestMapping("/api/propriedades")
public class PropriedadeRuralController {

    @Autowired
    private PropriedadeService propriedadeService;

    @GetMapping
    public List<PropriedadeRural> listarTodos() {
        return propriedadeService.findAll();
    }

    @GetMapping("/{id}")
    public PropriedadeRural buscarPorId(@PathVariable Long id) {
        return propriedadeService.findById(id);
    }

    @PostMapping
    public PropriedadeRural criar(@RequestBody PropriedadeRural propriedade) {
        return propriedadeService.save(propriedade);
    }

    @PutMapping("/{id}")
    public PropriedadeRural atualizar(@PathVariable Long id, @RequestBody PropriedadeRural propriedade) {
        propriedade.setId(id);
        return propriedadeService.save(propriedade);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        propriedadeService.deleteById(id);
    }
}