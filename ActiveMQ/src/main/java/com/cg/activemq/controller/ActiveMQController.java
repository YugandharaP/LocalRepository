package com.cg.activemq.controller;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/activemq")
public class ActiveMQController {
	
	@Autowired
	private JmsTemplate jmsTemplate;

	@Autowired
	private Queue queue;

	@GetMapping("/{message}")
	public String publish(@PathVariable("message") String message) {
		jmsTemplate.convertAndSend(queue, message);
		return "Published Successfully ! : " + message;
	}

	@JmsListener(destination = "standalone.queue")
	public void receive(String message) {
		System.out.println(message);
	}
}