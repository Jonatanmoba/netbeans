/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JerarquiaAlumno;

/**
 *
 * @author isabel
 */
public abstract class Alumno {
    protected String nombre;
    protected int edad;
    protected boolean becario;

    public Alumno(String nombre, int edad, boolean becario) {
        this.nombre = nombre;
        this.edad = edad;
        this.becario = becario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isBecario() {
        return becario;
    }

    public void setBecario(boolean becario) {
        this.becario = becario;
    }

    @Override
    public String toString() {
        return "{" + "nombre=" + nombre + ", edad=" + edad + ", becario=" + becario + '}';
    }

}
