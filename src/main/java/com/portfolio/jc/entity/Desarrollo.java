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
public class Desarrollo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String sector;
    
    private String lenguaje;
    
    private String diaAprendido;

    public Desarrollo() {
    }

    public Desarrollo(String sector, String lenguaje, String diaAprendido) {
        this.sector = sector;
        this.lenguaje = lenguaje;
        this.diaAprendido = diaAprendido;
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

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public String getDiaAprendido() {
        return diaAprendido;
    }

    public void setDiaAprendido(String diaAprendido) {
        this.diaAprendido = diaAprendido;
    }
    
    
}
