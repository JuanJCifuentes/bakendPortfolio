/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jc.service;

import com.portfolio.jc.entity.Proyecto;
import com.portfolio.jc.repository.RProyecto;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SProyecto {
    
    
    @Autowired
    public RProyecto proyectoRepo;
    
    public List<Proyecto> verProyectos() {
        List<Proyecto> listaProyectos= proyectoRepo.findAll();
        return listaProyectos;
    }
    
    public void crearProyecto(Proyecto Proyecto) {
        proyectoRepo.save(Proyecto);
    }
    
    public void borrarProyecto(int id) {
        proyectoRepo.deleteById(id);
    }
    
    public Proyecto buscarProyecto(int id) {
        Proyecto Proyecto = proyectoRepo.findById(id).orElse(null);
        return Proyecto;
    }
    
    public void editarProyecto(Proyecto Proyecto) {
        proyectoRepo.save(Proyecto);
    }
}