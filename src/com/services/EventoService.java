package com.services;

import java.sql.*;
import java.util.List;
import com.entidades.Evento;
import java.util.ArrayList;
import com.mysql.db.DatabaseConnection;

public class EventoService {

    private final DatabaseConnection dbConnection;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    public EventoService() {
        dbConnection = new DatabaseConnection();
    }

    //Metodo para agregar los datos del evento a la base de datos
    public void agregarEvento(Evento evento) {
        this.dbConnection.connect();
        String mysql_instruction = "INSERT INTO evento(nombre, fecha, horaInicio, horaFinal, lugar, nota) "
                + "VALUES(?, ?, ?, ?, ?, ?)";
        try {
            this.preparedStatement = this.dbConnection.connection.prepareStatement(mysql_instruction);
            this.preparedStatement.setString(1, evento.getNombre());
            this.preparedStatement.setString(2, evento.getFecha());
            this.preparedStatement.setString(3, evento.getHoraInicio());
            this.preparedStatement.setString(4, evento.getHoraFinal());
            this.preparedStatement.setString(5, evento.getLugar());
            this.preparedStatement.setString(6, evento.getNota());
            this.preparedStatement.executeUpdate();
            System.out.println("Evento agregado");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.dbConnection.disconnect();
        }
    }

    //Metodo para eliminar los datos del evento de la base de datos
    public void eliminarEvento(String idEvento) {
        this.dbConnection.connect();
        String mysql_instruction = "DELETE FROM evento "
                + "WHERE id = " + idEvento;
        try {
            this.preparedStatement = this.dbConnection.connection.prepareStatement(mysql_instruction);
            this.preparedStatement.executeUpdate();
            System.out.println("Evento eliminado");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.dbConnection.disconnect();
        }

    }

    //Metodo para modificar los datos del evento en la base de datos
    public void modificarEvento(Evento evento) {
        this.dbConnection.connect();
        String mysql_instruction = "UPDATE evento SET nombre = '" + evento.getNombre() + "', "
                + "fecha = '" + evento.getFecha() + "', "
                + "horaInicio = '" + evento.getHoraInicio() + "', "
                + "horaFinal = '" + evento.getHoraFinal() + "', "
                + "lugar = '" + evento.getLugar() + "', "
                + "nota = '" + evento.getNota() + "' "
                + "WHERE id = " + evento.getId();
        try {
            this.preparedStatement = this.dbConnection.connection.prepareStatement(mysql_instruction);
            this.preparedStatement.executeUpdate();
            System.out.println("Evento modificado");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.dbConnection.disconnect();
        }
    }

