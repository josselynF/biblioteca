package com.proyecto.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;
import java.util.Optional;

import com.proyecto.biblioteca.model.Documento;

@Repository
public interface DocumentoRepository extends JpaRepository<Documento, String>{
    @Query(value = "SELECT o FROM Libro o WHERE o.id=?1")
    Optional <Documento> getDocumentofindById(String id);
}
