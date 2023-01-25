package com.example.backendjuego.security.entity;

import com.example.backendjuego.security.enums.RolNombre;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import javax.persistence.*;

import javax.persistence.GenerationType;

@Entity
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private int id;
    @NotNull
    @Enumerated(EnumType.STRING)
    @Getter
    @Setter
    private RolNombre rolNombre;

    public Rol() {
    }

    public Rol(@NotNull RolNombre rolNombre) {
        this.rolNombre = rolNombre;
    }
}
