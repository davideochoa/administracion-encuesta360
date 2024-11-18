package com.adminencuesta360.application.data.request;

import lombok.Data;

@Data
public class LoginRequest {
    private String nombreUsuario;
    private String password;
}
