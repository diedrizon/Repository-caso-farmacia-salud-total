
package Modelo;

import java.sql.Date;

/**@author diedr*/


public class Class_productos {
    private int cod_prod;
    private String nbr_prod;
    private float prec_cp;
    private float prec_vt;
    private String existe_prod;
    private String lab_prod;
    private String dcrip_prod;
    private Date fh_venc;

    public Class_productos(int cod_prod, String nbr_prod, float prec_cp, float prec_vt, String existe_prod, String lab_prod, String dcrip_prod, Date fh_venc) {
        this.cod_prod = cod_prod;
        this.nbr_prod = nbr_prod;
        this.prec_cp = prec_cp;
        this.prec_vt = prec_vt;
        this.existe_prod = existe_prod;
        this.lab_prod = lab_prod;
        this.dcrip_prod = dcrip_prod;
        this.fh_venc = fh_venc;
    }

  


    public int getCod_prod() {
        return cod_prod;
    }

    public void setCod_prod(int cod_prod) {
        this.cod_prod = cod_prod;
    }

    public String getNbr_prod() {
        return nbr_prod;
    }

    public void setNbr_prod(String nbr_prod) {
        this.nbr_prod = nbr_prod;
    }

    public float getPrec_cp() {
        return prec_cp;
    }

    public void setPrec_cp(float prec_cp) {
        this.prec_cp = prec_cp;
    }

    public float getPrec_vt() {
        return prec_vt;
    }

    public void setPrec_vt(float prec_vt) {
        this.prec_vt = prec_vt;
    }

    public String getExiste_prod() {
        return existe_prod;
    }

    public void setExiste_prod(String existe_prod) {
        this.existe_prod = existe_prod;
    }

    public String getLab_prod() {
        return lab_prod;
    }

    public void setLab_prod(String lab_prod) {
        this.lab_prod = lab_prod;
    }

    public String getDcrip_prod() {
        return dcrip_prod;
    }

    public void setDcrip_prod(String dcrip_prod) {
        this.dcrip_prod = dcrip_prod;
    }

    public Date getFh_venc() {
        return fh_venc;
    }

    public void setFh_venc(Date fh_venc) {
        this.fh_venc = fh_venc;
    }
  
            
}
