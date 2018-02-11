package testNGclass;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.testng.annotations.Test;

public class SendMailSSLWithAttachment {
     @Test
	public  void mains() throws EmailException {
		
		System.out.println("=========test started=============");
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("alammohammed79@gmail.com", "SAYEDawan2008"));
		email.setSSLOnConnect(true);
		email.setFrom("mohammedalamnyc@gmail.com");
		email.setSubject("selenium test report");
		email.setMsg("this is a test mail from selenium");
		email.addTo("foo@bar.com");
		email.send();
		System.out.println("=========send email=============");
	}
	
	
	}
 
