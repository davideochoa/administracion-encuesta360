package com.adminencuesta360.application.data.repository;

import com.adminencuesta360.application.data.DTO.UsuarioDTO;
import com.adminencuesta360.application.data.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Integer>, JpaSpecificationExecutor<UsuarioEntity> {

    UsuarioEntity findByUsername(String username);

    UsuarioEntity save(UsuarioEntity usuario);

    Optional<UsuarioEntity> findById(Integer id);

    List<UsuarioEntity> findAll();

    void deleteById(Integer id);

    void deleteAll();

    boolean existsById(Integer id);

    // Buscar todos los usuarios y mapear al DTO
    @Query("SELECT new com.tu.paquete.dto.UsuarioDTO(u.id, u.nombrePropio, u.correo, u.nombreUsuario, u.esAdministrador, u.esReseteadoPassword) " +
            "FROM UsuarioEntity u")
    List<UsuarioDTO> findAllUsuariosAsDTO();

    // Buscar un usuario por ID y mapear al DTO
    @Query("SELECT new com.tu.paquete.dto.UsuarioDTO(u.id, u.nombrePropio, u.correo, u.nombreUsuario, u.esAdministrador, u.esReseteadoPassword) " +
            "FROM UsuarioEntity u WHERE u.id = :id")
    UsuarioDTO findUsuarioByIdAsDTO(Integer id);

    // Buscar por correo
    UsuarioEntity findByCorreo(String correo);

    // Buscar por nombre de usuario
    UsuarioEntity findByNombreUsuario(String nombreUsuario);

    // Verificar si un usuario es administrador
    @Query("SELECT u.esAdministrador FROM UsuarioEntity u WHERE u.id = :id")
    Boolean isAdmin(Integer id);

}
