package com.adminencuesta360.application.facade;

import com.adminencuesta360.application.data.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UsuarioFacade {
    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioFacade(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
}
