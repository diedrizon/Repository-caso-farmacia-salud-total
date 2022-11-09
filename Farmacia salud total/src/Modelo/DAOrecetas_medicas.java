
package Modelo;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** @author diedr */

public class DAOrecetas_medicas {

   
     public Class_recetas_medicas Insertar(int cod_rece_mdc, int cod_medico , String clinica, String telf_medico,java.sql.Date fh_indicaciones,String ced_cli){
        String transaccion = "INSERT INTO recetas_medicas VALUES('"
        + cod_rece_mdc + "', '"
        + cod_medico + "','"
        + clinica + "','"
        + telf_medico + "','"
        + fh_indicaciones + "','"
        + ced_cli + ")"; 
        
        
    if (new DataBase().Actualizar(transaccion) > 0){
    return new Class_recetas_medicas(cod_rece_mdc,cod_medico ,clinica,telf_medico,ced_cli );
}
return null;
}
     public int Actualizar(int cod_rece_mdc,int cod_medico,String clinica, 
        String telf_medico, java.sql.Date fh_indicaciones, String ced_cli){
    
    String transaccion = "UPDATE recetas_medicas SET cod_medico='"
        + cod_medico + "', clinica='"
        + clinica + "', telf_medico= '"
        + telf_medico + "',fh_indicaciones='"
        + fh_indicaciones + "',ced_cli='"
        + ced_cli +  "' WHERE cod_rece_mdc = "
        + cod_rece_mdc ;
    return new DataBase().Actualizar(transaccion);
}   
     public List obtenerDatos(){
    String transaccion = "SELECT * FROM recetas_medicas";
   
    List<Map> registros = new DataBase().Listar(transaccion);
    List<Class_recetas_medicas> recetas_medicas = new ArrayList(); 
    
    for(Map registro : registros) {
        Class_recetas_medicas aut = new Class_recetas_medicas ((int) registro.get("cod_rece_mdc"),
          (int) registro.get("cod_medico"),
          (String) registro.get("clinica"),
          (String) registro.get("ced_cli"),
          (java.sql.Date)registro.get("fh_indicaciones") ,
          (String) registro.get("telf_medico"));
        recetas_medicas.add(aut);
    }
    return recetas_medicas; // Retorna todos los autores ubicados en la tabla de DB

     }
     
     public int Eliminar(int cod){
    String transaccion = "DELETE FROM recetas_medicas WHERE cod_rece_mdc='"+cod +"'";
    
    return new DataBase().Actualizar(transaccion);
}

    public Class_recetas_medicas Insertar(String cod, String cod_m, String clinica, String tel, String ced, Date fech) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int Actualizar(int cod, int cod_m, String clinica, String telf, String ced, Date fec) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}
