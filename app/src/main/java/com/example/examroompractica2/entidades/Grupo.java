package com.example.examroompractica2.entidades;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.Relation;

import java.util.List;

@Entity(tableName = "grupo")
public class Grupo {

    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "id")
    @NonNull
    private String id;

    @ColumnInfo(name = "nombre")
    private String nombre;

    @ColumnInfo(name = "aula")
    private String aula;

    public Grupo() {
    }

    public Grupo(String id, String nombre, String aula) {
        this.id = id;
        this.nombre = nombre;
        this.aula = aula;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

}
