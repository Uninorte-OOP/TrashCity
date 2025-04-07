/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.person;

import core.trashcity.system.Turno;
import java.util.ArrayList;

/**
 *
 * @author edangulo
 */
public class Asistente extends Empleado {
    
    private ArrayList<Turno> turnos;

    public Asistente(int id, String nombre, int edad, double salario) {
        super(id, nombre, edad, salario);
        this.turnos = new ArrayList<>();
    }
    
}
