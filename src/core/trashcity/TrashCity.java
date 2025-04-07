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
import java.util.Collections;

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
    
    public void showMinMaxTurnoPorResiduo() {
        String[] nombreResiduos = {"Vidrio", "Papel", "Plastico", "Metal", "Residuos Organicos"};
        
        double[] minCantidad = {21, 21, 21, 21, 21};
        Turno[] minTurno = new Turno[nombreResiduos.length];
        
        double[] maxCantidad = {-1, -1, -1, -1, -1};
        Turno[] maxTurno = new Turno[nombreResiduos.length];
        
        for (Turno turno : this.turnos) {
            if (turno.getResiduos().getVidrio() < minCantidad[0]) {
                minCantidad[0] = turno.getResiduos().getVidrio();
                minTurno[0] = turno;
            }
            if (turno.getResiduos().getPapel() < minCantidad[1]) {
                minCantidad[1] = turno.getResiduos().getPapel();
                minTurno[1] = turno;
            }
            if (turno.getResiduos().getPlastico() < minCantidad[2]) {
                minCantidad[2] = turno.getResiduos().getPlastico();
                minTurno[2] = turno;
            }
            if (turno.getResiduos().getMetal() < minCantidad[3]) {
                minCantidad[3] = turno.getResiduos().getMetal();
                minTurno[3] = turno;
            }
            if (turno.getResiduos().getResiduosOrganicos() < minCantidad[4]) {
                minCantidad[4] = turno.getResiduos().getResiduosOrganicos();
                minTurno[4] = turno;
            }
            if (turno.getResiduos().getVidrio() > maxCantidad[0]) {
                maxCantidad[0] = turno.getResiduos().getVidrio();
                maxTurno[0] = turno;
            }
            if (turno.getResiduos().getPapel() > maxCantidad[1]) {
                maxCantidad[1] = turno.getResiduos().getPapel();
                maxTurno[1] = turno;
            }
            if (turno.getResiduos().getPlastico() > maxCantidad[2]) {
                maxCantidad[2] = turno.getResiduos().getPlastico();
                maxTurno[2] = turno;
            }
            if (turno.getResiduos().getMetal() > maxCantidad[3]) {
                maxCantidad[3] = turno.getResiduos().getMetal();
                maxTurno[3] = turno;
            }
            if (turno.getResiduos().getResiduosOrganicos() > maxCantidad[4]) {
                maxCantidad[4] = turno.getResiduos().getResiduosOrganicos();
                maxTurno[4] = turno;
            }
        }
        for (int i = 0; i < nombreResiduos.length; i++) {
            System.out.println("Residuo - " + nombreResiduos[i]);
            System.out.println("- Turno Minimo:");
            System.out.println("  - ID: " + minTurno[i].getId());
            System.out.println("  - Camion: " + minTurno[i].getCamion().getPlaca());
            System.out.println("  - Conductor: " + minTurno[i].getConductor().getNombre());
            System.out.println("  - Asistente 1: " + minTurno[i].getAsistente1().getNombre());
            System.out.println("  - Asistente 2: " + minTurno[i].getAsistente2().getNombre());
            System.out.println("  - Fecha Inicio: " + minTurno[i].getFechaInicio());
            System.out.println("  - Fecha Fin: " + minTurno[i].getFechaFin());
            System.out.println("  - Cantidad: " + minCantidad[i]);
            System.out.println("- Turno Maximo:");
            System.out.println("  - ID: " + maxTurno[i].getId());
            System.out.println("  - Camion: " + maxTurno[i].getCamion().getPlaca());
            System.out.println("  - Conductor: " + maxTurno[i].getConductor().getNombre());
            System.out.println("  - Asistente 1: " + maxTurno[i].getAsistente1().getNombre());
            System.out.println("  - Asistente 2: " + maxTurno[i].getAsistente2().getNombre());
            System.out.println("  - Fecha Inicio: " + maxTurno[i].getFechaInicio());
            System.out.println("  - Fecha Fin: " + maxTurno[i].getFechaFin());
            System.out.println("  - Cantidad: " + maxCantidad[i] + "\n");
        }
    }
    
    public void showRutaMaxMetal() {
        ArrayList<Double> metalRuta = new ArrayList<>();
        for (Ruta ruta : this.rutas) {
            metalRuta.add(0.0);
            for (Turno turno : this.turnos) {
                if (ruta.equals(turno.getRuta())) {
                    metalRuta.set(metalRuta.size() - 1, metalRuta.get(metalRuta.size() - 1) + turno.getResiduos().getMetal());
                }
            }
        }
        int index = metalRuta.indexOf(Collections.max(metalRuta));
        System.out.println("Los puntos de la ruta con mayor cantidad de metal recogido son:");
        for (PuntoGeografico punto : this.rutas.get(index).getPuntosGeograficos()) {
            System.out.println("- " + punto);
        }
        System.out.println("La cantidad de metal total en la ruta es: " + metalRuta.get(index));
    }
    
}
