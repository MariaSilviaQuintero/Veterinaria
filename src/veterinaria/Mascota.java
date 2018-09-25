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
public class Mascota {
    private int id;
    private String especie;
    private String alias;
    private String sexo;
    private String raza;
    private String colorPelo;
    private LocalDate fecNac;
    private double pesoMedio;
    private double pesoActual;
    
    public Mascota() {
    }

    public Mascota(int id, String especie, String alias, String sexo, String raza, String colorPelo, LocalDate fecNac, double pesoMedio, double pesoActual) {
        this.id = id;
        this.especie = especie;
        this.alias = alias;
        this.sexo = sexo;
        this.raza = raza;
        this.colorPelo = colorPelo;
        this.fecNac = fecNac;
        this.pesoMedio = pesoMedio;
        this.pesoActual = pesoActual;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public void setFecNac(LocalDate fecNac) {
        this.fecNac = fecNac;
    }

    public void setPesoMedio(double pesoMedio) {
        this.pesoMedio = pesoMedio;
    }

    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }

    public int getId() {
        return id;
    }

    public String getEspecie() {
        return especie;
    }

    public String getAlias() {
        return alias;
    }

    public String getSexo() {
        return sexo;
    }

    public String getRaza() {
        return raza;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public LocalDate getFecNac() {
        return fecNac;
    }

    public double getPesoMedio() {
        return pesoMedio;
    }

    public double getPesoActual() {
        return pesoActual;
    }

    }
