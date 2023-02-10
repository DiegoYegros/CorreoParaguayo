package org.example;

import Clases.CorreoParaguayo;
import Clases.Email;
import Clases.Periodico;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        CorreoParaguayo correo = new CorreoParaguayo();
        Email email = new Email();
        email.setFecha(new Date());
        email.setAsunto("Prueba");
        email.setDestinatario("Antonino");
        email.setCuerpo("Esta es una prueba en Java");
        correo.enviarCosas(email);
    }
}