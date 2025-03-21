package co.edu.uniquindio.factory;

public class Main {

    public static void main(String[] args) {
        Notificacion notificacion1 = NotificacionFactory.crearNotificacion("email");
        notificacion1.enviarMensaje("Hola, esto es un email!"); // "Enviando Email: Hola, esto es un email!"

        Notificacion notificacion2 = NotificacionFactory.crearNotificacion("sms");
        notificacion2.enviarMensaje("Hola, esto es un SMS!"); // "Enviando SMS: Hola, esto es un SMS!"

        Notificacion notificacion3 = NotificacionFactory.crearNotificacion("push");
        notificacion3.enviarMensaje("Hola, esto es una notificación push!"); // "Enviando Notificación Push: Hola, esto es una notificación push!"
    }
}
