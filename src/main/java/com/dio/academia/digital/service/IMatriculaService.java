package com.dio.academia.digital.service;

import com.dio.academia.digital.entity.Matricula;
import com.dio.academia.digital.entity.form.MatriculaForm;

import java.util.List;

public interface IMatriculaService {

  Matricula create(MatriculaForm form);

  Matricula get(Long id);

  List<Matricula> getAll(String bairro);

  void delete(Long id);

}
