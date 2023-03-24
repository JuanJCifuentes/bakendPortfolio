/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jc.controller;

import com.portfolio.jc.entity.Estudio;
import com.portfolio.jc.service.SEstudio;
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
@RequestMapping("estudio")
@CrossOrigin(origins = "https://miportfolio-jc.web.app")
public class CEstudio {
    
    
    @Autowired
    SEstudio estudioServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List<Estudio> verEstudios() {
        return estudioServ.verEstudios();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody   
    public Estudio verEstudio(@PathVariable int id) {
        return estudioServ.buscarEstudio(id);
    }
    
    @PostMapping("/crear")
    public String agregarEstudio (@RequestBody Estudio estu) {
        estudioServ.crearEstudio(estu);
        return "El Estudio fue creado correctamente";
        
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String eliminarEstudio(@PathVariable int id){
        estudioServ.borrarEstudio(id);
        return "El Estudio fue borrado correctamente";
    }

    @PutMapping("/editar")
    public String updateEstudio(@RequestBody Estudio estu) {
        estudioServ.editarEstudio(estu);
        return "El Estudio fue editado correctamente";
    }
    
       
}
