package com.example.examroompractica2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.examroompractica2.conexion.ConexionDB;
import com.example.examroompractica2.daos.InterfaceDaoAlumno;
import com.example.examroompractica2.daos.InterfaceDaoGrupo;
import com.example.examroompractica2.entidades.Alumno;
import com.example.examroompractica2.entidades.Grupo;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConexionDB con=ConexionDB.getConexion(this);
        InterfaceDaoGrupo daoGrupo = con.daoGrupo();
        InterfaceDaoAlumno daoAlum= con.daoAlumno();

        Grupo grp1=new Grupo("1", "adat", "aula_1");
        daoGrupo.crearGrupo(grp1);

        Alumno alum1=new Alumno("Adri", "Bellido", "1");
        daoAlum.crearAlumno(alum1);

        /*List<Grupo> listaGrupos=con.daoGrupo().verGrupos();
        for (Grupo grp : listaGrupos) {
            Log.d("grupo", "ID: " + grp.getId() + ", Nombre: " + grp.getNombre() + ", Aula: " + grp.getAula());
        }

        List<Alumno> listaAlumnos=con.daoAlumno().verAlumnos();
        for (Alumno alum : listaAlumnos){
            Log.d("alumno", "ID: "+ alum.getIdAlu()+ ", Nombre: "+ alum.getNombre() + ", Apellido: "+ alum.getApellido() + ", Grupo: "+alum.getGrupoId());
        }*/

        List<Alumno> listaAlumnosGrupo=con.daoAlumno().verAlumnosPorGrupo("1");
        for (Alumno alum : listaAlumnosGrupo){
            Log.d("alumno", "ID: "+ alum.getIdAlu()+ ", Nombre: "+ alum.getNombre() + ", Apellido: "+ alum.getApellido() + ", Grupo: "+alum.getGrupoId());
        }


    }
}