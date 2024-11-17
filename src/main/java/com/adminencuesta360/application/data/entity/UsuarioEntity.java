package com.adminencuesta360.application.data.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Entity
@Table(name = "catalogo_usuario")
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;

    @Column(name = "nombre_propio")
    private String nombrePropio;

    @Column(name = "correo")
    private String correo;

    @Column(name = "nombre_usuario")
    private String nombreUsuario;

    @Column(name = "password")
    private String password;

    @Column(name = "es_administrador")
    private Boolean esAdministrador;

    @Column(name = "es_reseteado_password")
    private Boolean esReseteadoPassword;

}
