package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Usuario;

public interface UsuarioDAO extends JpaRepository<Usuario, Long> {

}