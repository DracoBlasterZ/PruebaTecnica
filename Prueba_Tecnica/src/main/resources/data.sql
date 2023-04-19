DROP TABLE IF EXISTS mensaje;
DROP TABLE IF EXISTS party;
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS videojuegos;

CREATE TABLE videojuegos(
	id INT NOT NULL AUTO_INCREMENT,
	titulo VARCHAR(100) DEFAULT NULL,
	descripcion VARCHAR(255) DEFAULT NULL,
	tiempo INT DEFAULT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE users(
	id INT NOT NULL AUTO_INCREMENT,
	nick VARCHAR(30) NOT NULL,
	contra VARCHAR(30) NOT NULL,
	email VARCHAR(255) NOT NULL,
	game_nick VARCHAR(50) DEFAULT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE party(
	id INT NOT NULL AUTO_INCREMENT,
	titulo VARCHAR(100) NOT NULL,
	descripcion VARCHAR(255) DEFAULT NULL,
	id_juego INT NOT NULL,
	id_creador INT NOT NULL,
	PRIMARY KEY (id),
	CONSTRAINT FK_party_id_juego FOREIGN KEY (id_juego) REFERENCES videojuegos(id) ON UPDATE CASCADE ON DELETE CASCADE,
	CONSTRAINT FK_party_id_creador FOREIGN KEY (id_creador) REFERENCES users(id) ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE mensaje(
	id INT NOT NULL AUTO_INCREMENT,
	texto VARCHAR(300) NOT NULL,
	fecha DATETIME DEFAULT CURRENT_TIMESTAMP,
	usuario1 INT NOT NULL,
	party INT NOT NULL,
	PRIMARY KEY (id),
	CONSTRAINT FK_mensaje_usuario1 FOREIGN KEY (usuario1) REFERENCES users(id) ON UPDATE CASCADE ON DELETE CASCADE,
	CONSTRAINT FK_mensaje_party FOREIGN KEY (party) REFERENCES party(id) ON UPDATE CASCADE ON DELETE CASCADE
);

INSERT INTO videojuegos(titulo, descripcion, tiempo) VALUES ('Dead By Daylight', 'Horror Survival game where your objective is to escape the killers grasp...', 100);
INSERT INTO videojuegos(titulo, descripcion, tiempo) VALUES ('Deep Rock Galactic', 'A game where you work and mine with your fellow dwarves', 30);
INSERT INTO videojuegos(titulo, descripcion, tiempo) VALUES ('Darkest Dungeon II', 'Lovecraftian horror on and RPG with the dark...', 150);
INSERT INTO videojuegos(titulo, descripcion, tiempo) VALUES ('Dead Cell', 'Roguelike randomly generated action RPG on side view', 400);
INSERT INTO videojuegos(titulo, descripcion, tiempo) VALUES ('The Witcher 3', 'Follow Geralt of rivia, a witcher from the school of...', 100);
INSERT INTO videojuegos(titulo, descripcion, tiempo) VALUES ('League of Legends', 'MOBA, one of the most custom universes you had seen', 6000);
INSERT INTO videojuegos(titulo, descripcion, tiempo) VALUES ('Phasmophobia', 'Horror Survival game where youre tasked to identify ghosts in haunted locations', 5);
INSERT INTO videojuegos(titulo, descripcion, tiempo) VALUES ('Yakuza Like a Dragon', 'Action RPG. Become Kiryu Kazuma, an up-and-coming yakuza who...', 30);
INSERT INTO videojuegos(titulo, descripcion, tiempo) VALUES ('The Sims 3', 'A Virtual simulation of life itself', 50);
INSERT INTO videojuegos(titulo, descripcion, tiempo) VALUES ('PlantsvsZombies 2', 'Massive FPS with epic battles with plants', 1200);

INSERT INTO users(nick, contra, email, game_nick) VALUES ('codemonkey', 'i<u3coding123', 'codingjunkie@gmail.com', 'codejunkie');
INSERT INTO users(nick, contra, email, game_nick) VALUES ('lonelyJose', 'apruebamepls', 'meheesforzado@gmail.com', 'Joajns');
INSERT INTO users(nick, contra, email, game_nick) VALUES ('elhuevo', '34sTer3g6', 'easteregg@hotmail.com', 'EasterHuevosRules');
INSERT INTO users(nick, contra, email, game_nick) VALUES ('nosoyPetter', 'Kemado122', 'sincreatividad@gmail.com', 'Potterputer');
INSERT INTO users(nick, contra, email, game_nick) VALUES ('NeitherMyEmail', 'WoreTable23', 'uninstall@gmail.com', 'TrashCode ');
INSERT INTO users(nick, contra, email, game_nick) VALUES ('petter1', 'i<3coding123', 'petter1@gmail.com', 'pete');
INSERT INTO users(nick, contra, email, game_nick) VALUES ('petter2', 'i<3coding123', 'petter2@gmail.com', 'cabumb');
INSERT INTO users(nick, contra, email, game_nick) VALUES ('petter3', 'i<3coding123', 'codingjunkie@gmail.com', 'nopettas');
INSERT INTO users(nick, contra, email, game_nick) VALUES ('petter4', 'i<3coding123', 'codingjunkie@gmail.com', 'petta3');
INSERT INTO users(nick, contra, email, game_nick) VALUES ('NoPuedoMas', 'SeraDivertido', 'DeVerdad@yahoo.com', 'LFGAPP');

INSERT INTO party(titulo, descripcion, game, created_by) VALUES ('We Goin to School+1', 'Dejad de robarme', 1, 5);
INSERT INTO party(titulo, descripcion, game, created_by) VALUES ('Maincra', 'Era bait es lol', 5, 4);
INSERT INTO party(titulo, descripcion, game, created_by) VALUES ('Fortunite', 'No talk just plays', 3, 9);

INSERT INTO mensaje(texto, usuario1, party) VALUES ('Quien me ha quitado la key!', 5, 1);
INSERT INTO mensaje(texto, usuario1, party) VALUES ('Jeje', 5, 1);
INSERT INTO mensaje(texto, usuario1, party) VALUES ('Juro que te lo devolvere', 5, 1);
INSERT INTO mensaje(texto, usuario1, party) VALUES ('Si, si....', 1, 1);
INSERT INTO mensaje(texto, usuario1, party) VALUES ('Ya me debes 10 juegos!', 1, 1);

INSERT INTO mensaje(texto, usuario1, party) VALUES ('Como puedo conseguir diamantes?', 1, 2);
INSERT INTO mensaje(texto, usuario1, party) VALUES ('Esto es para lol', 5, 2);
INSERT INTO mensaje(texto, usuario1, party) VALUES ('No era para el rol ?', 6, 2);
INSERT INTO mensaje(texto, usuario1, party) VALUES ('Quien ha feedeado a Mundo?!', 3, 2);
INSERT INTO mensaje(texto, usuario1, party) VALUES ('Chicas solteras en tu zona', 7, 2);
INSERT INTO mensaje(texto, usuario1, party) VALUES ('Tienes que mover el camion con fuerza, a espera que era el lol, mid of feed', 6, 2);

INSERT INTO mensaje(texto, usuario1, party) VALUES ('Alguien me lee?', 4, 3);
INSERT INTO mensaje(texto, usuario1, party) VALUES ('Vas a ser baneado.', 8, 3);