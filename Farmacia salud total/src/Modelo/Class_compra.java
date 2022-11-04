
package Modelo;

import java.sql.Date;
import java.util.Map;

/** @author diedr */

public class Class_compra {
    private int cod_compra;
    private String vrd_prod;
    private float ctd_prod;
    private float ctd_t;
    private int cod_p;
    private Date fh_cp;
    private int cod_lab;

    public Class_compra(int cod_compra, String vrd_prod, float ctd_prod, float ctd_t, int cod_prod, Date fh_cp, int cod_lab) {
        this.cod_compra = cod_compra;
        this.vrd_prod = vrd_prod;
        this.ctd_prod = ctd_prod;
        this.ctd_t = ctd_t;
        this.cod_p = cod_prod;
        this.fh_cp = fh_cp;
        this.cod_lab = cod_lab;
    }

    public Class_compra(String vrd_prod, float ctd_prod, float ctd_t, Date fh_cp, int cod_prod) {
        this.vrd_prod = vrd_prod;
        this.ctd_prod = ctd_prod;
        this.ctd_t = ctd_t;
        this.fh_cp = fh_cp;
        this.cod_p = cod_prod;
    }
   
   
    Class_compra(int cod_compra, String vrd_prod, float ctd_prod, float ctd_t, int cod_prod, Date fh_cp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Class_compra(int i, String string, String string0, String string1, String string2, Date date) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Class_compra(int i, String string, String string0, float f, String string1, Date date) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getCod_compra() {
        return cod_compra;
    }

    public void setCod_compra(int cod_compra) {
        this.cod_compra = cod_compra;
    }

    public String getVrd_prod() {
        return vrd_prod;
    }

    public void setVrd_prod(String vrd_prod) {
        this.vrd_prod = vrd_prod;
    }

    public float getCtd_prod() {
        return ctd_prod;
    }

    public void setCtd_prod(float ctd_prod) {
        this.ctd_prod = ctd_prod;
    }

    public float getCtd_t() {
        return ctd_t;
    }

    public void setCtd_t(float ctd_t) {
        this.ctd_t = ctd_t;
    }

    public Date getFh_cp() {
        return fh_cp;
    }

    public void setFh_cp(Date fh_cp) {
        this.fh_cp = fh_cp;
    }

    public int getCod_prod() {
        return cod_p;
    }

    public void setCod_prod(int cod_prod) {
        this.cod_p = cod_prod;
    }
     
    public int getCod_lab() {
        return cod_lab;
    }

    public void setCod_lab(int cod_lab) {
        this.cod_lab = cod_lab;
    }
    
            
}
