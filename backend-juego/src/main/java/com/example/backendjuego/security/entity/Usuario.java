package com.example.backendjuego.security.entity;


import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import javax.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private int id;
    @NotNull
    @Getter
    @Setter
    private String nombre;
    @NotNull
    @Column(unique = true)
    @Getter
    @Setter
    private String nombreUsuario;
    @NotNull
    @Getter
    @Setter
    private String email;
    @NotNull
    @Getter
    @Setter
    private String password;
    @NotNull
    @Getter
    @Setter
    @ManyToMany
    @JoinTable(name = "usuario_rol", joinColumns = @JoinColumn(name = "usuario_id"),
    inverseJoinColumns = @JoinColumn(name = "rol_id"))
    private Set<Rol> roles = new HashSet<>();

    public Usuario() {
    }

    public Usuario( @NotNull String nombre, @NotNull String nombreUsuario, @NotNull String email, @NotNull String password) {
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.password = password;
    }
}
