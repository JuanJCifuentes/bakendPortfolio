/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jc.service;

import com.portfolio.jc.entity.Habilidad;
import com.portfolio.jc.repository.RHabilidad;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SHabilidad {
    
    @Autowired
    public RHabilidad habilidadRepo;
    
    public List<Habilidad> verHabilidades() {
        List<Habilidad> listaHabilidads= habilidadRepo.findAll();
        return listaHabilidads;
    }
    
    public void crearHabilidad(Habilidad Habilidad) {
        habilidadRepo.save(Habilidad);
    }
    
    public void borrarHabilidad(int id) {
        habilidadRepo.deleteById(id);
    }
    
    public Habilidad buscarHabilidad(int id) {
        Habilidad Habilidad = habilidadRepo.findById(id).orElse(null);
        return Habilidad;
    }
    
    public void editarHabilidad(Habilidad Habilidad) {
        habilidadRepo.save(Habilidad);
    }
}
