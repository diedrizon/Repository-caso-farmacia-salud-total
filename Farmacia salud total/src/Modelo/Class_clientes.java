
package Modelo;


/** @author diedr */


public class Class_clientes {
    private String ced_cli;
    private String nbr_1_cli;
    private String nbr_2_cli;
    private String apelli_1_cli;
    private String apelli_2_cli;
    private String direc_cli;
    private String telf_cli;


    public Class_clientes(String nbr_1_cli, String nbr_2_cli, String apelli_1_cli, String apelli_2_cli, String direc_cli, String tel_cli) {
        this.nbr_1_cli = nbr_1_cli;
        this.nbr_2_cli = nbr_2_cli;
        this.apelli_1_cli = apelli_1_cli;
        this.apelli_2_cli = apelli_2_cli;
        this.direc_cli = direc_cli;
        this.telf_cli = tel_cli;
    }
    
    public Class_clientes(String ced_cli, String nbr_1_cli, String nbr_2_cli, String apelli_1_cli, String apelli_2_cli, String direc_cli, String tel_cli) {
        this.ced_cli = ced_cli;
        this.nbr_1_cli = nbr_1_cli;
        this.nbr_2_cli = nbr_2_cli;
        this.apelli_1_cli = apelli_1_cli;
        this.apelli_2_cli = apelli_2_cli;
        this.direc_cli = direc_cli;
        this.telf_cli = tel_cli;
    }

    public String getCed_cli() {
        return ced_cli;
    }

    public void setCed_cli(String ced_cli) {
        this.ced_cli = ced_cli;
    }

    public String getNbr_1_cli() {
        return nbr_1_cli;
    }

    public void setNbr_1_cli(String nbr_1_cli) {
        this.nbr_1_cli = nbr_1_cli;
    }

    public String getNbr_2_cli() {
        return nbr_2_cli;
    }

    public void setNbr_2_cli(String nbr_2_cli) {
        this.nbr_2_cli = nbr_2_cli;
    }

    public String getApelli_1_cli() {
        return apelli_1_cli;
    }

    public void setApelli_1_cli(String apelli_1_cli) {
        this.apelli_1_cli = apelli_1_cli;
    }

    public String getApelli_2_cli() {
        return apelli_2_cli;
    }

    public void setApelli_2_cli(String apelli_2_cli) {
        this.apelli_2_cli = apelli_2_cli;
    }

    public String getDirec_cli() {
        return direc_cli;
    }

    public void setDirec_cli(String direc_cli) {
        this.direc_cli = direc_cli;
    }

    public String getTel_cli() {
        return telf_cli;
    }

    public void setTel_cli(String tel_cli) {
        this.telf_cli = tel_cli;
    }
    
}
