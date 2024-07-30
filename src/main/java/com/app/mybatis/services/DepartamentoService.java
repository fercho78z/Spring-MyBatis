package com.app.mybatis.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.mybatis.entities.departamento;

@Service
public interface DepartamentoService {
	 List<departamento> ListarTodosLosDepartamentos();

	
	
}
