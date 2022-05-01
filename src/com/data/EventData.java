package com.data;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import com.data.mysql.Connector;
import com.entities.Event;

public class EventData {

    private final Connector connector;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    public EventData() {
        connector = new Connector();
    }

    public void addEvent(Event evento) {
        Connection connection = this.connector.connect();
        String sql_instruction = "INSERT INTO event(name, date, startTime, endTime, place, quote) " +
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
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.connector.disconnect();
        }
    }

    public void deleteEvent(String idEvent) {
        Connection connection = this.connector.connect();
        String sql_instruction = "DELETE FROM event " +
                                 "WHERE id = ?";
        try {
            this.preparedStatement = connection.prepareStatement(sql_instruction);
            this.preparedStatement.setInt(1, Integer.parseInt(idEvent));
            this.preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.connector.disconnect();
        }
    }

    public void editEvent(Event event) {
        Connection connection = this.connector.connect();
        String sql_instruction = "UPDATE event SET name = ?, " +
                                 "date = ?, " + 
                                 "startTime = ?, " + 
                                 "endTime = ?, " + 
                                 "place = ?, " + 
                                 "quote = ? " + 
                                 "WHERE id = ?";
        try {
            this.preparedStatement = connection.prepareStatement(sql_instruction);
            this.preparedStatement.setString(1, event.getName());
            this.preparedStatement.setString(2, event.getDate());
            this.preparedStatement.setString(3, event.getStartTime());
            this.preparedStatement.setString(4, event.getEndTime());
            this.preparedStatement.setString(5, event.getPlace());
            this.preparedStatement.setString(6, event.getQuote());
            this.preparedStatement.setInt(7, event.getId());
            this.preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.connector.disconnect();
        }
    }

    public List<Event> listEvents() {
        Connection connection = this.connector.connect();
        List<Event> events = new ArrayList<>();
        Event event;
        String sql_query = "SELECT id, name, date, startTime, endTime, place, quote " +
                           "FROM event";
        try {
            this.preparedStatement = connection.prepareStatement(sql_query);
            this.resultSet = this.preparedStatement.executeQuery();

            while (resultSet.next()) {
                event = new Event(this.resultSet.getInt("id"),
                        this.resultSet.getString("name"),
                        this.resultSet.getString("date"),
                        this.resultSet.getString("startTime"),
                        this.resultSet.getString("endTime"),
                        this.resultSet.getString("place"),
                        this.resultSet.getString("quote")
                        );
                events.add(event);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.connector.disconnect();
        }
        return events;
    }

    public List<Event> searchEvents(String data) {
        String[] fields = {"name", "date", "quote"};
        List<Event> events = null;
        Event event;

        if (!data.equals("")) {
            Connection connection = this.connector.connect();
            events = new ArrayList<>();
            for (String field : fields) {
                String sql_query = "SELECT id, name, date, startTime, endTime, place, quote " +
                                   "FROM event " +
                                   "WHERE " + field + " LIKE " + "'%" + data + "%'";
                try {
                    this.preparedStatement = connection.prepareStatement(sql_query);
                    this.resultSet = preparedStatement.executeQuery();
                    boolean sameRecord = false;
                    while (resultSet.next()) {
                        event = new Event(this.resultSet.getInt("id"),
                                this.resultSet.getString("name"),
                                this.resultSet.getString("date"),
                                this.resultSet.getString("startTime"),
                                this.resultSet.getString("endTime"),
                                this.resultSet.getString("place"),
                                this.resultSet.getString("quote"));
                        
                        if (!events.isEmpty()) {
                            for (Event addedEvent : events) {
                                if (addedEvent.equals(event)) {
                                    sameRecord = true;
                                    break;
                                }
                            }
                            if (!sameRecord) {
                                events.add(event);
                            }
                        } else {
                            events.add(event);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        this.connector.disconnect();
        return events;
    }

}
