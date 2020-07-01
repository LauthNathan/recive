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

    /**
     * The endpoint used to expose the webservice to check the secret information into a file.
     *
     * @param msg - The message from the client.
     * @throws JMSException The JMSException to be thrown if something is not good.
     */
    @Override
    public void fileCheck(Msg msg) throws JMSException {
        producerSb.sendMessageToQueue(msg);
    }
}
