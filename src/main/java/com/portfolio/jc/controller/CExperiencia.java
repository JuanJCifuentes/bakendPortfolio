/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jc.controller;


import com.portfolio.jc.entity.Experiencia;
import com.portfolio.jc.service.SExperiencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("experiencia")
@CrossOrigin(origins = "https://miportfolio-jc.web.app")
public class CExperiencia {
    
    
    @Autowired
    SExperiencia ExperienciaServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List<Experiencia> verExperiencias() {
        return ExperienciaServ.verExperiencias();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody   
    public Experiencia verExperiencia(@PathVariable int id) {
        return ExperienciaServ.buscarExperiencia(id);
    }
    
    @PostMapping("/crear")
    public String agregarExperiencia (@RequestBody Experiencia estu) {
        ExperienciaServ.crearExperiencia(estu);
        return "La Experiencia fue creada correctamente";
        
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String eliminarExperiencia(@PathVariable int id){
        ExperienciaServ.borrarExperiencia(id);
        return "La Experiencia fue borrada correctamente";
    }

    @PutMapping("/editar")
    public String updateExperiencia(@RequestBody Experiencia estu) {
        ExperienciaServ.editarExperiencia(estu);
        return "La Experiencia fue editada correctamente";
    }
    
       
}
