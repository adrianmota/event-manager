package com.services;

import java.util.*;
import com.data.*;
import com.entities.Event;
import com.forms.*;

public class EventService {

    EventData data = new EventData();

    public void validateAndCreateEvent(CreateEventWindow object, String name, String date, String startTime, String endTime, String place, String quote) {
        if (!name.equals("") && !date.equals("") && !startTime.equals("") && !endTime.equals("") && !place.equals("") && !quote.equals("")) {
            boolean fechaEsCorrecta = this.validateDate(date);
            if (fechaEsCorrecta) {
                Event evento = object.getDataFromForm();
                data.addEvent(evento);
                object.cleanFields();
                object.getJlblMessageToUser().setText("Se ha registrado el evento exitosamente");
            } else {
                object.getJlblMessageToUser().setText("Introduciste la fecha de manera incorrecta");
            }
        } else {
            object.getJlblMessageToUser().setText("Debes rellenar los campos requeridos");
        }
    }

    public void validateAndEditEvent(EditEventWindow object, String name, String date, String startTime, String endTime, String place, String quote) {
        if (!name.equals("") && !date.equals("") && !startTime.equals("") && !endTime.equals("") && !place.equals("") && !quote.equals("")) {
            boolean dateIsCorrect = this.validateDate(date);
            if (dateIsCorrect) {
                Event evento = object.getDataFromForm();
                data.editEvent(evento);
                object.cleanFields();
                object.setVisible(false);
            } else {
                object.getJlblMensajeAlUsuario().setText("Introduciste la fecha de manera incorrecta");
            }
        } else {
            object.getJlblMensajeAlUsuario().setText("Debes rellenar los campos requeridos");
        }
    }
    
    public void deleteEvent(String idEvent) {
        data.deleteEvent(idEvent);
    }
    
    public List<Event> listEvents() {
        List<Event> events = data.listEvents();
        return events;
    }

    public List<Event> searchEvents(String data) {
        List<Event> events = this.data.searchEvents(data);
        return events;
    }

    // The variable counterValidationDate allows to know if the date is correct
    /*
        If the month is correct, it increments in 1 unit, also to the day and year, and therefore
        if finally counterValidationDate is equals to 3, then the date is correct
     */
    public boolean validateDate(String fecha) {
        String[] dateSplitted = fecha.split("/", 3);
        int counterValidationDate = 0;
        int day = 0;
        int month = 0;
        int year = 0;

        try {
            day = Integer.parseInt(dateSplitted[0]);
            month = Integer.parseInt(dateSplitted[1]);
            year = Integer.parseInt(dateSplitted[2]);
        } catch (Exception e) {
            System.out.println("Error in the date: " + e);
        }

        if (month >= 1 && month <= 12) {
            counterValidationDate += 1;
            switch (month) {
                case 1:
                    counterValidationDate = (day >= 1 && day <= 31) ? counterValidationDate + 1 : counterValidationDate;
                    break;
                case 2:
                    counterValidationDate = (day >= 1 && day <= 28) ? counterValidationDate + 1 : counterValidationDate;
                    break;
                case 3:
                    counterValidationDate = (day >= 1 && day <= 31) ? counterValidationDate + 1 : counterValidationDate;
                    break;
                case 4:
                    counterValidationDate = (day >= 1 && day <= 30) ? counterValidationDate + 1 : counterValidationDate;
                    break;
                case 5:
                    counterValidationDate = (day >= 1 && day <= 31) ? counterValidationDate + 1 : counterValidationDate;
                    break;
                case 6:
                    counterValidationDate = (day >= 1 && day <= 30) ? counterValidationDate + 1 : counterValidationDate;
                    break;
                case 7:
                    counterValidationDate = (day >= 1 && day <= 31) ? counterValidationDate + 1 : counterValidationDate;
                    break;
                case 8:
                    counterValidationDate = (day >= 1 && day <= 31) ? counterValidationDate + 1 : counterValidationDate;
                    break;
                case 9:
                    counterValidationDate = (day >= 1 && day <= 30) ? counterValidationDate + 1 : counterValidationDate;
                    break;
                case 10:
                    counterValidationDate = (day >= 1 && day <= 31) ? counterValidationDate + 1 : counterValidationDate;
                    break;
                case 11:
                    counterValidationDate = (day >= 1 && day <= 30) ? counterValidationDate + 1 : counterValidationDate;
                    break;
                case 12:
                    counterValidationDate = (day >= 1 && day <= 31) ? counterValidationDate + 1 : counterValidationDate;
                    break;
                default:
            }
        }

        counterValidationDate = (year >= 1980) ? counterValidationDate + 1 : counterValidationDate;
        return (counterValidationDate == 3);
    }
}
