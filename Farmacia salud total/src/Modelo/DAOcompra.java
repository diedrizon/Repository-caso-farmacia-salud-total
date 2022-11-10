
package Modelo;

import java.sql.Date;
import java.util.*;

/** @author diedr*/

public class DAOcompra {
    
    public Class_compra Insertar(int cod_cp, String vrd_p, float ctd_p,
        float ctd_t,int cod_p, java.sql.Date fh_cp, int cod_lab){
String transaccion = "INSERT INTO compra VALUES('"
        + cod_cp + "', '"
        + vrd_p + "','"
        + ctd_p + "', '"
        + ctd_t + "', '" 
        + fh_cp + "','" 
        + cod_p + "','"
        + cod_lab + "')"; 
//Llamar al metodo Actualizar ubicado en DateBase.java
if (new DataBase().Actualizar(transaccion) > 0){
    return new Class_compra (cod_cp, vrd_p, ctd_p, ctd_t, cod_p,fh_cp,cod_lab);
}
return null;
}
    public int Actualizar (int cod_cp, String vrd_p, float ctd_p,
        float ctd_t,int cod_p, Date fh_cp,int cod_lab){
        
      String transaccion = "UPDATE compra SET vrd_p ='"
        + vrd_p + "', ctd_p= '"
        + ctd_p + "', ctd_t= '"
        + ctd_t +   "', cod_p= '" 
        + cod_p + "', fh_cp= '"  
        + fh_cp + "', cod_lab= '"
        + cod_lab + "' WHERE cod_cp= "
        + cod_cp  ;
        return new DataBase().Actualizar(transaccion);
    }
    public List obtenerDatos(){
    String transaccion = "SELECT * FROM compra";
    //Llama a metodos listar de DateBase.java
    List<Map> registros = new DataBase().Listar(transaccion);
    List<Class_compra> compra = new ArrayList();
    
    for(Map registro : registros) {
        Class_compra aut = new Class_compra ((int) registro.get("cod_cp"),
          (String) registro.get("vrd_p"),
          (float) registro.get("ctd_p"),
          (float) registro.get("ctd_t"),
          (int) registro.get("cod_p"),
          (java.sql.Date) registro.get("fh_cp"),
          (int) registro.get("cod_lab"));
        compra.add(aut);
}
return compra; 

}
    public int Eliminar(int cod){
    String transaccion = "DELETE FROM compra WHERE cod_cp='"+cod +"'";
 
    return new DataBase().Actualizar(transaccion);
    
}
}
