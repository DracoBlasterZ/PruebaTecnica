package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Party;

public interface PartyDAO extends JpaRepository<Party, Long> {

	public List<Party> findPartiesByGameId(Long gameId);

}