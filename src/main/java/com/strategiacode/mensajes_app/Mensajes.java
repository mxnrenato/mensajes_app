package com.strategiacode.mensajes_app;

public class Mensajes {

    private int id_mensajes;
    private String mensaje;
    private String autor_mensajes;
    private String fecha_mensajes;

    public Mensajes(){

    }

    public Mensajes(int id_mensajes, String mensaje, String autor_mensajes, String fecha_mensajes) {
        this.id_mensajes = id_mensajes;
        this.mensaje = mensaje;
        this.autor_mensajes = autor_mensajes;
        this.fecha_mensajes = fecha_mensajes;
    }

    public int getId_mensajes() {
        return id_mensajes;
    }

    public void setId_mensajes(int id_mensajes) {
        this.id_mensajes = id_mensajes;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getAutor_mensajes() {
        return autor_mensajes;
    }

    public void setAutor_mensajes(String autor_mensajes) {
        this.autor_mensajes = autor_mensajes;
    }

    public String getFecha_mensajes() {
        return fecha_mensajes;
    }

    public void setFecha_mensajes(String fecha_mensajes) {
        this.fecha_mensajes = fecha_mensajes;
    }
}
