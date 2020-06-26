package com.cesi.recive.services;

import com.cesi.recive.message.ProducerSbLocal;

import javax.ejb.EJB;
import javax.jms.JMSException;
import javax.jws.WebService;
import java.time.Instant;

@WebService(endpointInterface = "com.cesi.recive.services.IFileWebService")
public class FileWebService implements IFileWebService {

    @EJB
    private ProducerSbLocal producerSb;

    @Override
    public String say(String name) throws JMSException {
        producerSb.sendMessageToQueue(name);
        System.out.println("@ "+ Instant.now()+" retourne Hello "+name);
        return "Hello "+name;
    }
}
