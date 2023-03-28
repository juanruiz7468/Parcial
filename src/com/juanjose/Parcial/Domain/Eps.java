package com.juanjose.Parcial.Domain;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Eps {
    public static final byte Capacidad=100;
    private List<Paciente> pacientes;
    private String nombre;
    public Eps(){
        this.pacientes=new ArrayList<>();

    }
    public boolean afiliarpaciente(long cedula,String nombre){
        Paciente pacienteaañadir=new Paciente(cedula,nombre);
        if (buscarpaciente(cedula)==null&&pacientes.size()<=Capacidad) {
            this.pacientes.add(pacienteaañadir);
            return true;
        }
        else{
            return false;
        }



    }
    public void sacarpaciente(long cedula){
        if(buscarpaciente(cedula)!=null){
            for(Paciente paciente:this.pacientes){
                if(paciente.getCedula()==cedula){
                    this.pacientes.remove(paciente);
                    System.out.println("Se saco correctamente el paciente");
                    break;
                }
            }

        }
        else{
            System.out.println("No esta el paciente en la lista");
        }


    }
    public Paciente buscarpaciente(long cedula){
        Paciente pacientearetornar=null;
        for(Paciente paciente:this.pacientes){
            if (paciente.getCedula()==cedula){
                pacientearetornar=paciente;
                return pacientearetornar;
            }
        }
        System.out.println("el paciente no se encuentra en la lista");
        return pacientearetornar;

    }
    public List<Paciente> buscarpacientesporenfermedad(String enfermedad){
        List<Paciente> pacientes1 = null;
        List<Paciente> pacientes2=pacientes;
        for(Paciente paciente:pacientes2){
            for (Enfermedad enfermedad1:paciente.getEnfermedades()){
                if(enfermedad1.getNombre()==enfermedad){
                    pacientes1.add(paciente);
                    break;


                }


            }
        }
        return pacientes1;


    }
    public List<Paciente> obtenerpacientessinenfermedades(){
        List<Paciente> pacientes1 = null;
        for(Paciente paciente:pacientes) {
            for (Enfermedad enfermedad1 : paciente.getEnfermedades()) {
                if (enfermedad1.getNombre() == "ninguna") {
                    pacientes1.add(paciente);
                }
            }
        }
        return pacientes1;

    }
    public void ordenarpacientepornombre(){

    }

}
