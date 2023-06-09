package com.dio.academia.digital.controller;

import com.dio.academia.digital.entity.AvaliacaoFisica;
import com.dio.academia.digital.entity.form.AvaliacaoFisicaForm;
import com.dio.academia.digital.service.impl.AvaliacaoFisicaServiceImpl;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

  @Autowired
  private AvaliacaoFisicaServiceImpl service;

  @PostMapping
  public AvaliacaoFisica create(@RequestBody AvaliacaoFisicaForm form) {
    return service.create(form);
  }

  @GetMapping
  public List<AvaliacaoFisica> getAll(){
    return service.getAll();
  }

}
