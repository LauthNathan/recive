package com.cesi.recive.message;

import com.cesi.recive.Msg;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.jms.*;
import java.util.logging.Level;
import java.util.logging.Logger;

@Stateless
public class ProducerSb implements ProducerSbLocal {
    @Resource(mappedName = "jms/fileQueue")
    private Queue fileQueue;
    @Resource(mappedName = "jms/fileQueuePoolFactory")
    private ConnectionFactory fileQueuePoolFactory;

    private Message createJMSMessageForJmsFileQueue(Session session, Msg messageData) throws JMSException {
        TextMessage tm = session.createTextMessage();
        tm.setText(messageData.getData().get(1).toString());
        tm.setStringProperty("path", messageData.getData().get(0).toString());
        tm.setStringProperty("key", messageData.getData().get(2).toString());
        tm.setStringProperty("appVersion", messageData.getAppVersion());
        tm.setStringProperty("operationVersion", messageData.getOperationVersion());
        tm.setStringProperty("tokenApp", messageData.getTokenApp());
        tm.setStringProperty("tokenUser", messageData.getTokenUser());
        return tm;
    }

    private void sendJmsMessageToFileQueue(Msg messageData) throws JMSException {
        Connection connection = null;
        Session session = null;
        try {
            connection = fileQueuePoolFactory.createConnection();
            session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            MessageProducer messageProducer = session.createProducer(fileQueue);
            messageProducer.send(createJMSMessageForJmsFileQueue(session, messageData));
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

    public void sendMessageToQueue(Msg message) throws JMSException {
        sendJmsMessageToFileQueue(message);
    }
}
