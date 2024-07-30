package com.app.mybatis.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.mybatis.entities.departamento;
import com.app.mybatis.mappers.DepartamentoMappers;
import com.app.mybatis.services.DepartamentoService;


@Controller
@RequestMapping("/departamentos")
public class DepartamentoController {

//@Autowired
//private DepartamentoMappers departamentoMapper;
@Autowired
private DepartamentoService depaService;

	
@GetMapping({"/listar","/"})
public String listarDepartamentos(Model model) {
	
	//List<departamento> departamentos = depaService.ListarTodosLosDepartamentos();
	model.addAttribute("departamentos", depaService.ListarTodosLosDepartamentos());
	return "departamentos/listar_departamentos";
}
/*
@GetMapping("/{id}")
public String detallesDepartamentos(@PathVariable int id, Model model) {
	
	departamento departamento = departamentoMapper.getDepartamentoById(id);
	model.addAttribute("departamento",departamento);
	return "departamentos/detalles_departamentos";
}


@GetMapping("/nuevo")
public String mostrarFormDepartamento(Model model) {
	model.addAttribute("departamento",new departamento());
	return "departamentos/form_departamento";
	}


@PostMapping("/guardar")
public String guardarDepartamento(@ModelAttribute departamento departamentos) {
	departamentoMapper.insertDepartamento(departamentos);
	return "redirect:/departamentos/listar";
	}

@GetMapping("/{id}/editar")
public String mostrarFormEditarDepartamento(@PathVariable int id, Model model) {
	departamento departamentos = departamentoMapper.getDepartamentoById(id);
	model.addAttribute("departamento",departamentos);
	return "departamentos/editar_departamentos";
	}


@PostMapping("/{id}/actulizar")
public String guardarActualizarDepartamento(@PathVariable int id,@ModelAttribute departamento departamentos) {
	departamentos.setId(id);
	departamentoMapper.updateDepartamento(departamentos);
	return "redirect:/departamentos/listar";
	}
*/


}
