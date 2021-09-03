package com.proyecto.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;
import java.util.Optional;

import com.proyecto.biblioteca.model.Libro;

@Repository
public interface BibliotecaRepository extends JpaRepository<Libro, String>{
    @Query(value = "SELECT o FROM Alumno o WHERE o.id=?1")
    Optional <Libro> findById(String id);
}
