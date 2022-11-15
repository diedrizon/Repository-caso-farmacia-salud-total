
package Modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** @author diedr */

public class DAOempleado {
    
    public Class_empleado Insertar(int cod_emp, String ced_emp, String nbr_1_emp , String nbr_2_emp, String apelli_1_emp,
            String apelli_2_emp,String direc_emp, String telf_emp, String tp_de_cargo,int tp_de_turno){
        String transaccion = "INSERT INTO empleado VALUES('"
        + cod_emp + "', '"
        + ced_emp + "','"
        + nbr_1_emp + "','"
        + nbr_2_emp + "','"
        + apelli_1_emp + "','"
        + apelli_2_emp + "','"
        + direc_emp + "','"
        + telf_emp + "','"
        + tp_de_cargo + "','"
        + tp_de_turno + "')" ;      
       
        
        
    if (new DataBase().Actualizar(transaccion) > 0){
    return new Class_empleado (cod_emp,ced_emp ,nbr_1_emp ,nbr_2_emp,apelli_1_emp,
            apelli_2_emp ,direc_emp ,telf_emp ,tp_de_cargo,tp_de_turno );
}
return null;
}
     public int Actualizar(int cod_emp,String ced_emp,String nbr_1_emp, 
        String nbr_2_emp, String apelli_1_emp, String apelli_2_emp,
        String direc_emp, String telf_emp, String tp_de_cargo,
       int tp_de_turno ){
    
    String transaccion = "UPDATE empleado SET ced_emp='"
        + ced_emp + "', nbr_1_emp='"
        + nbr_1_emp + "', nbr_2_emp='"
        + nbr_2_emp + "', apelli_1_emp='"
        + apelli_1_emp + "', apelli_2_emp='"
        + apelli_2_emp + "', direc_emp='" 
        + direc_emp + "', telf_emp='"
        + telf_emp + "', tp_de_cargo='" 
        + tp_de_cargo + "', tp_de_turno='"
        + tp_de_turno + "' WHERE cod_emp="
        + cod_emp;
                
    return new DataBase().Actualizar(transaccion);
}   
     public List obtenerDatos(){
    String transaccion = "SELECT * FROM empleado";
   
    List<Map> registros = new DataBase().Listar(transaccion);
    List<Class_empleado> empleado = new ArrayList(); 
    
    for(Map registro : registros) {
       Class_empleado aut = new Class_empleado
               ((int) registro.get("cod_emp"),
               (String) registro.get("ced_emp"),
               (String) registro.get("nbr_1_emp"),
               (String) registro.get("nbr_2_emp"),
               (String) registro.get("apelli_1_emp"), 
               (String) registro.get("apelli_2_emp"),
               (String) registro.get("direc_emp"), 
               (String) registro.get("telf_emp"),
               (String) registro.get("tp_de_cargo"),
               (int) registro.get("tp_de_turno"));
       empleado.add(aut);
         
    }
    return empleado; 

     }
     
     public int Eliminar(int cod){
    String transaccion = "DELETE FROM empleado WHERE cod_emp='"+cod +"'";
    
    return new DataBase().Actualizar(transaccion);
}

    }
    

