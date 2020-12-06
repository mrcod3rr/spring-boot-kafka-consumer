package com.learning.kafka.consumers;

import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import com.learning.kafka.models.Email;

/**
 * 
 * @author sonu
 *
 */
@Service
@KafkaListener(topics = { "testTopic" }, groupId = "group-id", id = "multi")
public class EmailConsumer {

	@KafkaHandler(isDefault = true)
	public void consumeEmail(Email emailMessage) {
		System.out.println(emailMessage);
	}

	@KafkaHandler()
	public void consumeString(String message) {
		System.out.println(message);
	}

	/*
	 * @KafkaHandler(isDefault = true) public void consumeEmail(@Payload Email
	 * emailMessage, @Headers MessageHeaders headers) { headers.keySet().forEach(key
	 * -> { System.out.println("Header key : " + key + " value : " +
	 * headers.get(key)); }); System.out.println(emailMessage); }
	 */
//	{"subject":"Test Email","message":"Hi, this is test email", "fromEmail":"notification@gamil.com","from":"Sonu","to":["sonu@gamil.com"]}
//	{"subject":"Test Email","message":"Hi, this is test email", "fromEmail":"notification@gamil.com","from":"Sonu","to":"sonu@gmail.com"}

}