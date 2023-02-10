package Clases;

import Interfaces.Enviable;
import Interfaces.Hojeable;

public class CorreoParaguayo implements Enviable {

    public void enviarCosas(Enviable enviable){
        enviable.enviar();
    }
    public void hojearCosas(Hojeable hojeable){
        hojeable.hojear();
    }
    public void leerCosas(){
        System.out.println("Correo leido");
    }
    @Override
    public void enviar() {
        System.out.println("Correo enviado");
    }
}
