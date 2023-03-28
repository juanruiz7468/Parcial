package com.juanjose.Parcial.Domain;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Paciente {
    private long cedula;
    private String nombre;
    private List<Enfermedad> enfermedades;

    public Paciente() {
        this.enfermedades=new ArrayList<>();

    }

    public  List<Enfermedad> getEnfermedades() {
        return enfermedades;
    }

    public Paciente(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
