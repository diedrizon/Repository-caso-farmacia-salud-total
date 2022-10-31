
package Modelo;

import java.sql.Date;
import java.util.*;

/** @author diedr */


public class DAOproductos {
    public Class_productos Insertar(int cod_prod, String nbr_prod, float prec_cp,
       float prec_vt, String exite_prod ,String lab_prod ,String dcrip_prod, java.sql.Date fh_venc){
        
String transaccion = "INSERT INTO Autor VALUES('"
        + cod_prod + "', '"
        + nbr_prod + "','"
        + prec_cp + "', '"
        + prec_vt + "', '" 
        + exite_prod + "', '" 
        + lab_prod + "', '" 
        + dcrip_prod + "', '" 
        + fh_venc +  "')"; 
//Llamar al metodo Actualizar ubicado en DateBase.java
if (new DataBase().Actualizar(transaccion) > 0){
    return new Class_productos(nbr_prod, prec_cp, prec_vt, exite_prod, lab_prod,dcrip_prod,fh_venc );
}
return null;
}
//Metodo para actualizar un registro en la BD
public int Actualizar(int cod,String nbr_prod, float prec_cp,
        float prec_vt, String exite_prod, String lab_prod ,String dcrip_prod, java.sql.Date fh_venc){
    
    String transaccion = "UPDATE productos SET nbr_prod='"
        + nbr_prod + "', precio_cp='"
        + prec_cp + "', prec_vt= '"
        + prec_vt + "', exite_prod= '"
        + exite_prod +   "', lab_prod='" 
        + lab_prod +   "', fh_venc='"    
        + fh_venc +  "', dcrip_prod='"
        + dcrip_prod +  "' WHERE cod_prod=" 
        + cod ;
    return new DataBase().Actualizar(transaccion);
}
      
public List obtenerDatos(){
    String transaccion = "SELECT * FROM laboratorios";
    //Llama a metodos listar de DateBase.java
    List<Map> registros = new DataBase().Listar(transaccion);
    List<Map> productos = new ArrayList(); // Areglos de autores
    
    for(Map registro : registros) {
        Class_productos aut = new Class_productos ((int) registro.get("cod_prod"),
          (String) registro.get("nbr_prod"),
          (float) registro.get("prec_cp"),
          (float) registro.get("prec_vt"),
          (String) registro.get("exite_prod"),
          (String) registro.get("lab_prod"),
          (String) registro.get("dcrip_prod"),
          (java.sql.Date) registro.get("fh_venc"));
        productos.add((Map) aut);
}
return productos; // Retorna todos los autores ubicados en la tabla de DB

}

    public Class_productos Insertar(String cod, String nbr, String prec_c, String prec_v, String lab, String dcrip, String fh) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
