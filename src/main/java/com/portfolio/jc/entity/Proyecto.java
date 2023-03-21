/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String nombreProyecto;
    
    private String diaRealizado;
    
    private String imagenProyecto;
    
    private String urlLive;
    
    private String urlGithub;

    public Proyecto() {
    }

    public Proyecto(String nombreProyecto, String diaRealizado, String imagenProyecto, String urlLive, String urlGithub) {
        this.nombreProyecto = nombreProyecto;
        this.diaRealizado = diaRealizado;
        this.imagenProyecto = imagenProyecto;
        this.urlLive = urlLive;
        this.urlGithub = urlGithub;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getDiaRealizado() {
        return diaRealizado;
    }

    public void setDiaRealizado(String diaRealizado) {
        this.diaRealizado = diaRealizado;
    }

    public String getImagenProyecto() {
        return imagenProyecto;
    }

    public void setImagenProyecto(String imagenProyecto) {
        this.imagenProyecto = imagenProyecto;
    }

    public String getUrlLive() {
        return urlLive;
    }

    public void setUrlLive(String urlLive) {
        this.urlLive = urlLive;
    }

    public String getUrlGithub() {
        return urlGithub;
    }

    public void setUrlGithub(String urlGithub) {
        this.urlGithub = urlGithub;
    }
    
    
}
