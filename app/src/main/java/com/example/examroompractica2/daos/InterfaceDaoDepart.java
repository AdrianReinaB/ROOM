package com.example.examroompractica2.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.examroompractica2.entidades.Departamento;

import java.util.List;

@Dao
public interface InterfaceDaoDepart {

    @Insert
    public void crearDepart(Departamento depart);

    @Delete
    public void borrarDepartamento(Departamento depart);

    @Update
    public void modificarDepartamento(Departamento depart);

    @Query("SELECT * FROM departamento")
    public List<Departamento> verDepart();
}
