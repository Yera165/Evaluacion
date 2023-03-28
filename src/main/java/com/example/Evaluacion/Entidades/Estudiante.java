package com.example.Evaluacion.Entidades;

import java.util.ArrayList;
import java.util.Arrays;

public class Estudiante {
    private int codigo;
    private String nombre;
    private String apellido;
    private String[] materias = new String[3];
    private Float[] notas = new Float[3];
    private Float definitiva;
    private String juicio ;

    public String getJuicio() {
        return juicio;
    }

    public void setJuicio(String juicio) {
        this.juicio = juicio;
    }

    public Float getDefinitiva() {
        return definitiva;
    }

    public void setDefinitiva(Float definitiva) {
        this.definitiva = definitiva;
    }

    public Estudiante(int codigo, String nombre, String apellido, String[] materias, Float[] notas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.materias = materias;
        this.notas = notas;
    }

    public Estudiante() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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


    public String[] getMaterias() {
        return materias;
    }

    public void setMaterias(String[] materias) {
        this.materias = materias;
    }


    public Float[] getNotas() {
        return notas;
    }

    public void setNotas(Float[] notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", materias=" + Arrays.toString(materias) +
                ", notas=" + Arrays.toString(notas) +
                ", definitiva=" + definitiva +
                ", juicio=" + juicio +
                '}';
    }
}
