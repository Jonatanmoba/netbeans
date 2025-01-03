/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteJerarquia;

import java.time.LocalDate;
import paqueteExcepciones.IdException;
import paqueteExcepciones.NumHorasException;

/**
 *
 * @author isabel
 */
public class EmpleadoHoras extends Empleado{
    protected int numHoras;
    protected static int PAGO_HORA=10;
    protected static int PAGO_EXTRA=20;
    
    /*Al ser IdException superclase de NieException y NifException no es necesario poner las
      dos últimas ya que IdException engloba a sus excepciones hijas
    */
    public EmpleadoHoras(int numHoras, Object object, String nombre, String apellidos, LocalDate fechaNac, LocalDate fechaTrabajo) throws IdException, NumHorasException{
        super(object, nombre, apellidos, fechaNac, fechaTrabajo);
        if (numHoras <= 0){
            throw new NumHorasException("Error, las horas han de ser positivas");
        }
        this.numHoras = numHoras;
    }
    public EmpleadoHoras(Object object, String nombre, String apellidos, LocalDate fechaNac, LocalDate fechaTrabajo) throws IdException {
        super(object, nombre, apellidos, fechaNac, fechaTrabajo);
        this.numHoras = 0;
    }

    //Getter
    public int getNumHoras() {
        return numHoras;
    }

    public static int getPAGO_HORA() {
        return PAGO_HORA;
    }

    public static int getPAGO_EXTRA() {
        return PAGO_EXTRA;
    }
    
    //Setter
    public void setNumHoras(int numHoras) throws NumHorasException{
        if (numHoras <= 0){
            throw new NumHorasException("Error en el numero de horas, ha de ser positivas");
        }
        this.numHoras = numHoras;
    }

    //10€ hora normal, 20€ hora extra
    @Override
    public float calculaSueldo() {
        if (this.numHoras > 40){
            this.sueldo= EmpleadoHoras.PAGO_HORA*40 + EmpleadoHoras.PAGO_EXTRA*(this.numHoras-40);
        }
        else{
            this.sueldo= this.numHoras*EmpleadoHoras.PAGO_HORA;
        }
        return this.sueldo;
    }

    @Override
    public String toString() {
        return super.toString()+" Numero de Horas=" + this.numHoras;
    }        
}
