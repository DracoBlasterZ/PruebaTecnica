package com.example.demo.dto;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "mensaje")
public class Mensaje {

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "texto")
	private String texto;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha")
	private LocalDateTime fecha;

	@ManyToOne
	@JoinColumn(name = "usuario1")
	private Usuario usuario1;

	@ManyToOne
	@JoinColumn(name = "party")
	private Party party;

	// Constructors
	public Mensaje() {
		this.fecha = LocalDateTime.now();
	}

	public Mensaje(Long id, String texto, Usuario usuario1, Party party) {
		this.id = id;
		this.texto = texto;
		this.fecha = LocalDateTime.now();
		this.usuario1 = usuario1;
		this.party = party;
	}

	// Getters
	public Long getId() {
		return id;
	}

	public String gettexto() {
		return texto;
	}

	public LocalDateTime getfecha() {
		return fecha;
	}

	public Usuario getusuario1() {
		return usuario1;
	}

	public Party getParty() {
		return party;
	}

	// Setters
	public void setId(Long id) {
		this.id = id;
	}

	public void settexto(String texto) {
		this.texto = texto;
	}

	public void setfecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public void setusuario1(Usuario usuario1) {
		this.usuario1 = usuario1;
	}

	public void setParty(Party party) {
		this.party = party;
	}

}
