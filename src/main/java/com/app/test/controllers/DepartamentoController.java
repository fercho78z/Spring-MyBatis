package com.app.test.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.test.entities.departamento;
import com.app.test.modelo.DepartamentoMappers;


@Controller
@RequestMapping("/departamentos")
public class DepartamentoController {

@Autowired
private DepartamentoMappers depaMapper;

@GetMapping({"/listar","/"})
public String listarDepartamentos(Model model) {
	List<departamento> depa = depaMapper.getAllDepartamentos();
	model.addAttribute("departamentos", depa);
	return "departamentos/listar_departamentos";
}
@GetMapping("/{id}")
public String detallesDepartamentos(@PathVariable int id, Model model) {
	
	departamento departamento = depaMapper.getDepartamentoById(id);
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
	depaMapper.insertDepartamento(departamentos);
	return "redirect:/departamentos/listar";
	}

@GetMapping("/{id}/editar")
public String mostrarFormEditarDepartamento(@PathVariable int id, Model model) {
	departamento departamentos = depaMapper.getDepartamentoById(id);
	model.addAttribute("departamento",departamentos);
	return "departamentos/editar_departamentos";
	}


@PostMapping("/{id}/actualizar")
public String guardarActualizarDepartamento(@PathVariable int id,@ModelAttribute departamento departamentos) {
	departamentos.setId(id);
	depaMapper.updateDepartamento(departamentos);
	return "redirect:/departamentos/listar";
	}

}
