CREATE DATABASE event_manager;
USE event_manager;

CREATE TABLE event
(
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(60) NOT NULL,
    date CHAR(10) NOT NULL,
    startTime CHAR(10) NOT NULL,
    endTime CHAR(10) NOT NULL,
    place VARCHAR(60) NOT NULL,
    quote VARCHAR(120) NOT NULL
);

-- First record
INSERT INTO event(name, date, startTime, endTime, place, quote)
VALUES('Calculus class', '21/08/2020', '8:00 PM', '10:00 PM', 'Google Meet', 'The class is about derivatives');

SELECT * FROM event;