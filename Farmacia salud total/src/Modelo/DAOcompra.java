
package Modelo;

import java.sql.Date;
import java.util.*;

/** @author diedr*/

public class DAOcompra {
    
    public Class_compra Insertar(int cod_compra, String vrd_prod, float ctd_prod,
        float ctd_t,int cod_prod, java.sql.Date fh_cp){
String transaccion = "INSERT INTO compra VALUES('"
        + cod_compra + "', '"
        + vrd_prod + "','"
        + ctd_prod + "', '"
        + ctd_t + "', '" 
        + cod_prod + "','"
        + fh_cp +  "')"; 
//Llamar al metodo Actualizar ubicado en DateBase.java
if (new DataBase().Actualizar(transaccion) > 0){
    return new Class_compra (cod_compra, vrd_prod, ctd_prod, ctd_t, cod_prod,fh_cp);
}
return null;
}
    public int Actualizar (int cod_compra, String vrd_prod, float ctd_prod,
        float ctd_t,int cod_prod, Date fh_cp){
        
      String transaccion = "UPDATE compra SET vrd_prod ='"
        + vrd_prod + "', ctd_prod= '"
        + ctd_prod + "', ctd_t= '"
        + ctd_t +   "', cod_prod='" 
        + cod_prod + "' fh_cp="  
        + fh_cp + "' WHERE cod_compra="
        + cod_compra  ;
        return new DataBase().Actualizar(transaccion);
    }
    public List obtenerDatos(){
    String transaccion = "SELECT * FROM compra";
    //Llama a metodos listar de DateBase.java
    List<Map> registros = new DataBase().Listar(transaccion);
    List<Map> compras  = new ArrayList(); // Areglos de autores
    
    for(Map registro : registros) {
        Class_compra aut = new Class_compra ((int) registro.get("cod_compra"),
          (String) registro.get("vrd_prod"),
          (float) registro.get("ctd_prod"),
          (float) registro.get("ctd_t"),
          (int) registro.get("cod_prod"),
          (java.sql.Date) registro.get("fh_cp"));
        compras.add((Map) aut);
}
return compras; // Retorna todos los autores ubicados en la tabla de DB

}
    public int Eliminar(int cod){
    String transaccion = "DELETE FROM compra WHERE cod_cp='"+cod +"'";
 
    return new DataBase().Actualizar(transaccion);
    
}
}
