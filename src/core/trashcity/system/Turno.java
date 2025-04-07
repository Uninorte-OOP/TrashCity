/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.trashcity.system;

import core.person.Asistente;
import core.person.Conductor;
import core.trashcity.vehicles.Camion;
import java.time.LocalDateTime;

/**
 *
 * @author edangulo
 */
public class Turno {
    
    private int id;
    private Camion camion;
    private Conductor conductor;
    private Asistente asistente1;
    private Asistente asistente2;
    private Ruta ruta;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private Residuo residuos;

    public Turno(int id, Camion camion, Conductor conductor, Asistente asistente1, Asistente asistente2, Ruta ruta) {
        this.id = id;
        this.camion = camion;
        this.conductor = conductor;
        this.asistente1 = asistente1;
        this.asistente2 = asistente2;
        this.ruta = ruta;
        this.fechaInicio = null;
        this.fechaFin = null;
        this.residuos = null;
        
        this.camion.addTurno(this);
        this.conductor.addTurno(this);
        this.asistente1.addTurno(this);
        this.asistente2.addTurno(this);
    }
    
    public void ejecutar(LocalDateTime fechaInicio, int horas) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaInicio.plusHours(horas);
    }
    
    public void clasificarResiduos(double vidrio, double papel, double plastico, double metal, double residuosOrganicos) {
        this.residuos = new Residuo(vidrio, papel, plastico, metal, residuosOrganicos);
    }
    
}
