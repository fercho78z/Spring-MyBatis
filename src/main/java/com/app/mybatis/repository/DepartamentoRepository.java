package com.app.mybatis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
/*import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.mybatis.spring.annotation.MapperScan;
*/import org.springframework.stereotype.Repository;

import com.app.mybatis.entities.departamento;

/*@MapperScan("com.app.mybatis.mappers")
@Mapper*/
@Repository
public interface DepartamentoRepository extends JpaRepository<departamento, Integer> {
/*
  @Insert("INSERT INTO departamento(nombre,ubicacion) VALUES(#{nombre}),#{ubicacion}")
  void insertDepartamento(departamento departamentos);
  
  @Select("SELECT * FROM departamento WHERE id=#{id}")
  departamento getDepartamentoById(int id);
  
  @Select("SELECT * FROM departamento")
  List<departamento> getAllDepartamento();
  
  @Update("UPDATE departamento SET nombre= #{nombre}, ubicacion= #{ubicacion} WHERE id=#{id}")
  void updateDepartamento(departamento departamentos);
  
  @Delete("DELETE FROM departamento WHERE id=#{id}")
  void deleteDepartamento(int id);
*/
}
