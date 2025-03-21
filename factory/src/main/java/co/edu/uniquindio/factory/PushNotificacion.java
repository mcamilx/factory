package co.edu.uniquindio.factory;

public class PushNotificacion implements Notificacion {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando Notificación Push: " + mensaje);
    }
}
