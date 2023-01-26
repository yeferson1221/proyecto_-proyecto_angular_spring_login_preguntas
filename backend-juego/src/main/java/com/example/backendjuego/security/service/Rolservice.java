package com.example.backendjuego.security.service;

import com.example.backendjuego.security.entity.Rol;
import com.example.backendjuego.security.enums.RolNombre;
import com.example.backendjuego.security.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class Rolservice {
    @Autowired
    RolRepository rolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return rolRepository.findByRolNombre(rolNombre);
    }
}
