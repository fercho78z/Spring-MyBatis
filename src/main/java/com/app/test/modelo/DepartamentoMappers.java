package com.app.test.modelo;

import java.util.List;


import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


import com.app.test.entities.departamento;

//@MapperScan("com.app.mybatis.mappers")
@Mapper
public interface DepartamentoMappers  {

  @Insert("INSERT INTO departamento(nombre,ubicacion) VALUES(#{nombre},#{ubicacion})")
  void insertDepartamento(departamento departamentos);
  
  @Select("SELECT * FROM departamento WHERE id=#{id}")
  departamento getDepartamentoById(int id);
  
  @Select("SELECT * FROM departamento")
  List<departamento> getAllDepartamentos();
  
  @Update("UPDATE departamento SET nombre= #{nombre}, ubicacion= #{ubicacion} WHERE id=#{id}")
  void updateDepartamento(departamento departamentos);
  
  @Delete("DELETE FROM departamento WHERE id=#{id}")
  void deleteDepartamento(int id);

}