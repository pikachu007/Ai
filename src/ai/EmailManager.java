/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai;

import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 *
 * @author Thunder
 */
public class EmailManager {

    private final String usuario = "thunder007.25@gmail.com";
    private final String contraseña = "vlndcmopthookcjq";
    private final String archivo = "prueba.txt";
    private final String destino = "thunder007.25@gmail.com";
    private final String asunto = "Envio de resultados";
    private final String mensaje = "Hola de prueba";

    public boolean enviarCorreo() {
        try {
            Properties p = new Properties();
            p.put("mail.smtp.host", "smtp.gmail.com");
            p.setProperty("mail.smtp.starttls.enable", "true");
            p.setProperty("mail.smtp.port", "587");
            p.setProperty("mail.smtp.user", this.usuario);
            p.setProperty("mail.smtp.auth", "true");

            Session s = Session.getDefaultInstance(p);

            BodyPart texto = new MimeBodyPart();
            texto.setText(this.mensaje);

            BodyPart adjunto = new MimeBodyPart();
            adjunto.setDataHandler(new DataHandler(new FileDataSource(this.archivo)));
            adjunto.setFileName(this.archivo);

            MimeMultipart m = new MimeMultipart();
            m.addBodyPart(adjunto);
            m.addBodyPart(texto);

            MimeMessage msg = new MimeMessage(s);
            msg.setFrom(new InternetAddress(this.usuario));
            msg.addRecipient(Message.RecipientType.TO, new InternetAddress(this.destino));
            msg.setSubject(this.asunto);
            msg.setContent(m);

            Transport t = s.getTransport("smtp");
            t.connect(this.usuario, this.contraseña);
            t.sendMessage(msg, msg.getAllRecipients());
            t.close();
            return true;

        } catch (MessagingException e) {
            System.out.println("Error " + e);
            return false;
        }

    }

}
