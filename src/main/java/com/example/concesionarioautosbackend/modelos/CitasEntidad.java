package com.example.concesionarioautosbackend.modelos;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "tbl_citas")
public class CitasEntidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcitas;
    private String fecha_estimada;
    private String hora_estimada;
    private String descripcion;
    private String correo;
    public CitasEntidad(){

    }

}
