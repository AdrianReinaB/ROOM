package com.example.examroompractica2.entidades;

import androidx.room.Entity;
import androidx.room.ForeignKey;

@Entity(tableName = "alumAsig",
        primaryKeys = {"alumnoId", "asignaturaId"},
        foreignKeys = {
                @ForeignKey(entity = Alumno.class,
                        parentColumns = "id",
                        childColumns = "alumnoId"),
                @ForeignKey(entity = Asignatura.class,
                        parentColumns = "id",
                        childColumns = "asignaturaId")
        })
public class AlumAsig {

    public int alumnoId;
    public int asignaturaId;

    public AlumAsig() {
    }

    public AlumAsig(int alumnoId, int asignaturaId) {
        this.alumnoId = alumnoId;
        this.asignaturaId = asignaturaId;
    }

    public int getAlumnoId() {
        return alumnoId;
    }

    public void setAlumnoId(int alumnoId) {
        this.alumnoId = alumnoId;
    }

    public int getAsignaturaId() {
        return asignaturaId;
    }

    public void setAsignaturaId(int asignaturaId) {
        this.asignaturaId = asignaturaId;
    }
}
