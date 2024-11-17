package com.adminencuesta360.application.service;

import com.adminencuesta360.application.facade.UsuarioFacade;

public class UsuarioService {

    private final UsuarioFacade usuarioFacade;

    public UsuarioService(UsuarioFacade usuarioFacade) {
        this.usuarioFacade = usuarioFacade;
    }
}
