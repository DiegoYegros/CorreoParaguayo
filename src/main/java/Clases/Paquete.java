package Clases;

import Interfaces.Enviable;

public class Paquete implements Enviable {
    private String contenido;
    private String destinatario;
    private int peso;
    @Override
    public void enviar() {
        System.out.println("Paquete enviado");
    }
    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
