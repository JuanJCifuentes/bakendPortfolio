/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jc.controller;

import com.portfolio.jc.entity.Proyecto;
import com.portfolio.jc.service.SProyecto;
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
@RequestMapping("proyecto")
@CrossOrigin(origins = "http://localhost:4200")
public class CProyecto {
    
    
    @Autowired
    SProyecto proyectoServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List<Proyecto> verProyectos() {
        return proyectoServ.verProyectos();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody   
    public Proyecto verProyecto(@PathVariable int id) {
        return proyectoServ.buscarProyecto(id);
    }
    
    @PostMapping("/crear")
    public String agregarProyecto (@RequestBody Proyecto estu) {
        proyectoServ.crearProyecto(estu);
        return "El Proyecto fue creado correctamente";
        
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String eliminarProyecto(@PathVariable int id){
        proyectoServ.borrarProyecto(id);
        return "El Proyecto fue borrado correctamente";
    }

    @PutMapping("/editar")
    public String updateProyecto(@RequestBody Proyecto estu) {
        proyectoServ.editarProyecto(estu);
        return "El Proyecto fue editado correctamente";
    }
    
       
}