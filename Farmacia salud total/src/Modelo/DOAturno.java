
package Modelo;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/** @author diedr */

public class DOAturno {
    public Class_turno Insertar(int tp_de_turno, java.sql.Time h_entrada,java.sql.Time h_salida){
        String transaccion = "INSERT INTO turno VALUES('"
        + tp_de_turno + "','"
        + h_entrada + "','"
        + h_salida+ "')";
                 
    if (new DataBase().Actualizar(transaccion) > 0){
    return new Class_turno (tp_de_turno ,h_entrada ,h_salida );
           
}
return null;
}
     public int Actualizar(int tp_de_turno, java.sql.Time h_entrada, java.sql.Time h_salida ){
    
    String transaccion = "UPDATE turno SET h_entrada='"
        + h_entrada + "', h_salida='"
        + h_salida + "' WHERE tp_de_turno="
        + tp_de_turno;
        
                
    return new DataBase().Actualizar(transaccion);
}   
     public List obtenerDatos(){
    String transaccion = "SELECT * FROM turno";
   
    List<Map> registros = new DataBase().Listar(transaccion);
    List<Class_turno> turno = new ArrayList(); 
    
    for(Map registro : registros) {
        Class_turno aut = new  Class_turno
          ((int) registro.get("tp_de_turno"),
          (java.sql.Time) registro.get("h_entrada"),
          (java.sql.Time) registro.get("h_salida"));  
        turno.add(aut);
    }
    return turno; 

     }
     
     public int Eliminar(int cod){
    String transaccion = "DELETE FROM turno WHERE tp_de_turno='"+cod +"'";
    
    return new DataBase().Actualizar(transaccion);
}

}
