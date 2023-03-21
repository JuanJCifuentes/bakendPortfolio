/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jc.controller;

import com.portfolio.jc.entity.Habilidad;
import com.portfolio.jc.service.SHabilidad;
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
@RequestMapping("habilidad")
@CrossOrigin(origins = "http://localhost:4200")
public class CHabilidad {
    
    @Autowired
    SHabilidad habilidadServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List<Habilidad> verHabilidades() {
        return habilidadServ.verHabilidades();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Habilidad verHabilidad(@PathVariable int id) {
        return habilidadServ.buscarHabilidad(id);
    }
    
    @PostMapping("/crear")
    public String agregarHabilidad (@RequestBody Habilidad habi) {
        habilidadServ.crearHabilidad(habi);
        return "La Habilidad fue creada correctamente";
        
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String eliminarHabilidad(@PathVariable int id){
        habilidadServ.borrarHabilidad(id);
        return "La Habilidad fue borrada correctamente";
    }

    @PutMapping("/editar")
    public String updateHabilidad(@RequestBody Habilidad habi) {
        habilidadServ.editarHabilidad(habi);
        return "La Habilidad fue editada correctamente";
    }
    
       
}