    //Metodo para obtener todos los eventos desde la base de datos
    public List<Evento> obtenerEventos() {
        this.dbConnection.connect();
        List<Evento> eventos = new ArrayList<>();
        Evento evento = null;
        String mysql_query = "SELECT id, nombre, fecha, horaInicio, horaFinal, lugar, nota "
                + "FROM evento";
        try {
            this.preparedStatement = this.dbConnection.connection.prepareStatement(mysql_query);
            this.resultSet = this.preparedStatement.executeQuery();

            while (resultSet.next()) {
                evento = new Evento(this.resultSet.getInt("id"),
                        this.resultSet.getString("nombre"),
                        this.resultSet.getString("fecha"),
                        this.resultSet.getString("horaInicio"),
                        this.resultSet.getString("horaFinal"),
                        this.resultSet.getString("lugar"),
                        this.resultSet.getString("nota")
                );
                eventos.add(evento);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.dbConnection.disconnect();
        }
        return eventos;
    }

    //Metodo para buscar los eventos segun el dato que se pase
    public List<Evento> buscarEventos(String dato) {
        String[] campos = {"nombre", "fecha", "nota"};
        List<Evento> eventos = null;
        Evento evento = null;
        if (!dato.equals("")) {
            this.dbConnection.connect();
            eventos = new ArrayList<>();
            for (String campo : campos) {
                String mysql_query = "SELECT id, nombre, fecha, horaInicio, horaFinal, lugar, nota "
                        + "FROM evento "
                        + "WHERE " + campo + " LIKE " + "'%" + dato + "%'";
                try {
                    this.preparedStatement = this.dbConnection.connection.prepareStatement(mysql_query);
                    this.resultSet = preparedStatement.executeQuery();
                    boolean mismoRegistro = false;
                    while (resultSet.next()) {
                        evento = new Evento(this.resultSet.getInt("id"),
                                this.resultSet.getString("nombre"),
                                this.resultSet.getString("fecha"),
                                this.resultSet.getString("horaInicio"),
                                this.resultSet.getString("horaFinal"),
                                this.resultSet.getString("lugar"),
                                this.resultSet.getString("nota"));
                        if (eventos.isEmpty()) {
                            eventos.add(evento);
                        } else {
                            for (Evento eventoAgregado : eventos) {
                                if (eventoAgregado.equals(evento)) {
                                    mismoRegistro = true;
                                    break;
                                }
                            }
                            if (!mismoRegistro) {
                                eventos.add(evento);
                            }
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        this.dbConnection.disconnect();
        return eventos;
    }

    //Metodo para verificar que la fecha del evento este correcta
    public boolean verificarFecha(String fecha) {
        String[] fechaSplitted = fecha.split("/", 3);
        boolean resultado = false;
        int contadorCorrector = 0;
        int dia = 0;
        int mes = 0;
        int anio = 0;
        try {
            dia = Integer.parseInt(fechaSplitted[0]);
            mes = Integer.parseInt(fechaSplitted[1]);
            anio = Integer.parseInt(fechaSplitted[2]);
        } catch (Exception e) {
            System.out.println("Error en la fecha: " + e);
        }
        if (mes >= 1 && mes <= 12) {
            contadorCorrector += 1;
            switch (mes) {
                case 1:
                    contadorCorrector = (dia >= 1 && dia <= 31) ? contadorCorrector + 1 : contadorCorrector;
                    break;
                case 2:
                    contadorCorrector = (dia >= 1 && dia <= 28) ? contadorCorrector + 1 : contadorCorrector;
                    break;
                case 3:
                    contadorCorrector = (dia >= 1 && dia <= 31) ? contadorCorrector + 1 : contadorCorrector;
                    break;
                case 4:
                    contadorCorrector = (dia >= 1 && dia <= 30) ? contadorCorrector + 1 : contadorCorrector;
                    break;
                case 5:
                    contadorCorrector = (dia >= 1 && dia <= 31) ? contadorCorrector + 1 : contadorCorrector;
                    break;
                case 6:
                    contadorCorrector = (dia >= 1 && dia <= 30) ? contadorCorrector + 1 : contadorCorrector;
                    break;
                case 7:
                    contadorCorrector = (dia >= 1 && dia <= 31) ? contadorCorrector + 1 : contadorCorrector;
                    break;
                case 8:
                    contadorCorrector = (dia >= 1 && dia <= 31) ? contadorCorrector + 1 : contadorCorrector;
                    break;
                case 9:
                    contadorCorrector = (dia >= 1 && dia <= 30) ? contadorCorrector + 1 : contadorCorrector;
                    break;
                case 10:
                    contadorCorrector = (dia >= 1 && dia <= 31) ? contadorCorrector + 1 : contadorCorrector;
                    break;
                case 11:
                    contadorCorrector = (dia >= 1 && dia <= 30) ? contadorCorrector + 1 : contadorCorrector;
                    break;
                case 12:
                    contadorCorrector = (dia >= 1 && dia <= 31) ? contadorCorrector + 1 : contadorCorrector;
                    break;
                default:
            }
        }
        contadorCorrector = (anio >= 1980) ? contadorCorrector + 1 : contadorCorrector;
        resultado = (contadorCorrector == 3);
        return resultado;
    }
}