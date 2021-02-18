package sendReportMailSelenium;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Properties;

public class SendMailSSLWithAttachment {
    public static void main(String[] args) {
        sendMail(new Exception("LoginTest"));
    }

    public static void sendMail(Exception exception) {
        String to = "nonimarine@mailinator.com";
        String from = "nonimarine27@mailinator.com";
        String host = "smtp.mailinator.com";
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);
        Session session;
        session = Session.getDefaultInstance(properties);
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress (from));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("Trade-processor instance shutdown!");
            message.setText(getExceptionMessage(exception));
            Transport.send(message);
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }

    private static String getExceptionMessage(Exception e) {
        StringWriter sw = new StringWriter();
        e.printStackTrace(new PrintWriter(sw));
        return sw.toString();
    }
}
