package com.example.examroompractica2.entidades;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "profesor",
        foreignKeys = @ForeignKey(entity = Grupo.class,
                parentColumns = "id",
                childColumns = "departId"))
public class Profesor {

    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "id")
    private int id;

    @ColumnInfo(name = "nombre")
    private String nombre;

    @ColumnInfo(name = "departId")
    private String departId;

    public Profesor() {
    }

    public Profesor(int id, String nombre, String departId) {
        this.id = id;
        this.nombre = nombre;
        this.departId = departId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartId() {
        return departId;
    }

    public void setDepartId(String departId) {
        this.departId = departId;
    }
}
