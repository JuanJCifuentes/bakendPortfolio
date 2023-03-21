/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jc.service;

import com.portfolio.jc.entity.Persona;
import com.portfolio.jc.repository.RPersona;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class SPersona {
    
    @Autowired
    public RPersona persoRepo;
    
    public List<Persona> verPersonas() {
        List<Persona> listaPersonas= persoRepo.findAll();
        return listaPersonas;
    }
    
    public void crearPersona(Persona perso) {
        persoRepo.save(perso);
    }
    
    public void borrarPersona(int id) {
        persoRepo.deleteById(id);
    }
    
    public Persona buscarPersona(int id) {
        Persona perso = persoRepo.findById(id).orElse(null);
        return perso;
    }
    
    public void editarPersona(Persona perso) {
        persoRepo.save(perso);
    }
    
    public Persona loginPersona(String email, String password){
         List<Persona> perso = persoRepo.findByEmailAndPassword(email, password);
         if(!perso.isEmpty()){
             return perso.get(0);
         }
         return null;
     }
}
