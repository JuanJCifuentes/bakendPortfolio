/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jc.controller;

import com.portfolio.jc.entity.Desarrollo;
import com.portfolio.jc.service.SDesarrollo;
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
@RequestMapping("desarrollo")
@CrossOrigin(origins = "http://localhost:4200")
public class CDesarrollo {
    
    @Autowired
    SDesarrollo desarrolloServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List<Desarrollo> verDesarrollos() {
        return desarrolloServ.verDesarrollos();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Desarrollo verDesarrollo(@PathVariable int id) {
        return desarrolloServ.buscarDesarrollo(id);
    }
    
    @PostMapping("/crear")
    public String agregarDesarrollo (@RequestBody Desarrollo habi) {
        desarrolloServ.crearDesarrollo(habi);
        return "El Desarrollo fue creado correctamente";
        
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String eliminarDesarrollo(@PathVariable int id){
        desarrolloServ.borrarDesarrollo(id);
        return "El Desarrollo fue borrado correctamente";
    }

    @PutMapping("/editar")
    public String updateDesarrollo(@RequestBody Desarrollo habi) {
        desarrolloServ.editarDesarrollo(habi);
        return "El Desarrollo fue editado correctamente";
    }
    
       
}
