package com.ksoft.estudos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ksoft.estudos.models.Usuario;

public interface UsuariosRepository extends JpaRepository<Usuario, Long>{

}
