package com.example.examroompractica2.entidades;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "departamento")
public class Departamento {

    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "id")
    private String id;

    @ColumnInfo(name = "nombre")
    private String nombre;

    public Departamento() {
    }

    public Departamento(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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
}
