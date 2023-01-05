package co.in.an.eye.tech.jms.activemq.receiver.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class JmsReceiverService {
    @JmsListener(destination = "${jms.queue.name}")
    public void receiveMessage(String message){
        System.out.println("Now : "+ LocalDateTime.now() +" : Message received : "+message);
    }
}
