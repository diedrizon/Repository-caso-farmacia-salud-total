
package Modelo;

import java.sql.Date;
import java.util.*;

/** @author diedr */

public class DAOlaboratorio {
    
    public Class_laboratorio Insertar(String nbr_lab, String direc_lab, String telf_lab ){
        String transaccion = "INSERT INTO laboratorio VALUES('"
        + nbr_lab + "', '"
        + direc_lab + "','"
        + telf_lab + ")"; 
        
        
    if (new DataBase().Actualizar(transaccion) > 0){
    return new Class_laboratorio(nbr_lab,direc_lab ,telf_lab );
}
return null;
}
     public int Actualizar(int cod_lab,String nbr_lab, 
        String direc_lab, String telf_lab){
    
    String transaccion = "UPDATE labotatorio SET nbr_lab='"
        + nbr_lab + "', direc_lab='"
        + direc_lab + "', telf_lab= '"
        + telf_lab + "', WHERE cod_lab= '"
        + cod_lab ;
    return new DataBase().Actualizar(transaccion);
}   
     public List obtenerDatos(){
    String transaccion = "SELECT * FROM laboratorio";
    //Llama a metodos listar de DateBase.java
    List<Map> registros = new DataBase().Listar(transaccion);
    List<Map> laboratorio = new ArrayList(); // Areglos de autores
    
    for(Map registro : registros) {
        Class_laboratorio aut = new Class_laboratorio ((int) registro.get("cod_lab"),
          (String) registro.get("nbr_lab"),
          (String) registro.get("direc_lab"),
          (String) registro.get("telf_lab"));
        laboratorio.add((Map) aut);
    }
    return laboratorio; // Retorna todos los autores ubicados en la tabla de DB

     }
     
     public int Eliminar(int id){
    String transaccion = "DELETE FROM laboratorio WHERE cod_lab='"+id +"'";
    
    return new DataBase().Actualizar(transaccion);
}

    public Class_laboratorio Insertar(String cod, String nbr, String direc, String telf) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}