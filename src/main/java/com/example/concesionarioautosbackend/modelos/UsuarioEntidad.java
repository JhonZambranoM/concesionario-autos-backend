package com.example.concesionarioautosbackend.modelos;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tbl_usuarios")
public class UsuarioEntidad {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;
    @Id
    private String identificacion;
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    private String edad;
    private String ciudad_residencia;
    private String correo;

    public UsuarioEntidad(){

    }

}
