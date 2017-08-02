package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class AopApplicationTests {
	//邮件发送类
	@Autowired
	private JavaMailSender mailSender;
	@Test
	public void contextLoads() {
		//发送一封简单的邮件
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("939513800@qq.com");
		message.setTo("783737403@qq.com");
		message.setSubject("主题：简单邮件");
		message.setText("java测试发送邮件");
		mailSender.send(message);
		System.out.print("发送成功!");
	}
}
