/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BaseDatos {

    public BaseDatos() {

        miConexion = new Conexion();

    }
    //MOSTRAR CLIENTES 
    
    //MODIFICAR CLIENTE 
     public void modificarCliente(Cliente c) {
        Connection conn = null;

        PreparedStatement ps = null;

        try {
            conn = miConexion.dameConexion();

            ps = conn.prepareStatement("UPDATE db_cta.CLIENTE SET NOM_CLIENTE = ? WHERE ID_CLIENTE = ?");

            ps.setString(1, c.getNombreCliente());
            ps.setInt(2, c.getIdCliente());
            
            ps.executeUpdate();
            System.out.println(ps.execute());

        } catch (Exception e) {
          JOptionPane.showMessageDialog(null, "Error al modificar, compruebe que \nno tenga cuentas corrientes por borrar\n+ " + "e");

        } finally {
            try {

                ps.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }

    }
    //ELIMINAR CLIENTE
    public void eliminaCliente(Cliente p) {
        Connection conn = null;

        PreparedStatement ps = null;

        try {
            conn = miConexion.dameConexion();

            ps = conn.prepareStatement("DELETE FROM db_cta.CLIENTE WHERE ID_CLIENTE = ?");

            ps.setInt(1, p.getIdCliente());

            ps.executeUpdate();
            
            System.out.println("Cliente eliminado");

        } catch (Exception e) {
            System.out.println("Error en delete de persona");

        } finally {
            try {

                ps.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }
    }

     public ResultSet getRemito(String id){
        
        Connection conn =null;
        PreparedStatement ps = null;
        ResultSet rs =null;
       
        
        try{
            
            conn = miConexion.dameConexion();
            ps = conn.prepareStatement("SELECT ARCHIVO FROM db_cta.REMITO WHERE NUM_REMITO=?");
            ps.setString(1, id);
            rs = ps.executeQuery();
            
            
            
            
        }catch(Exception e){
            
        }
        return rs;
    }
    
    
    
    public ResultSet dameCtaPorClienteyObra(String cliente , String obra) {

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {

            conn = miConexion.dameConexion();

            ps = conn.prepareStatement("SELECT  NOM_CLIENTE,NOM_OBRA,ES_INSTALADOR_CLIENTE_,NUM_REMITO ,IMPORTE_CIERRE,ARCHIVO FROM db_cta.REMITO INNER JOIN db_cta.CLIENTE ON db_cta.REMITO.ID_CLIENTE = db_cta.CLIENTE.ID_CLIENTE INNER JOIN db_cta.OBRA ON db_cta.REMITO.ID_OBRA=db_cta.OBRA.ID_OBRA WHERE NOM_CLIENTE=? AND NOM_OBRA=?"  );

            ps.setString(1, cliente);
            ps.setString(2, obra);
            rs = ps.executeQuery();

        } catch (Exception e) {

            e.printStackTrace();
        }

        return rs;
    }
    
     public ResultSet dameCtaPorCliente(String cliente) {

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {

            conn = miConexion.dameConexion();

            ps = conn.prepareStatement("SELECT  NOM_CLIENTE,NOM_OBRA,ES_INSTALADOR_CLIENTE_,NUM_REMITO ,IMPORTE_CIERRE,ARCHIVO FROM db_cta.REMITO INNER JOIN db_cta.CLIENTE ON db_cta.REMITO.ID_CLIENTE = db_cta.CLIENTE.ID_CLIENTE INNER JOIN db_cta.OBRA ON db_cta.REMITO.ID_OBRA=db_cta.OBRA.ID_OBRA WHERE NOM_CLIENTE LIKE" + "'"+ cliente + "%'" );

          
           
            rs = ps.executeQuery();

        } catch (Exception e) {

            e.printStackTrace();
        }

        return rs;
    }

     
    public ResultSet dameCtaPorObra(String nombreObra) {

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {

            conn = miConexion.dameConexion();

            ps = conn.prepareStatement("SELECT  NOM_CLIENTE,NOM_OBRA,ES_INSTALADOR_CLIENTE_,NUM_REMITO ,IMPORTE_CIERRE,ARCHIVO FROM db_cta.REMITO INNER JOIN db_cta.CLIENTE ON db_cta.REMITO.ID_CLIENTE = db_cta.CLIENTE.ID_CLIENTE INNER JOIN db_cta.OBRA ON db_cta.REMITO.ID_OBRA=db_cta.OBRA.ID_OBRA WHERE NOM_OBRA LIKE" + "'"+ nombreObra + "%'" );

            
            rs = ps.executeQuery();

        } catch (Exception e) {

            e.printStackTrace();
        }

        return rs;
    }
    
   
    public ResultSet dameCtaPorCliente2(String nombreCliente) {

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {

            conn = miConexion.dameConexion();

            ps = conn.prepareStatement("SELECT  NOM_CLIENTE,NOM_OBRA,ES_INSTALADOR_CLIENTE_,NUM_REMITO ,IMPORTE_CIERRE,ARCHIVO FROM db_cta.REMITO INNER JOIN db_cta.CLIENTE ON db_cta.REMITO.ID_CLIENTE = db_cta.CLIENTE.ID_CLIENTE INNER JOIN db_cta.OBRA ON db_cta.REMITO.ID_OBRA=db_cta.OBRA.ID_OBRA WHERE  NOM_CLIENTE=?");
            ps.setString(1, nombreCliente);
            rs = ps.executeQuery();

        } catch (Exception e) {

            e.printStackTrace();
        }

        return rs;
    }
    
    
    public void insertNuevoCliente(Cliente nuevoCliente){
        
        Connection conn=null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        
        
        try{
            
            conn = miConexion.dameConexion();
            
            ps = conn.prepareStatement("INSERT INTO db_cta.CLIENTE(NOM_CLIENTE,TEL_CLIENTE,EMAIL_CLIENTE,ES_INSTALADOR_CLIENTE_) VALUES(?,?,?,?)");
            
            ps.setString(1, nuevoCliente.getNombreCliente());
            ps.setString(2, nuevoCliente.getTelCliente());
            ps.setString(3, nuevoCliente.getEmail());
            ps.setBoolean(4, nuevoCliente.isEsInstalador());
            
            ps.execute();
            
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    public void insertNuevaObra(Obra nuevaObra){
        
        Connection conn=null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        
        
        try{
            
            conn = miConexion.dameConexion();
            
            ps = conn.prepareStatement("INSERT INTO db_cta.OBRA(NOM_OBRA,ID_CLIENTE) VALUES(?,?)");
            
            ps.setString(1, nuevaObra.getNombreObra());
            ps.setInt(2, nuevaObra.getIdCliente());
          
            
            ps.execute();
            
            System.out.println("INSERT OBRA ERROR");
            
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    public ArrayList selectObra(int criterio){
        
        Connection conn = null;
        ResultSet rs = null;
        Statement st = null;
        PreparedStatement ps = null;
        
         ArrayList<Obra> listaObra = new ArrayList<>();
        
         try{
             
             conn = miConexion.dameConexion();
             
             ps = conn.prepareStatement("SELECT NOM_OBRA FROM db_cta.OBRA WHERE ID_CLIENTE = ?");
             
             ps.setInt(1,criterio);
             
             rs = ps.executeQuery();
             
             while(rs.next()){
                 
                 String nombre = rs.getString("NOM_OBRA");
                 
                 Obra obra = new Obra(nombre);
                 
                 listaObra.add(obra);
                 
             }
             
         }catch(Exception e){}
        
         
         return listaObra;
    }
    
  
    
    public ArrayList selectClientes(){
        
        Connection conn = null;
        ResultSet rs = null;
        Statement st=null;
        
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        
        try{
            
            conn = miConexion.dameConexion();
            
            st = conn.createStatement();
            
            rs = st.executeQuery("SELECT NOM_CLIENTE FROM db_cta.CLIENTE");
            
            while(rs.next()){
                
                String nombre = rs.getString("NOM_CLIENTE");
                
                Cliente cliente = new Cliente(nombre);
                
                listaClientes.add(cliente);
                
                
                
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
       
        return listaClientes;
    }
    
     public void insertRemito(Remito remito){
        
        Connection conn = null;
      
        PreparedStatement ps=null;
        
       
        try{
            
            conn = miConexion.dameConexion();
            
            ps = conn.prepareStatement("INSERT INTO db_cta.REMITO(NUM_REMITO,FECHA_REMITO,ARCHIVO,IMPORTE_CIERRE,ID_OBRA,ID_CLIENTE) VALUES(?,?,?,?,?,?)");
            
            ps.setString(1, remito.getNumRemito());
            ps.setString(2, remito.getFechaRemito());
            ps.setString(3, remito.getRutaPdf());
            ps.setDouble(4, remito.getImporte());
            ps.setInt(5, remito.getIdObra());
            ps.setInt(6, remito.getIdCliente());
            
            
            ps.executeQuery();
            
          
        }catch(Exception e){
            System.out.println("Remito no ingresado"+e);
        }
       
    }
    
     
      public ArrayList selectObra(){
        
        Connection conn = null;
        ResultSet rs = null;
        Statement st=null;
        
        ArrayList<Obra> listaobra = new ArrayList<>();
        
        try{
            
            conn = miConexion.dameConexion();
            
            st = conn.createStatement();
            
            rs = st.executeQuery("SELECT NOM_OBRA FROM db_cta.OBRA");
            
            while(rs.next()){
                  
                String nombre = rs.getString("NOM_OBRA");
                
                Obra obra = new Obra(nombre);
                
                listaobra.add(obra);
            }
            
        
            
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error-->" + e);
        }
        return listaobra;
    }
    
    
    private Conexion miConexion;
}
