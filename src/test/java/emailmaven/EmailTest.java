package emailmaven;

import static org.junit.Assert.*;

import javax.mail.internet.MimeMessage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/dispatcher-servlet.xml"})
public class EmailTest {
	
	@Autowired
	JavaMailSender mail;
	
	@Test
	public void test() {
		//MimeMessage message; (보낸사람 메일주소, 받는사람 메일주소, 제목, 내용)
		MimeMessagePreparator mailinfo = new MimeMessagePreparator() {
			
			public void prepare(MimeMessage mimeMessage) throws Exception {
				MimeMessageHelper message = new MimeMessageHelper(mimeMessage,"UTF-8");
				message.setTo("yuki8875@naver.com");
				message.setSubject("java mail sender test");
				message.setText("java mail sucess");
				message.setFrom("dahae.h95@gmail.com");
			}
		};
		
		mail.send(mailinfo);
	}

}
