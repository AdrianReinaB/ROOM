package com.example.examroompractica2.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.examroompractica2.entidades.Alumno;

import java.util.List;

@Dao
public interface InterfaceDaoAlumno {

    @Insert
    public void crearAlumno(Alumno alu);

    @Delete
    public void borrarAlumno(Alumno alu);

    @Update
    public void modificarAlumno(Alumno alu);

    @Query("SELECT * FROM alumno")
    public List<Alumno> verAlumnos();

    @Query("SELECT * FROM alumno WHERE grupoId = :grupoId")
    public List<Alumno> verAlumnosPorGrupo(String grupoId);
}
