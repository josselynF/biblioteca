package com.proyecto.biblioteca.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;

import com.proyecto.biblioteca.model.Libro;
import com.proyecto.biblioteca.repository.BibliotecaRepository;

@Controller
@RequestMapping("/libro")
public class LibroController {

    
    @PostMapping("/registrar")
    public ResponseEntity<String> registrarLibro(@RequestBody Libro request){

        return new ResponseEntity<String>(request.getId(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Libro> findById(@PathVariable String id){
        return new ResponseEntity<Libro>(HttpStatus.NOT_FOUND);
    }

}
