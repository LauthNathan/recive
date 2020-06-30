package com.cesi.recive.services;

import com.cesi.recive.Msg;
import com.cesi.recive.message.ProducerSbLocal;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jms.JMSException;
import javax.jws.WebService;

@Stateless
@WebService(endpointInterface = "com.cesi.recive.services.IFileWebService")
public class FileWebService implements IFileWebService {

    @EJB
    private ProducerSbLocal producerSb;

    @Override
    public void fileCheck(Msg msg) throws JMSException {
        producerSb.sendMessageToQueue(msg);
    }
}
