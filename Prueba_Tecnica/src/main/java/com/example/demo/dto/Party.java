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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "party")
public class Party {

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "titulo")
	private String titulo;

	@Column(name = "descripcion")
	private String descripcion;

	@ManyToOne
	@JoinColumn(name = "Videojuego")
	private Videojuego id_juego;

	@ManyToOne
	@JoinColumn(name = "id_creador")
	private Usuario id_creador;

	@OneToMany
	@JoinColumn(name = "FK_Mensajes_party")
	private List<Mensaje> mensaje;

	// Constructors
	public Party() {
	}

	public Party(Long id, String titulo, String descripcion, Videojuego videojuego, Usuario id_creador) {
		this.id = id;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.id_juego = videojuego;
		this.id_creador = id_creador;
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

	public Videojuego getVideojuego() {
		return id_juego;
	}

	public Usuario getid_creador() {
		return id_creador;
	}


	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Mensaje")
	public List<Mensaje> getMensaje() {
		return mensaje;
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

	public void setVideojuego(Videojuego Videojuego) {
		this.id_juego = Videojuego;
	}

	public void setid_creador(Usuario id_creador) {
		this.id_creador = id_creador;
	}

	public void setMensaje(List<Mensaje> Mensaje) {
		this.mensaje = Mensaje;
	}

}