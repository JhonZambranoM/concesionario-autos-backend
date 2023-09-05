package com.example.concesionarioautosbackend.modelos;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "tbl_ventas_usuarios")
public class VentasEntidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_ventas;
    private LocalDate fecha_venta;
    private double precio;
}
