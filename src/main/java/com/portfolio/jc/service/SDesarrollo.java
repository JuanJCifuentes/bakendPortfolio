/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jc.service;

import com.portfolio.jc.entity.Desarrollo;
import com.portfolio.jc.repository.RDesarrollo;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SDesarrollo {
    
    @Autowired
    public RDesarrollo desarrolloRepo;
    
    public List<Desarrollo> verDesarrollos() {
        List<Desarrollo> listaDesarrollos= desarrolloRepo.findAll();
        return listaDesarrollos;
    }
    
    public void crearDesarrollo(Desarrollo Desarrollo) {
        desarrolloRepo.save(Desarrollo);
    }
    
    public void borrarDesarrollo(int id) {
        desarrolloRepo.deleteById(id);
    }
    
    public Desarrollo buscarDesarrollo(int id) {
        Desarrollo Desarrollo = desarrolloRepo.findById(id).orElse(null);
        return Desarrollo;
    }
    
    public void editarDesarrollo(Desarrollo Desarrollo) {
        desarrolloRepo.save(Desarrollo);
    }
    
}
