package com.app.mybatis.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.mybatis.entities.departamento;
import com.app.mybatis.repository.DepartamentoRepository;


@Service
public class DepartamentoServicesImp implements DepartamentoService{
	
	@Autowired
	private DepartamentoRepository depaR;
	@Override
	public List<departamento> ListarTodosLosDepartamentos() {
		// TODO Auto-generated method stub
		return depaR.findAll();
	}





}
