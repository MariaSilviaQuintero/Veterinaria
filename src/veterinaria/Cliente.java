/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

/**
 *
 * @author ML
 */
public class Cliente {
    private int id;
    private long dni;
    private String nombreYApellido;
    private String direccion;
    private long telefono;
    private String responsable2;
    
    public Cliente(int id, long dni, String nombreYApellido, String direccion, long telefono, String responsable2) {
        this.id = id;
        this.dni = dni;
        this.nombreYApellido = nombreYApellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.responsable2 = responsable2;
    }

    public Cliente() {
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getNombreYApellido() {
        return nombreYApellido;
    }

    public void setNombreYApellido(String nombreYApellido) {
        this.nombreYApellido = nombreYApellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getResponsable2() {
        return responsable2;
    }

    public void setResponsable2(String responsable2) {
        this.responsable2 = responsable2;
    }
}
