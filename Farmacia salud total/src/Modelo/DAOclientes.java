
package Modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;



/** @author diedr */


public class DAOclientes {
    public Class_clientes Insertar(String ced_cli, String nbr_1_cli, String nbr_2_cli,
        String apelli_1_cli, String apelli_2_cli , String direc_cli, String telf_cli){
String transaccion = "INSERT INTO clientes VALUES('"
        + ced_cli + "','"
        + nbr_1_cli + "','"
        + nbr_2_cli + "', '"
        + apelli_1_cli + "','"  
        + apelli_2_cli + "','" 
        + direc_cli + "','" 
        + telf_cli +  "')"; 

if (new DataBase().Actualizar(transaccion) > 0){
    return new Class_clientes (ced_cli, nbr_1_cli, nbr_2_cli, apelli_1_cli, apelli_2_cli,
    direc_cli, telf_cli);
}
return null;
}

public int Actualizar(String ced_cli,String nbr_1_cli, String nbr_2_cli,String apelli_1_cli, String apelli_2_cli,String direc_cli, String telf_cli){
   
    String transaccion = "UPDATE clientes SET nbr_1_cli='"
        + nbr_1_cli + "', nbr_2_cli='"
        + nbr_2_cli + "', apelli_1_cli='"
        + apelli_1_cli + "', apelli_2_cli='"
        + apelli_2_cli + "', direc_cli='" 
        + direc_cli +   "', telf_cli='" 
        + telf_cli + "' WHERE ced_cli="   
        + "'"+ced_cli+"'";
    return new DataBase().Actualizar(transaccion);
}
      
public List obtenerDatos(){
    String transaccion = "SELECT * FROM clientes";
    List<Map> registros = new DataBase().Listar(transaccion);
    List<Class_clientes> clientes = new ArrayList(); 
    
    for(Map registro : registros) {
        Class_clientes aut = new Class_clientes ((String) registro.get("ced_cli"),
          (String) registro.get("nbr_1_cli"),
          (String) registro.get("nbr_2_cli"),
          (String) registro.get("apelli_1_cli"),
          (String) registro.get("apelli_2_cli"),
          (String) registro.get("direc_cli"),
          (String) registro.get("telf_cli"));
        clientes.add(aut);
}
return clientes;

}
public int Eliminar(int ced){
    String transaccion = "DELETE FROM clientes WHERE ced_cli='"+ced +"'";
    
    return new DataBase().Actualizar(transaccion);
}
}

