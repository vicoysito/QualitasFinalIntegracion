package paquete;
import java.util.List;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class CorreoService{

	public static void enviarCorreoCamapania(List<String> listaDestinatarios, String remitente,
											String asunto, String cuerpo){
			
			   final String host = "smtp.gmail.com";
					   
					   final String username = "planetmediademo@gmail.com";
					   final String password = "omniplanet";
			
				  Properties properties = System.getProperties();
			
				  properties.setProperty("mail.smtp.host", host);
						  properties.setProperty("mail.smtp.port", "587");
						  properties.setProperty("mail.smtp.auth", "true");
						  properties.setProperty("mail.smtp.starttls.enable", "true");
						  
			
				  Session session = Session.getDefaultInstance(properties,new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(username, password);
				}
			  });
			
				  try{
					 MimeMessage message = new MimeMessage(session);
			
					 message.setFrom(new InternetAddress(remitente));
							 
					 for(String direccion: listaDestinatarios){
								 
					 message.addRecipient(Message.RecipientType.TO,
											  new InternetAddress(direccion));
					 }
					 message.setSubject(asunto);
			
					  
							 message.setContent(cuerpo, "text/html; charset=ISO-8859-1"); // Mensaje de texto html con negritas y cursiva
							  // Mensaje de texto plano

			
					 Transport.send(message);
					 System.out.println("Se envió el mensaje");
				  }catch (Exception mex) {
					 mex.printStackTrace();
				  }
			   }	
}