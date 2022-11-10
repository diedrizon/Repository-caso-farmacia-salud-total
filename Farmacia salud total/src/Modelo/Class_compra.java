
package Modelo;

import java.sql.Date;
import java.util.Map;

/** @author diedr */

public class Class_compra {
    private int cod_cp;
    private String vrd_p;
    private float ctd_p;
    private float ctd_t;
    private int cod_p;
    private Date fh_cp;
    private int cod_lab;

    public Class_compra(int cod_cp, String vrd_p, float ctd_p, float ctd_t, int cod_p, Date fh_cp, int cod_lab) {
        this.cod_cp = cod_cp;
        this.vrd_p = vrd_p;
        this.ctd_p = ctd_p;
        this.ctd_t = ctd_t;
        this.cod_p = cod_p;
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

    public float getCtd_p() {
        return ctd_p;
    }

    public void setCtd_p(float ctd_p) {
        this.ctd_p = ctd_p;
    }

    public float getCtd_t() {
        return ctd_t;
    }

    public void setCtd_t(float ctd_t) {
        this.ctd_t = ctd_t;
    }

    public int getCod_p() {
        return cod_p;
    }

    public void setCod_p(int cod_p) {
        this.cod_p = cod_p;
    }

    public Date getFh_cp() {
        return fh_cp;
    }

    public void setFh_cp(Date fh_cp) {
        this.fh_cp = fh_cp;
    }

    public int getCod_lab() {
        return cod_lab;
    }

    public void setCod_lab(int cod_lab) {
        this.cod_lab = cod_lab;
    }

}