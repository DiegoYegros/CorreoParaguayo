package Clases;

import Interfaces.Enviable;
import Interfaces.Hojeable;
import Interfaces.Legible;

import java.util.Date;

public class Periodico implements Hojeable, Legible, Enviable {

    private String destinatario;

    private Date fecha;
    private String nombre;

    @Override
    public void enviar() {
        System.out.println("Periodico enviado");
    }

    @Override
    public void hojear() {
        System.out.println("Periodico hojeado");
    }

    @Override
    public void leer() {
        System.out.println("Periodico leido");
    }
    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
