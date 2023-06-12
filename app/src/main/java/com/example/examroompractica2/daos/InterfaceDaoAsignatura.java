package com.example.examroompractica2.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.examroompractica2.entidades.Asignatura;

import java.util.List;

@Dao
public interface InterfaceDaoAsignatura {

    @Insert
    public void crearAsignatura(Asignatura asig);

    @Delete
    public void borrarAsignatura(Asignatura asig);

    @Update
    public void modificarAsignatura(Asignatura asig);

    @Query("SELECT * FROM asignatura")
    public List<Asignatura> verAsignaturas();
}
