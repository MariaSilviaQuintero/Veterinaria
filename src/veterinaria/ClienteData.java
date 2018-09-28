
package veterinaria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ML && MP
 * 
 */

public class ClienteData {
    
    private Connection connection = null;
    
    public ClienteData (Conexion conexion){
        
        try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al obtener la conexion");
        }
    }
    
    
    
    
    public void guardarCliente (Cliente cliente){
            try {
            
                String sql = "INSERT INTO cliente (dni, nombre_apellido, direccion, telefono, responsable_2) VALUES ( ? , ? , ? , ? , ? );";

                    try (PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                        statement.setInt(1, cliente.getDni());
                        statement.setString(2, cliente.getNombreApellido());
                        statement.setString(3, cliente.getDireccion());
                        statement.setInt(4, cliente.getTelefono());
                        statement.setString(5, cliente.getResponsable2());
                        
                        
                        statement.executeUpdate();
                        
                        ResultSet rs = statement.getGeneratedKeys();
                        
                        if (rs.next()) {
                          cliente.setId(rs.getInt(1));
                        } else {
                          System.out.println("No se pudo obtener el id luego de insertar un cliente");
                        }       
                    }
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un cliente: " + ex.getMessage());
        }
    }
    
 
    
    
    

    public List<Cliente> obtenerClientes(){
            
        List<Cliente> cliente = new ArrayList<>();
            
        try {
            String sql = "SELECT * FROM cliente;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            
            Cliente client;
            
            while(resultSet.next()){ // mientras haya datos va creando un cliente a ese cliente le va seteando los datos
                client = new Cliente();
                client.setId(resultSet.getInt("id_cliente"));
                client.setDni(resultSet.getInt("dni"));
                client.setNombreApellido(resultSet.getString("nombre_apellido"));
                client.setDireccion(resultSet.getString("direccion"));
                client.setTelefono(resultSet.getInt("telefono"));
                client.setResponsable2(resultSet.getString("responsable_2"));

                cliente.add(client);
            }      
                statement.close();    
                
        } catch (SQLException ex) {
            System.out.println("Error al obtener los alumnos: " + ex.getMessage());
        }
        return cliente;
    }
        
        
        
    
        
        
        
    public void borrarCliente(int id){
        try {
            
            String sql = "DELETE FROM cliente WHERE id_cliente =?;"; // envia una query donde elimina el cliente con el id que obtumo por parametro

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
           
            
            statement.executeUpdate();
            
            
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al elimiar un cliente: " + ex.getMessage());
        }
        
    
        
        
        
        
        
        
        
    }
    
    
    
    
    
        
    public void actualizarCliente (Cliente cliente){
        
        try {
            
            String sql = "UPDATE cliente SET dni = ?, nombre_apellido = ?, direccion = ?, telefono = ?, responsable_2 = ?, WHERE id = ?;";

                    PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                        statement.setInt(1, cliente.getDni());
                        statement.setString(2, cliente.getNombreApellido());
                        statement.setString(3, cliente.getDireccion());
                        statement.setInt(4, cliente.getTelefono());
                        statement.setString(5, cliente.getResponsable2());
                        statement.setInt(6, cliente.getId());
                        
                        statement.executeUpdate();
                        
                        statement.close();
      
                    
    
        } catch (SQLException ex) {
            System.out.println("Error al actualizar datos de un cliente: " + ex.getMessage());
        }
    }
    
    
    
    
    
    
    
    
    public Cliente buscarCliente(int id){
        
        Cliente cliente=null;
        try {
            
            String sql = "SELECT * FROM cliente WHERE id =?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
           
            
            ResultSet resultSet=statement.executeQuery();
            
            while(resultSet.next()){
                cliente = new Cliente();
                cliente.setId(resultSet.getInt("id_cliente"));
                cliente.setDni(resultSet.getInt("dni"));
                cliente.setNombreApellido(resultSet.getString("nombre_apellido"));
                cliente.setDireccion(resultSet.getString("direccion"));
                cliente.setTelefono(resultSet.getInt("telefono"));
                cliente.setResponsable2(resultSet.getString("responsable_2"));
            }      
            statement.close();

        } catch (SQLException ex) {
            System.out.println("Error al buscar un cliente: " + ex.getMessage());
        }
        
        return cliente;
    }
    
    
    
        
    
 }
