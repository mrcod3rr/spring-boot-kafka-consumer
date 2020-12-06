package com.learning.kafka.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

//@Configuration
public class KafkaConsumerFactory {
	/*
	 * @Bean public ConsumerFactory<String, String> consumerFactory() { Map<String,
	 * Object> config = new HashMap<>();
	 * config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9091");
	 * config.put(ConsumerConfig.GROUP_ID_CONFIG, "group-id");
	 * config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,
	 * StringDeserializer.class);
	 * config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, JsonDeserialize.class);
	 * return new DefaultKafkaConsumerFactory<String, String>(config); }
	 * 
	 * @Bean public ConcurrentKafkaListenerContainerFactory<String, String>
	 * concurrentKafkaListenerContainerFactory() {
	 * ConcurrentKafkaListenerContainerFactory<String, String> factory = new
	 * ConcurrentKafkaListenerContainerFactory<>();
	 * 
	 * factory.setConsumerFactory(consumerFactory()); return factory; }
	 */
	/*
	 * @Bean public ConsumerFactory<String, Email> emailConsumerFactory() {
	 * Map<String, Object> config = new HashMap<>();
	 * config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9091");
	 * config.put(ConsumerConfig.GROUP_ID_CONFIG, "group-id-json");
	 * config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,
	 * StringDeserializer.class);
	 * config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,
	 * JsonDeserializer.class); return new DefaultKafkaConsumerFactory<>(config, new
	 * StringDeserializer(), new JsonDeserializer<>(Email.class)); }
	 * 
	 * @Bean public ConcurrentKafkaListenerContainerFactory<String, Email>
	 * concurrentKafkaListenerContainerFactory() {
	 * ConcurrentKafkaListenerContainerFactory<String, Email> factory = new
	 * ConcurrentKafkaListenerContainerFactory<>();
	 * 
	 * factory.setConsumerFactory(emailConsumerFactory()); return factory; }
	 */
//	@Value("${spring.kafka.bootstrap-servers}")
//	private String bootstrapServers;

//	@Bean
//	public Map<String, Object> consumerConfigs() {
//
//		Map<String, Object> props = new HashMap<>();
//		props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
//		props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
//		props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
//		props.put(ConsumerConfig.GROUP_ID_CONFIG, "group-id");
//		props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
//		props.put(JsonDeserializer.TRUSTED_PACKAGES, "com.learning.kafka.models");
//		props.put(JsonDeserializer.USE_TYPE_INFO_HEADERS, "false");
//		return props;
//	}
//
//	@Bean
//	public ConsumerFactory<String, Email> consumerFactory() {
//		return new DefaultKafkaConsumerFactory<>(consumerConfigs(), new StringDeserializer(),
//				new JsonDeserializer<>(Email.class));
//	}
//
//	@Bean
//	public KafkaListenerContainerFactory<ConcurrentMessageListenerContainer<String, Email>> kafkaListenerContainerFactory() {
//		ConcurrentKafkaListenerContainerFactory<String, Email> factory = new ConcurrentKafkaListenerContainerFactory<>();
//		factory.setConsumerFactory(consumerFactory());
//		factory.getContainerProperties().setAckMode(AckMode.MANUAL_IMMEDIATE);
//		return factory;
//	}
//
//	@Bean
//	public ConsumerFactory<String, Object> consumerFactory() {
//		return new DefaultKafkaConsumerFactory<>(consumerConfigs(), new StringDeserializer(), new JsonDeserializer<>());
//	}
//
//	@Bean
//	public ConcurrentKafkaListenerContainerFactory<String, Object> kafkaListenerContainerFactory() {
//		ConcurrentKafkaListenerContainerFactory<String, Object> factory = new ConcurrentKafkaListenerContainerFactory<>();
//		factory.setConsumerFactory(consumerFactory());
//		return factory;
//	}
}