package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "videojuegos")
public class Videojuego {

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name="titulo")
	private String titulo;

	@Column(name="descripcion")
	private String descripcion;

	@Column(name="tiempo")
	private int tiempo;

	@OneToMany
	@JoinColumn(name = "FK_parties_videojuego")
	private List<Party> party;

	// Constructors
	public Videojuego() {
	}

	public Videojuego(Long id, String titulo, String descripcion, int tiempo) {
		this.id = id;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.tiempo = tiempo;
	}

	// Getters
	public Long getId() {
		return id;
	}

	public String gettitulo() {
		return titulo;
	}

	public String getdescripcion() {
		return descripcion;
	}

	public int gettiempo() {
		return tiempo;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Party")
	public List<Party> getParty() {
		return party;
	}

	// Setters
	public void setId(Long id) {
		this.id = id;
	}

	public void settitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setdescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void settiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public void setParty(List<Party> party) {
		this.party = party;
	}

}