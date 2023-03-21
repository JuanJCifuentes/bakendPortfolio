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
public class Estudio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String title;
    
    private String institucion;
    
    private String primerDia;
    
    private String ultimoDia;
    
    @Column(length = 2000)
    private String descripcion;

    public Estudio() {
    }

    public Estudio(String title, String institucion, String primerDia, String ultimoDia, String descripcion) {
        this.title = title;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public void setprimerDia(String primerDia) {
        this.primerDia = primerDia;
    }

    public String getultimoDia() {
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
