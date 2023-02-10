package Clases;

public class MensajeTexto extends Mensaje{
    private int cantMaxCaracteres;
    public void avisarCantMaxSuperada(){
        System.out.println("Cantidad máxima de caracteres superada");
    }
    public void enviar(){
        System.out.println("Mensaje de texto enviado");
    }
    public int getCantMaxCaracteres() {
        return cantMaxCaracteres;
    }

    public void setCantMaxCaracteres(int cantMaxCaracteres) {
        this.cantMaxCaracteres = cantMaxCaracteres;
    }
}
