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

    /**
     * Create a TextMessage Message to put in the queue.
     *
     * @param session - The session created to access the JMS queue.
     * @param messageData - The message to put in the TextMessage.
     * @return The newly created TextMessage.
     * @throws JMSException The JMSException thrown if something goes wrong.
     */
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

    /**
     * Send a Message to the jms/fileQueue.
     *
     * @param messageData - The Message to put in the TextMessage.
     * @throws JMSException The JMSException thrown if something goes wrong.
     */
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

    /**
     * Method used to call the methods above.
     *
     * @param message - The message to send to the queue.
     * @throws JMSException The JMSException thrown if something goes wrong.
     */
    public void sendMessageToQueue(Msg message) throws JMSException {
        sendJmsMessageToFileQueue(message);
    }
}
