package com.example.examroompractica2.daos;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.examroompractica2.entidades.AlumAsig;
import com.example.examroompractica2.entidades.Alumno;
import com.example.examroompractica2.entidades.Asignatura;

import java.util.List;

@Dao
public interface InterfaceDaoAlumAsig {

    @Insert
    void insert(AlumAsig alumAsig);

    @Query("SELECT * FROM alumno INNER JOIN alumAsig ON alumno.id = alumAsig.alumnoId WHERE alumAsig.asignaturaId = :asignaturaId")
    List<Alumno> getAlumnosPorAsignatura(int asignaturaId);

    @Query("SELECT * FROM asignatura INNER JOIN alumAsig ON asignatura.id = alumAsig.asignaturaId WHERE alumAsig.alumnoId = :alumnoId")
    List<Asignatura> getAsignaturasPorAlumno(int alumnoId);
}
