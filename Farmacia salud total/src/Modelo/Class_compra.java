
package Modelo;

import java.sql.Date;
import java.util.Map;

/** @author diedr */

public class Class_compra {
    private int cod_cp;
    private String vrd_p;
    private java.sql.Date fh_cp;
    private int cod_lab;

    public Class_compra(int cod_cp, String vrd_p, Date fh_cp,  int cod_lab) {
        this.cod_cp = cod_cp;
        this.vrd_p = vrd_p;
        this.fh_cp = fh_cp;
        this.cod_lab = cod_lab;
    }

    public Class_compra(String vrd_p, Date fh_cp, int cod_lab) {
        this.vrd_p = vrd_p;
        this.fh_cp = fh_cp;
        this.cod_lab = cod_lab;
    }

    
    public int getCod_cp() {
        return cod_cp;
    }

    public void setCod_cp(int cod_cp) {
        this.cod_cp = cod_cp;
    }

    public String getVrd_p() {
        return vrd_p;
    }

    public void setVrd_p(String vrd_p) {
        this.vrd_p = vrd_p;
    }

    public java.sql.Date  getFh_cp() {
        return fh_cp;
    }

    public void setFh_cp(java.sql.Date fh_cp) {
        this.fh_cp = fh_cp;
    }

    public int getCod_lab() {
        return cod_lab;
    }

    public void setCod_lab(int cod_lab) {
        this.cod_lab = cod_lab;
    }

}