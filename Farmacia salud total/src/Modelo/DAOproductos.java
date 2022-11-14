
package Modelo;

import java.sql.Date;
import java.util.*;

/** @author diedr */


public class DAOproductos {

    
    
    public Class_productos Insertar(int cod_prod, String nbr_prod, float prec_cp, float prec_vt, String existe_prod ,String lab_prod ,String dcrip_prod, java.sql.Date fh_venc){
        
        String transaccion = "INSERT INTO productos VALUES('"
                + cod_prod + "', '"
                + nbr_prod + "', '" 
                + prec_cp +  "', '"
                + prec_vt +  "', '" 
                + existe_prod + "', '"
                + lab_prod + "', '" 
                + dcrip_prod + "', '" 
                + fh_venc +  "')"; 
        if (new DataBase().Actualizar(transaccion) > 0){
            return new Class_productos(cod_prod,nbr_prod,prec_cp, prec_vt,existe_prod, lab_prod,dcrip_prod,fh_venc );
        }
        return null;
    }

    
public int Actualizar(int cod_prod,String nbr_prod, float prec_cp,
        float prec_vt, String existe_prod, String lab_prod ,String dcrip_prod, java.sql.Date fh_venc){
    
    String transaccion = "UPDATE productos SET nbr_prod='"
        + nbr_prod + "', prec_cp='"
        + prec_cp + "', prec_vt='"
        + prec_vt + "', existe_prod='"
        + existe_prod + "', lab_prod='" 
        + lab_prod + "', dcrip_prod='"    
        + dcrip_prod + "', fh_venc='"
        + fh_venc +  "' WHERE cod_prod="
        + cod_prod;
    return new DataBase().Actualizar(transaccion);
}
      
public List obtenerDatos(){
    String transaccion = "SELECT * FROM productos";

    List<Map> registros = new DataBase().Listar(transaccion);
    List<Class_productos> productos = new ArrayList(); 
    
    for(Map registro : registros) {
        Class_productos aut = new Class_productos ((int) registro.get("cod_prod"),
          (String) registro.get("nbr_prod"),
          (float) (double) registro.get("prec_cp"),
          (float) (double) registro.get("prec_vt"),
          (String) registro.get("existe_prod"),
          (String) registro.get("lab_prod"),
          (String) registro.get("dcrip_prod"),
          (java.sql.Date) registro.get("fh_venc"));
        productos.add(aut);
    }           
    return productos; 
}
  
     public int Eliminar(int id){
    String transaccion = "DELETE FROM productos WHERE cod_prod='"+id +"'";
    
    return new DataBase().Actualizar(transaccion);
}    
     
     
}
