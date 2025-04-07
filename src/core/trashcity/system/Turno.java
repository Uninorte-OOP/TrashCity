/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.trashcity.system;

import core.person.Asistente;
import core.person.Conductor;
import core.trashcity.vehicles.Camion;

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
    private Residuo residuos;

    public Turno(int id, Camion camion, Conductor conductor, Asistente asistente1, Asistente asistente2, Ruta ruta) {
        this.id = id;
        this.camion = camion;
        this.conductor = conductor;
        this.asistente1 = asistente1;
        this.asistente2 = asistente2;
        this.ruta = ruta;
        this.residuos = null;
    }
    
}
