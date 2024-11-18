package com.adminencuesta360.application.service;

import com.adminencuesta360.application.data.DTO.UsuarioDTO;
import com.adminencuesta360.application.data.entity.UsuarioEntity;
import com.adminencuesta360.application.facade.UsuarioFacade;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {

    private final UsuarioFacade usuarioFacade;

    public UsuarioService(UsuarioFacade usuarioFacade) {
        this.usuarioFacade = usuarioFacade;
    }

    UsuarioEntity findByNombreUsuario(String username){
        return usuarioFacade.findByNombreUsuario(username);
    }

    public Optional<UsuarioDTO> findByNombreUsuarioAndPassword(String nombreUsuario, String password) {
        return usuarioFacade.findByNombreUsuarioAndPassword(nombreUsuario, password)
                .map(usuario -> new UsuarioDTO(
                        usuario.getId(),
                        usuario.getNombrePropio(),
                        usuario.getCorreo(),
                        usuario.getNombreUsuario(),
                        usuario.getEsAdministrador(),
                        usuario.getEsReseteadoPassword()
                ));
    }
}
