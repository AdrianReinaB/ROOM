package com.example.examroompractica2.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.examroompractica2.entidades.Grupo;

import java.util.List;

@Dao
public interface InterfaceDaoGrupo {

    @Insert
    public void crearGrupo(Grupo gru);

    @Delete
    public void borrarGrupo(Grupo gru);

    @Update
    public void modificarGrupo(Grupo gru);

    @Query("SELECT * FROM grupo")
    public List<Grupo> verGrupos();
}
