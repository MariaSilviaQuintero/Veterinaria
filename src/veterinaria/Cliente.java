/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

/**
 *
 * @author ML && MP
 */
public class Cliente {
    
    private int id_cliente;
    private int dni;
    private String nombreApellido;
    private String direccion;
    private int telefono;
    private String responsable2;
    
    public Cliente(int dni, String nombreApellido, String direccion, int telefono, String responsable2) {
        
        this.dni = dni;
        this.nombreApellido = nombreApellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.responsable2 = responsable2;
    }
    
    public Cliente (){
        
    }
   
    public void setId(int id){
        this.id_cliente = id;
    }
    
    
    public int getId() {
        return id_cliente;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getResponsable2() {
        return responsable2;
    }

    public void setResponsable2(String responsable2) {
        this.responsable2 = responsable2;
    }
}
