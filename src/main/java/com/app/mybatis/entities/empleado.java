package com.app.mybatis.entities;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor //crea un constructor sin atributos esto lo hace lombook
@AllArgsConstructor //crea un cosntructor con todos los atributos esto lo hace lombook
@Data //crea get y setter esto lo hace lombook


public class empleado {
	
	private int id;
	private String nombre;
	private String apellido;
	private double salario;
	private departamento departamentos;
	private List<proyecto> proyectos;
}
