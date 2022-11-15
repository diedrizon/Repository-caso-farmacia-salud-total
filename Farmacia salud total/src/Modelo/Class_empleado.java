
package Modelo;

//import java.sql.Date;
import java.sql.Time;

/** @author diedr */

public class Class_empleado {
    private int cod_emp;
    private String ced_emp;
    private String nbr_1_emp;
    private String nbr_2_emp;
    private String apelli_1_emp;
    private String apelli_2_emp;
    private String direc_emp;
    private String telf_emp;
    private String tp_de_cargo;
    private int tp_de_turno;

    public Class_empleado(int cod_emp, String ced_emp, String nbr_1_emp, String nbr_2_emp, String apelli_1_emp, String apelli_2_emp, String direc_emp, String tel_emp, String tp_de_cargo, int tp_de_turno) {
        this.cod_emp = cod_emp;
        this.ced_emp = ced_emp;
        this.nbr_1_emp = nbr_1_emp;
        this.nbr_2_emp = nbr_2_emp;
        this.apelli_1_emp = apelli_1_emp;
        this.apelli_2_emp = apelli_2_emp;
        this.direc_emp = direc_emp;
        this.telf_emp = tel_emp;
        this.tp_de_cargo = tp_de_cargo;
        this.tp_de_turno = tp_de_turno;
        
    }

    public int getCod_emp() {
        return cod_emp;
    }

    public void setCod_emp(int cod_emp) {
        this.cod_emp = cod_emp;
    }

    public String getCed_emp() {
        return ced_emp;
    }

    public void setCed_emp(String ced_emp) {
        this.ced_emp = ced_emp;
    }

    public String getNbr_1_emp() {
        return nbr_1_emp;
    }

    public void setNbr_1_emp(String nbr_1_emp) {
        this.nbr_1_emp = nbr_1_emp;
    }

    public String getNbr_2_emp() {
        return nbr_2_emp;
    }

    public void setNbr_2_emp(String nbr_2_emp) {
        this.nbr_2_emp = nbr_2_emp;
    }

    public String getApelli_1_emp() {
        return apelli_1_emp;
    }

    public void setApelli_1_emp(String apelli_1_emp) {
        this.apelli_1_emp = apelli_1_emp;
    }

    public String getApelli_2_emp() {
        return apelli_2_emp;
    }

    public void setApelli_2_emp(String apelli_2_emp) {
        this.apelli_2_emp = apelli_2_emp;
    }

    public String getDirec_emp() {
        return direc_emp;
    }

    public void setDirec_emp(String direc_emp) {
        this.direc_emp = direc_emp;
    }

    public String getTel_emp() {
        return telf_emp;
    }

    public void setTel_emp(String tel_emp) {
        this.telf_emp = tel_emp;
    }

    public String getTp_de_cargo() {
        return tp_de_cargo;
    }

    public void setTp_de_cargo(String tp_de_cargo) {
        this.tp_de_cargo = tp_de_cargo;
    }

    public int getTp_de_turno() {
        return tp_de_turno;
    }

    public void setTp_de_turno(int tp_de_turno) {
        this.tp_de_turno = tp_de_turno;
    }
    }
    
    

