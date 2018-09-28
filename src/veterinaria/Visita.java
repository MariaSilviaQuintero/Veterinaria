
package veterinaria;

import java.time.LocalDate;

/**
 *
 * @author ML && MP
 */
public class Visita {
    private int id;
    private Mascota mascota;
    private Tratamiento tratamiento;
    private LocalDate fecha;
    private String detalles;
    private double pesoVisita;
    private int importe;
    private String tipo;

    public Visita(Mascota mascota, Tratamiento tratamiento, LocalDate fecha, String detalles, double pesoVisita, int importe, String tipo) {
        
        this.mascota = mascota;
        this.tratamiento = tratamiento;
        this.fecha = fecha;
        this.detalles = detalles;
        this.pesoVisita = pesoVisita;
        this.importe = importe;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public double getPesoVisita() {
        return pesoVisita;
    }

    public void setPesoVisita(double pesoVisita) {
        this.pesoVisita = pesoVisita;
    }

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
