package com.adminencuesta360.application.facade;

import com.adminencuesta360.application.data.DTO.UsuarioDTO;
import com.adminencuesta360.application.data.entity.UsuarioEntity;
import com.adminencuesta360.application.data.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UsuarioFacade {
    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioFacade(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public UsuarioEntity findByNombreUsuario(String username){
        return usuarioRepository.findByNombreUsuario(username);
    }

    public Optional<UsuarioEntity> findByNombreUsuarioAndPassword(String nombreUsuario, String password) {
        return usuarioRepository.findByNombreUsuarioAndPassword(nombreUsuario, password);
    }

}
