package co.edu.uniquindio.factory;

public class NotificacionFactory {

    public static Notificacion crearNotificacion(String tipo) {
        if (tipo.equalsIgnoreCase("email")) {
            return new EmailNotificacion();
        } else if (tipo.equalsIgnoreCase("sms")) {
            return new SmsNotificacion();
        } else if (tipo.equalsIgnoreCase("push")) {
            return new PushNotificacion();
        } else {
            throw new IllegalArgumentException("Tipo de notificación no soportado");
        }
    }
}
