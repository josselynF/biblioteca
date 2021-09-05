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
@Table(name="t-prestamo")
public class Prestamo {
    private Integer id;
    private Integer idArticulos;
    private Integer idUsuario;
    private Date fechaSalidado;
    private Date fechaMaxDevolucion;
    private Date fechaDevolucion;
}
