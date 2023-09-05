package com.example.concesionarioautosbackend.modelos;


import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "tbl_autos")
public class AutoEntidad {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_auto;
    @Id
    private String placa;
    private String anio;
    public AutoEntidad(){

    }
}
