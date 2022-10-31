
package Modelo;

import java.sql.Date;

/** @author diedri*/


public class Class_recetas_medicas {
    private int cod_rece_mdc;
    private int cod_medico;
    private String clinica;
    private String telf_medico;
    private Date fh_indicaciones;

    public Class_recetas_medicas(int cod_medico, String clinica, String telf_medico, Date fh_indicaciones) {
        this.cod_medico = cod_medico;
        this.clinica = clinica;
        this.telf_medico = telf_medico;
        this.fh_indicaciones = fh_indicaciones;
    }
    
    public Class_recetas_medicas(int cod_rece_mdc, int cod_medico, String clinica, String telf_medico, Date fh_indicaciones) {
        this.cod_rece_mdc = cod_rece_mdc;
        this.cod_medico = cod_medico;
        this.clinica = clinica;
        this.telf_medico = telf_medico;
        this.fh_indicaciones = fh_indicaciones;
    }

    public int getCod_rece_mdc() {
        return cod_rece_mdc;
    }

    public void setCod_rece_mdc(int cod_rece_mdc) {
        this.cod_rece_mdc = cod_rece_mdc;
    }

    public int getCod_medico() {
        return cod_medico;
    }

    public void setCod_medico(int cod_medico) {
        this.cod_medico = cod_medico;
    }

    public String getClinica() {
        return clinica;
    }

    public void setClinica(String clinica) {
        this.clinica = clinica;
    }

    public String getTelf_medico() {
        return telf_medico;
    }

    public void setTelf_medico(String telf_medico) {
        this.telf_medico = telf_medico;
    }

    public Date getFh_indicaciones() {
        return fh_indicaciones;
    }

    public void setFh_indicaciones(Date fh_indicaciones) {
        this.fh_indicaciones = fh_indicaciones;
    }
    
}
