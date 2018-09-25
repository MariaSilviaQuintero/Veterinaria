/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

import java.time.LocalDate;

/**
 *
 * @author ML
 */
public class Visita {
    private int id;
    private LocalDate fecha;
    private String detalles;
    private double pesoVisita;
    private int importe;
    private String tipo;

    public Visita(int id, LocalDate fecha, String detalles, double pesoVisita, int importe, String tipo) {
        this.id = id;
        this.fecha = fecha;
        this.detalles = detalles;
        this.pesoVisita = pesoVisita;
        this.importe = importe;
        this.tipo = tipo;
    }

    public Visita() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
