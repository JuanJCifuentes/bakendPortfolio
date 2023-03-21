/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jc.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String sector;
    
    private String institucion;
    
    private String primerDia;
    
    private String ultimoDia;
    
    @Column(length = 2000)
    private String descripcion;

    public Experiencia() {
    }

    public Experiencia(String sector, String institucion, String primerDia, String ultimoDia, String descripcion) {
        this.sector = sector;
        this.institucion = institucion;
        this.primerDia = primerDia;
        this.ultimoDia = ultimoDia;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getPrimerDia() {
        return primerDia;
    }

    public void setPrimerDia(String primerDia) {
        this.primerDia = primerDia;
    }

    public String getUltimoDia() {
        return ultimoDia;
    }

    public void setUltimoDia(String ultimoDia) {
        this.ultimoDia = ultimoDia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}

