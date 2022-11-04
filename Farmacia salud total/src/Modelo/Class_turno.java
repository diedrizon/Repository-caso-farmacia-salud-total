
package Modelo;

import java.sql.Time;


/** @author diedr */


public class Class_turno {
     
    private int tp_de_turno;
    private java.sql.Time h_entrada;
    private java.sql.Time h_salida;

    public Class_turno(Time h_entrada, Time h_salida) {
        this.h_entrada = h_entrada;
        this.h_salida = h_salida;
    }
  
    public Class_turno(int tp_de_turno, Time h_entrada, Time h_salida) {
        this.tp_de_turno = tp_de_turno;
        this.h_entrada = h_entrada;
        this.h_salida = h_salida;
    }

    public int getTp_de_turno() {
        return tp_de_turno;
    }

    public void setTp_de_turno(int tp_de_turno) {
        this.tp_de_turno = tp_de_turno;
    }

    public Time getH_entrada() {
        return h_entrada;
    }

    public void setH_entrada(Time h_entrada) {
        this.h_entrada = h_entrada;
    }

    public Time getH_salida() {
        return h_salida;
    }

    public void setH_salida(Time h_salida) {
        this.h_salida = h_salida;
    }
    }
   
