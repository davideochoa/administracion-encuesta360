package com.adminencuesta360.application.data.repository;

import com.adminencuesta360.application.data.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Integer>, JpaSpecificationExecutor<UsuarioEntity> {

    UsuarioEntity findByNombreUsuario(String nombreUsuario);

    Optional<UsuarioEntity> findByNombreUsuarioAndPassword(String nombreUsuario, String password);

}
