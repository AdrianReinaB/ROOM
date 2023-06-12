package com.example.examroompractica2.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.examroompractica2.entidades.Profesor;

import java.util.List;

@Dao
public interface InterfaceDaoProfesor {

    @Insert
    public void crearProfesor(Profesor pro);

    @Delete
    public void borrarProfesor(Profesor pro);

    @Update
    public void modificarProfesor(Profesor pro);

    @Query("SELECT * FROM profesor")
    public List<Profesor> verProfesores();

    @Query("SELECT * FROM profesor WHERE departId = :departId")
    public List<Profesor> verProfesoresPorDepart(String departId);
}
