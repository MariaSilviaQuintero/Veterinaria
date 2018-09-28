
package veterinaria;

/**
 *
 * @author ML && MP
 */
public class main {

  
    public static void main(String[] args) {
        
        Conexion conexion;
 
        try {
            conexion = new Conexion("jdbc:mysql://localhost/veterinaria", "root", "");
            ClienteData clienteData = new ClienteData (conexion);
            
            
         //  Cliente cliente1 = new Cliente (39799437, "Mauricio Pizarro", "Constitucion 1079, San Luis",4420273,"Julio Pizarro");
         // Cliente cliente2 = new Cliente (39082182,"Marcos Reyes", "Las Heras 1450 San Luis",446998,"Heraldo Reyes");
           
            
         //  clienteData.borrarCliente(6); // funciona el borrarCliente
         //  clienteData.guardarCliente(cliente2); // funciona el guardarCliente
         //  clienteData.guardarCliente(cliente1);

            clienteData.obtenerClientes().forEach(cliente -> {
                System.out.println("Nombre: " + cliente.getNombreApellido());
                System.out.println("DNI: " + cliente.getDni());
                
            });
            
            
        } catch (ClassNotFoundException e) {
            System.out.println("Error al instanciar la clase conexion: " + e.getMessage());
        }
    }
        
}

    

