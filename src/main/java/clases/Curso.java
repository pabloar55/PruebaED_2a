package clases;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.TreeSet;

/**
 * Clase Curso con atributos nombre y lista alumnos
 * @version version inicial
 * @author Pablo Armas
 */
public class Curso {

    private String nombre;
    private TreeSet<Persona> listaAlumnos;

    /**
     * generamos el getter del TreeSet para comprobar que se añade
     * @return devuelve el TreeSet
     */
    public TreeSet<Persona> getListaAlumnos() {
        return listaAlumnos;
    }

    protected String getNombre() {
        return nombre;
    }

    public Curso(String nombre) {
        this.nombre = nombre;
        listaAlumnos = new TreeSet<>();
    }

    @Override
    public String toString() {
        String s = "--------------------" + nombre + "-----------------\n";
        s += "NumExp\tNIF\t\tNombre\t\tApellidos\n";
        s += "-------------------------------------------------\n";
        for (Persona listaAlumno : listaAlumnos) {
            s += listaAlumno + "\n";
        }
        return s;
    }

    /**
     * Metodo que añade una persona a la lista de alumnos
     * @param p la persona a añadir
     */
    public void aniadirAlumno(Persona p) {
        listaAlumnos.add(p);
    }
}
