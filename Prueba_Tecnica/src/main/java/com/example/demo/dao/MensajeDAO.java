package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Mensaje;

public interface MensajeDAO extends JpaRepository<Mensaje, Long> {

	public List<Mensaje> findMessagesByPartyId(Long partyId);

}