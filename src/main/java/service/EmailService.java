package service;

import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
	@Autowired
	JavaMailSender mail;
	
	public void sendemail(final String email, final String subject, final String content) {
		final MimeMessagePreparator mailinfo = new MimeMessagePreparator() {
			
			public void prepare(MimeMessage mimeMessage) throws Exception {
				final MimeMessageHelper message = new MimeMessageHelper(mimeMessage,"UTF-8");
				message.setTo(email);
				message.setSubject(subject);
				message.setText(content);
				message.setFrom(new InternetAddress("dahae.h95@gmail.com"));
			}
	
		};
		mail.send(mailinfo);
	}
}
