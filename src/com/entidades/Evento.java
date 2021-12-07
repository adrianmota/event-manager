package com.entidades;

public class Evento {

    private int id;
    private String nombre;
    private String fecha;
    private String horaInicio;
    private String horaFinal;
    private String lugar;
    private String nota;

    public Evento() {

    }

    public Evento(String nombre, String fecha, String horaInicio, String horaFinal, String lugar, String nota) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
        this.lugar = lugar;
        this.nota = nota;
    }
    
    public Evento(int id, String nombre, String fecha, String horaInicio, String horaFinal, String lugar, String nota) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
        this.lugar = lugar;
        this.nota = nota;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHoraInicio() {
        return this.horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFinal() {
        return this.horaFinal;
    }

    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }

    public String getLugar() {
        return this.lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getNota() {
        return this.nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
    
    @Override
    public boolean equals(Object object) {   
        if(object instanceof Evento) {
            Evento evento = (Evento)object;
            return (this.id == evento.id);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Evento{id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", fecha=").append(fecha);
        sb.append(", horaInicio=").append(horaInicio);
        sb.append(", horaFinal=").append(horaFinal);
        sb.append(", lugar=").append(lugar);
        sb.append(", nota=").append(nota);
        sb.append('}');
        return sb.toString();
    }

}
