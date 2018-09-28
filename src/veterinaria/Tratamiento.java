
package veterinaria;

/**
 *
 * @author ML && MP
 */
public class Tratamiento {
    private int id;
    private String nombre;
    private String descripcion;
    private int importe;
    private int estado;

    public Tratamiento(String nombre, String descripcion, int importe, int estado) {
        
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.importe = importe;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }

    public int isEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
   }
