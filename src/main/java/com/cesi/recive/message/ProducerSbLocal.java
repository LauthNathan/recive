package com.cesi.recive.message;

import com.cesi.recive.Msg;

import javax.ejb.Local;
import javax.jms.JMSException;

@Local
public interface ProducerSbLocal {
    public void sendMessageToQueue(Msg message) throws JMSException;
}
