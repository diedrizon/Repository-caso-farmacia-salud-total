
package Modelo;

import java.sql.Date;

/** @author diedr*/


public class Class_laboratorio {
     private int cod_lab;
    private String nbr_lab;
    private String direc_lab;
    private String telf_lab;

    public Class_laboratorio(String nbr_lab, String direc_lab, String telf_lab) {
        this.nbr_lab = nbr_lab;
        this.direc_lab = direc_lab;
        this.telf_lab = telf_lab;
    }

    public Class_laboratorio(int cod_lab, String nbr_lab, String direc_lab, String telf_lab) {
        this.cod_lab = cod_lab;
        this.nbr_lab = nbr_lab;
        this.direc_lab = direc_lab;
        this.telf_lab = telf_lab;
    }

    public int getCod_lab() {
        return cod_lab;
    }

    public void setCod_lab(int cod_lab) {
        this.cod_lab = cod_lab;
    }

    public String getNbr_lab() {
        return nbr_lab;
    }

    public void setNbr_lab(String nbr_lab) {
        this.nbr_lab = nbr_lab;
    }

    public String getDirec_lab() {
        return direc_lab;
    }

    public void setDirec_lab(String direc_lab) {
        this.direc_lab = direc_lab;
    }

    public String getTelf_lab() {
        return telf_lab;
    }

    public void setTelf_lab(String telf_lab) {
        this.telf_lab = telf_lab;
    }
    
   
   
    
}
