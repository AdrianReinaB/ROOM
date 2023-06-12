package com.example.examroompractica2.entidades;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Junction;
import androidx.room.PrimaryKey;
import androidx.room.Relation;

import java.util.List;

@Entity(tableName = "asignatura")
public class Asignatura {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private int idAsig;

    @ColumnInfo(name = "nombre")
    private String nombre;

    public Asignatura() {
    }


    public Asignatura(String nombre) {
        this.nombre = nombre;
    }

    public int getIdAsig() {
        return idAsig;
    }

    public void setIdAsig(int idAsig) {
        this.idAsig = idAsig;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
