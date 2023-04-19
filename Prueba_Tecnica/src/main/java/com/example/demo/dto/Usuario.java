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
@Table(name = "usuario")
public class Usuario {

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name="nick")
	private String nick;

	@Column(name="contra")
	private String contra;

	@Column(name="email")
	private String email;

	@Column(name="game_nick")
	private String game_nick;

	@OneToMany
	@JoinColumn(name = "FK_parties_created_by")
	private List<Party> party;

	@OneToMany
	@JoinColumn(name = "FK_Mensajes_sender")
	private List<Mensaje> Mensaje;

	// Constructors
	public Usuario() {
	}

	public Usuario(Long id, String nick, String contra, String email, String game_nick) {
		this.id = id;
		this.nick = nick;
		this.contra = contra;
		this.email = email;
		this.game_nick = game_nick;
	}

	// Getters
	public Long getId() {
		return id;
	}

	public String getnick() {
		return nick;
	}

	public String getcontra() {
		return contra;
	}

	public String getEmail() {
		return email;
	}

	public String getgame_nick() {
		return game_nick;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Party")
	public List<Party> getParty() {
		return party;
	}
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Mensaje")
	public List<Mensaje> getMensaje() {
		return Mensaje;
	}

	// Setters
	public void setId(Long id) {
		this.id = id;
	}

	public void setnick(String nick) {
		this.nick = nick;
	}

	public void setcontra(String contra) {
		this.contra = contra;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setgame_nick(String game_nick) {
		this.game_nick = game_nick;
	}

	public void setParty(List<Party> party) {
		this.party = party;
	}
	public void setMensaje(List<Mensaje> mensaje) {
		this.Mensaje = mensaje;
	}

}