package com.cesi.recive.message;

import javax.ejb.Local;
import javax.jms.JMSException;

@Local
public interface ProducerSbLocal {
    public void sendMessageToQueue(String message) throws JMSException;
}
