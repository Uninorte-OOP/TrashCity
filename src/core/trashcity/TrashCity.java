/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.trashcity;

import core.person.Asistente;
import core.person.Conductor;
import core.person.Empleado;
import core.trashcity.system.PuntoGeografico;
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
    
    public void addCamion(Camion camion) {
        this.camiones.add(camion);
    }
    
    public void addEmpleado(Empleado empleado) {
        this.empleados.add(empleado);
    }
    
    public void addRuta(ArrayList<PuntoGeografico> puntos) {
        this.rutas.add(new Ruta(puntos));
    }
    
    public void addTurno(int id, Camion camion, Empleado conductor, Empleado asistente1, Empleado asistente2, Ruta ruta) {
        this.turnos.add(new Turno(id, camion, (Conductor) conductor, (Asistente) asistente1, (Asistente) asistente2, ruta));
    }
    
    public Camion getCamion(int camionId) {
        for (Camion camion : this.camiones) {
            if (camion.getId() == camionId) {
                return camion;
            }
        }
        return null;
    }
    
    public Empleado getEmpleado(int empleadoId) {
        for (Empleado empleado : this.empleados) {
            if (empleado.getId() == empleadoId) {
                return empleado;
            }
        }
        return null;
    }
    
    public Ruta getRuta(int index) {
        return this.rutas.get(index);
    }
    
    public Turno getTurno(int index) {
        return this.turnos.get(index);
    }
    
}
