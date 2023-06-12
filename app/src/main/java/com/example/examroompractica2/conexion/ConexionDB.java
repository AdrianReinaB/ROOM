package com.example.examroompractica2.conexion;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;


import com.example.examroompractica2.daos.InterfaceDaoAlumAsig;
import com.example.examroompractica2.daos.InterfaceDaoAlumno;
import com.example.examroompractica2.daos.InterfaceDaoAsignatura;
import com.example.examroompractica2.daos.InterfaceDaoGrupo;
import com.example.examroompractica2.entidades.AlumAsig;
import com.example.examroompractica2.entidades.Alumno;
import com.example.examroompractica2.entidades.Asignatura;
import com.example.examroompractica2.entidades.Grupo;

@Database(entities = {Alumno.class, Grupo.class, Asignatura.class, AlumAsig.class}, version = 2)
public abstract class ConexionDB extends RoomDatabase {
    public static ConexionDB INSTANCE;

    public abstract InterfaceDaoAlumno daoAlumno();
    public abstract InterfaceDaoAsignatura daoAsignatura();
    public abstract InterfaceDaoGrupo daoGrupo();
    public abstract InterfaceDaoAlumAsig daoAlumAsig();

    public static ConexionDB getConexion(Context context){

        if(INSTANCE==null){
            INSTANCE= Room.databaseBuilder(context.getApplicationContext(),
                    ConexionDB.class, "centro").allowMainThreadQueries()
                    .addMigrations().build();
        }

        return INSTANCE;
    }

    public void destroyInstance(){
        INSTANCE=null;
    }

    public static final Migration MIGRATION_1_2 = new Migration(1, 2) {
        @Override
        public void migrate(@NonNull SupportSQLiteDatabase database) {
            database.execSQL("CREATE TABLE profesor(id Integer PRIMARY KEY NOT NULL, nombre TEXT, departId TEXT, FOREIGN KEY(departId) REFERENCES departamento(id))");
            database.execSQL("CREATE TABLE departamento(id TEXT PRIMARY KEY NOT NULL, nombre TEXT)");
        }
    };
}
