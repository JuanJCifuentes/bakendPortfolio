/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jc.service;

import com.portfolio.jc.entity.Estudio;
import com.portfolio.jc.repository.REstudio;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SEstudio {
    
    
    @Autowired
    public REstudio estudioRepo;
    
    public List<Estudio> verEstudios() {
        List<Estudio> listaEstudios= estudioRepo.findAll();
        return listaEstudios;
    }
    
    public void crearEstudio(Estudio estudio) {
        estudioRepo.save(estudio);
    }
    
    public void borrarEstudio(int id) {
        estudioRepo.deleteById(id);
    }
    
    public Estudio buscarEstudio(int id) {
        Estudio estudio = estudioRepo.findById(id).orElse(null);
        return estudio;
    }
    
    public void editarEstudio(Estudio estudio) {
        estudioRepo.save(estudio);
    }
}
