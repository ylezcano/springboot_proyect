
package com.example.ejemplo01;

import com.example.ejemplo01.Persona;
import com.example.ejemplo01.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class Controlador {
      
    @Autowired
    PersonaService service;
    @CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
    @RequestMapping({"/personas"})
    
    public List<Persona>listar(){
        return service.listar();
    }
}
