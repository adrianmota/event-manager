package com.services;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import com.entities.Event;
import com.data.mysql.Connector;

public class EventoService {

    private final Connector connector;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    public EventoService() {
        connector = new Connector();
    }

    public void agregarEvento(Event evento) {
        Connection connection = this.connector.connect();
        String sql_instruction = "INSERT INTO evento(nombre, fecha, horaInicio, horaFinal, lugar, nota) " +
                                   "VALUES(?, ?, ?, ?, ?, ?)";
        try {
            this.preparedStatement = connection.prepareStatement(sql_instruction);
            this.preparedStatement.setString(1, evento.getName());
            this.preparedStatement.setString(2, evento.getDate());
            this.preparedStatement.setString(3, evento.getStartTime());
            this.preparedStatement.setString(4, evento.getEndTime());
            this.preparedStatement.setString(5, evento.getPlace());
            this.preparedStatement.setString(6, evento.getQuote());
            this.preparedStatement.executeUpdate();
            System.out.println("Evento agregado");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.connector.disconnect();
        }
    }

    public void eliminarEvento(String idEvento) {
        Connection connection = this.connector.connect();
        String sql_instruction = "DELETE FROM evento " +
                                   "WHERE id = " + idEvento;
        try {
            this.preparedStatement = connection.prepareStatement(sql_instruction);
            this.preparedStatement.executeUpdate();
            System.out.println("Evento eliminado");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.connector.disconnect();
        }

    }

    public void modificarEvento(Event evento) {
        Connection connection = this.connector.connect();
        String sql_instruction = "UPDATE evento SET nombre = '" + evento.getName() + "', "
                + "fecha = '" + evento.getDate() + "', "
                + "horaInicio = '" + evento.getStartTime() + "', "
                + "horaFinal = '" + evento.getEndTime() + "', "
                + "lugar = '" + evento.getPlace() + "', "
                + "nota = '" + evento.getQuote() + "' "
                + "WHERE id = " + evento.getId();
        try {
            this.preparedStatement = this.connector.connection.prepareStatement(sql_instruction);
            this.preparedStatement.executeUpdate();
            System.out.println("Evento modificado");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.connector.disconnect();
        }
    }

    public List<Event> obtenerEventos() {
        this.connector.connect();
        List<Event> eventos = new ArrayList<>();
        Event evento = null;
        String sql_query = "SELECT id, nombre, fecha, horaInicio, horaFinal, lugar, nota " +
                           "FROM evento";
        try {
            this.preparedStatement = this.connector.connection.prepareStatement(sql_query);
            this.resultSet = this.preparedStatement.executeQuery();

            while (resultSet.next()) {
                evento = new Event(this.resultSet.getInt("id"),
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
            this.connector.disconnect();
        }
        return eventos;
    }

    public List<Event> buscarEventos(String dato) {
        String[] campos = {"nombre", "fecha", "nota"};
        List<Event> eventos = null;
        Event evento = null;
        if (!dato.equals("")) {
            this.connector.connect();
            eventos = new ArrayList<>();
            for (String campo : campos) {
                String sql_query = "SELECT id, nombre, fecha, horaInicio, horaFinal, lugar, nota "
                        + "FROM evento "
                        + "WHERE " + campo + " LIKE " + "'%" + dato + "%'";
                try {
                    this.preparedStatement = this.connector.connection.prepareStatement(sql_query);
                    this.resultSet = preparedStatement.executeQuery();
                    boolean mismoRegistro = false;
                    while (resultSet.next()) {
                        evento = new Event(this.resultSet.getInt("id"),
                                this.resultSet.getString("nombre"),
                                this.resultSet.getString("fecha"),
                                this.resultSet.getString("horaInicio"),
                                this.resultSet.getString("horaFinal"),
                                this.resultSet.getString("lugar"),
                                this.resultSet.getString("nota"));
                        if (eventos.isEmpty()) {
                            eventos.add(evento);
                        } else {
                            for (Event eventoAgregado : eventos) {
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
        this.connector.disconnect();
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