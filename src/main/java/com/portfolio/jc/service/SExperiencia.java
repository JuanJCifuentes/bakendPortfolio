/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jc.service;

import com.portfolio.jc.entity.Experiencia;
import com.portfolio.jc.repository.RExperiencia;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExperiencia {
    
    
    @Autowired
    public RExperiencia ExperienciaRepo;
    
    public List<Experiencia> verExperiencias() {
        List<Experiencia> listaExperiencias= ExperienciaRepo.findAll();
        return listaExperiencias;
    }
    
    public void crearExperiencia(Experiencia Experiencia) {
        ExperienciaRepo.save(Experiencia);
    }
    
    public void borrarExperiencia(int id) {
        ExperienciaRepo.deleteById(id);
    }
    
    public Experiencia buscarExperiencia(int id) {
        Experiencia Experiencia = ExperienciaRepo.findById(id).orElse(null);
        return Experiencia;
    }
    
    public void editarExperiencia(Experiencia Experiencia) {
        ExperienciaRepo.save(Experiencia);
    }
}
