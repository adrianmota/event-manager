CREATE DATABASE proyecto_final_prog1
USE proyecto_final_prog1

CREATE TABLE evento
(
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(60) NOT NULL,
    fecha CHAR(10),
    horaInicio CHAR(10) NOT NULL,
    horaFinal CHAR(10) NOT NULL,
    lugar VARCHAR(60) NOT NULL,
    nota VARCHAR(120) NOT NULL
)

-- Insercion de registro de prueba
INSERT INTO evento(nombre, fecha, horaInicio, horaFinal, lugar, nota) 
VALUES('Clase programacion 1', '21/08/2020', '8:00 PM', '10:00 PM', 'Google Meet', 'La clase tratara sobre polimorfismo')