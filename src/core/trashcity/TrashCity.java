/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.trashcity;

import core.person.Empleado;
import core.trashcity.system.Ruta;
import core.trashcity.system.Turno;
import core.trashcity.vehicles.Camion;
import java.util.ArrayList;

/**
 *
 * @author edangulo
 */
public class TrashCity {
    
    private ArrayList<Empleado> empleados;
    private ArrayList<Camion> camiones;
    private ArrayList<Ruta> rutas;
    private ArrayList<Turno> turnos;

    public TrashCity() {
        this.empleados = new ArrayList<>();
        this.camiones = new ArrayList<>();
        this.rutas = new ArrayList<>();
        this.turnos = new ArrayList<>();
    }
    
}
