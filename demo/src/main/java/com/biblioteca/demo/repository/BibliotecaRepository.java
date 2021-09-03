package com.biblioteca.demo.repository;

import com.biblioteca.demo.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface BibliotecaRepository extends JpaRepository<Libro, String>{
    @Query(value = "SELECT o FROM Libro o WHERE o.id=?1")
    Optional <Libro> findById(String id);
}