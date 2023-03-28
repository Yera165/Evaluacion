package com.example.Evaluacion.Servicios;

import com.example.Evaluacion.Entidades.Estudiante;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

public class ServicioEstudiante {
    ArrayList<Estudiante> lista = new ArrayList<>();


    public ServicioEstudiante(){
        lista.add(new Estudiante(01,"Andres","Barbosa",new String[]{"Matematicas","Español","Ingles"},new Float[]{3.4f , 4.0f,3.0f} ));
        lista.add(new Estudiante(02,"Camilo","Rey",new String[]{"Matematicas","Español","Ingles"},new Float[]{1.9f , 3.0f,5.0f} ));
        lista.add(new Estudiante(03,"Felipe","Osorio",new String[]{"Matematicas","Español","Ingles"},new Float[]{3.3f , 1.3f,1.0f} ));
    }

    public ArrayList<Estudiante> MostrarTodos(){
        return lista;
    }
    public String agregarEstudiante(Estudiante e) {
        lista.add(e);
        return "Registro Exitoso";
    }

    public ArrayList Aprobo_reprobo(){
        for(Estudiante e:lista){
            e.setDefinitiva((e.getNotas()[0] + e.getNotas()[1] +e.getNotas()[2]) / 3 );
            if(e.getDefinitiva() > 3){
                e.setJuicio("Aprobo");
            }else{
                e.setJuicio("Reprobo");
            }

        }return lista;

    }


}
