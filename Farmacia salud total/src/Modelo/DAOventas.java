
package Modelo;

import java.sql.Date;
import java.util.*;

/** @author diedr */


public class DAOventas {
    
    public Class_ventas Insertar(int n_factura, float monto_vt , float cant_vt, Date fh_vt,int cod_emp,String ced_cli){
        String transaccion = "INSERT INTO ventas VALUES('"
        + n_factura + "', '"
        + monto_vt + "','"
        + cant_vt + "','"
        + fh_vt + "','"
        + cod_emp + "','"
        + ced_cli + ")"; 
        
        
    if (new DataBase().Actualizar(transaccion) > 0){
    return new Class_ventas(monto_vt,cant_vt ,fh_vt,cod_emp,ced_cli );
}
return null;
}
     public int Actualizar(int n_factura,int monto_vt,float cant_vt, 
        float fh_vt, int cod_emp, String ced_cli){
    
    String transaccion = "UPDATE ventas SET monto_vt='"
        + monto_vt + "', cant_vt='"
        + cant_vt + "', fh_vt= '"
        + fh_vt + "',cod_emp '"
        + cod_emp + "',ced_cli'"
        + ced_cli +  "', WHERE n_factura= '"
        + n_factura ;
    return new DataBase().Actualizar(transaccion);
}   
     public List obtenerDatos(){
    String transaccion = "SELECT * FROM ventas";
    //Llama a metodos listar de DateBase.java
    List<Map> registros = new DataBase().Listar(transaccion);
    List<Map> ventas = new ArrayList(); // Areglos de autores
    
    for(Map registro : registros) {
        Class_ventas aut = new Class_ventas ((int) registro.get("n_factura"),
          (float) registro.get("monto_vt"),
          (float) registro.get("cant_vt"),
          (Date) registro.get("fh_vt"),
          (int) registro.get("cod_emp"),
          (String) registro.get("ced_cli"));
        ventas.add((Map) aut);
    }
    return ventas; // Retorna todos los autores ubicados en la tabla de DB

     }
     
     public int Eliminar(int id){
    String transaccion = "DELETE FROM ventas WHERE n_factura='"+id +"'";
    
    return new DataBase().Actualizar(transaccion);
}

    public int Actualizar(int n_f, String mt, String ctd, String fh) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Class_ventas Insertar(String n, String mt, String cant, String fh) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
