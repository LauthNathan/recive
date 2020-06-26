package com.cesi.recive.message;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.jms.*;
import java.util.logging.Level;
import java.util.logging.Logger;

@Stateless
public class ProducerSb implements ProducerSbLocal {
    @Resource(mappedName = "jms/myqueue")
    private Queue myqueue;
    @Resource(mappedName = "jms/myqueuepoolfactory")
    private ConnectionFactory myqueuepoolfactory;

    private Message createJMSMessageForjmsMyQueue(Session session, Object messageData) throws JMSException {
        TextMessage tm = session.createTextMessage();
        tm.setText(messageData.toString());
        return tm;
    }

    private void sendJMSMessageToMyqueue(Object messageData) throws JMSException {
        Connection connection = null;
        Session session = null;
        try {
            connection = myqueuepoolfactory.createConnection();
            session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            MessageProducer messageProducer = session.createProducer(myqueue);
            messageProducer.send(createJMSMessageForjmsMyQueue(session, messageData));
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (JMSException e) {
                    Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Cannot close session", e);
                }
            }
            if (connection != null) {
                connection.close();
            }
        }
    }

    public void sendMessageToQueue(String message) throws JMSException {
        sendJMSMessageToMyqueue(message);
    }
}
