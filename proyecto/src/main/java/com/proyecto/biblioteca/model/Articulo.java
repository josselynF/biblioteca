package com.proyecto.biblioteca.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="t-articulo")
public class Articulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String titulo;
    private Date anioEdicion;
    private String autor;
    private String paisAutor;
    private String editorial;
    private Integer nroPaginas;
    private String resumen;
    private Genero genero; // ingenieria - arquitectura - economia - finanzas ...
    private Tipo tipo;     //libro - tesis pregtado - paper - revista - tesis postgrado ...
}
