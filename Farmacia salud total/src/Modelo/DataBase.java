
package Modelo;

import java.sql.*;
import java.util.*;

/** @author diedr*/


public class DataBase {
    
private final String URL="jdbc:sqlserver://localhost:1433;databaseName=DB_farmacia_salud_total;"+
            "integratedSecurity=true;"+"encrypt=true;trustServerCertificate=true;";
 
private Connection conexion; //Para conexión con la BD
    
    public DataBase(){
        try{
            conexion = DriverManager.getConnection(URL);
            System.out.println("Conexion establecida");
       
        }catch(SQLException e){
            System.out.println("Error de conexion");
            e.printStackTrace();
        }
    }
    public int Actualizar(String consulta){
        try{
            Statement st= conexion.createStatement();
            return st.executeUpdate(consulta);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return 0;
   
    }
    
    private List OrganizarDatos(ResultSet rs){
        List filas=new ArrayList(); //Areglo de elementos
        try{
            
            int numColumnas=rs.getMetaData().getColumnCount();
            while(rs.next()){ //Recorre cada registro de tabla
                Map<String, Object> renglon=new HashMap();
               for(int i=1; i<=numColumnas; i++) {
                  //Se obtiene nombre de campo de la base BD 
                  String nombrecampo=rs.getMetaData().getColumnName(i);
                  Object valor=rs.getObject(nombrecampo);
                  // Por cada campo , se obtiene el nombre y el valor del mismo
                  renglon.put(nombrecampo,valor);
               }
               filas.add(renglon);//Se agrega el arreglo de cada registro
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return filas;
    }
     public List Listar(String consulta){
         ResultSet rs=null;
         List resultado=new ArrayList();
         try{
             Statement st=conexion.createStatement();
             rs=st.executeQuery(consulta);
             resultado=OrganizarDatos(rs);
         }catch(SQLException e){
             System.out.println("No se realizo la consulta");
             e.printStackTrace();
         }
         return resultado;
     }
     
     public boolean ejecutarProcedimiento(String nombre){
         try{
             CallableStatement  cs=conexion.prepareCall("{call"+nombre+"}");
             return cs.execute();
         }catch(SQLException e){
             e.printStackTrace();
         }
         return false;
     }
     public void cerrarConexion(){
         try{
             conexion.close();
         }catch(SQLException e){
             e.printStackTrace();
         }
     }
}
   
