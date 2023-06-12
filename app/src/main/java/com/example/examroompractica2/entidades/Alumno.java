package com.example.examroompractica2.entidades;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Junction;
import androidx.room.PrimaryKey;
import androidx.room.Relation;

import java.util.List;

@Entity(tableName = "alumno",
        foreignKeys = @ForeignKey(entity = Grupo.class,
                parentColumns = "id",
                childColumns = "grupoId"))
public class Alumno {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name="id")
    private int idAlu;

    @ColumnInfo(name="nombre")
    private String nombre;

    @ColumnInfo(name="apellido")
    private String apellido;

    @ColumnInfo(name = "grupoId")
    private String grupoId;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, String grupoId) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.grupoId = grupoId;
    }

    public int getIdAlu() {
        return idAlu;
    }

    public void setIdAlu(int idAlu) {
        this.idAlu = idAlu;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGrupoId() {
        return grupoId;
    }

    public void setGrupoId(String grupoId) {
        this.grupoId = grupoId;
    }
}
