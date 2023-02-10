package Clases;

import Interfaces.Enviable;
import Interfaces.Legible;

import java.util.Date;

public class Mensaje implements Enviable, Legible {
    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
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

    private String cuerpo;
    private String destinatario;
    private Date fecha;
    @Override
    public void enviar() {
        System.out.println("Clases.Mensaje enviado");
    }

    @Override
    public void leer() {
        System.out.println("Clases.Mensaje leido");
    }
}
