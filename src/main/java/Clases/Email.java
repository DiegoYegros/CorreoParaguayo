package Clases;

public class Email extends Mensaje{
    private String asunto;
    public void enviar(){
        System.out.println("Email enviado");
    }
    public void adjuntar(){
        System.out.println("Adjuntando archivo");
    }
    public String getAsunto(){
        return asunto;
    }
    public void setAsunto(String asunto){
        this.asunto = asunto;
    }
}
