package com.example.Evaluacion.Controller;

import com.example.Evaluacion.Entidades.Estudiante;
import com.example.Evaluacion.Servicios.ServicioEstudiante;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class ControladorEstudiante {
    ServicioEstudiante SE = new ServicioEstudiante();

    @GetMapping("/listaEstudiantes")
    public ArrayList<Estudiante> listar() {
        return SE.MostrarTodos();
    }

    @PostMapping("/insertarEstudiantes")
    public String insertar(@RequestBody Estudiante e){
        return SE.agregarEstudiante(e);
    }
    @GetMapping("/aprobacionEstudiantes")
    public ArrayList<Estudiante> aprobacion() {
        return SE.Aprobo_reprobo();

    }


}
