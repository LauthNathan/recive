package com.cesi.recive.consumer;

import com.cesi.recive.services.AnswerServiceLocal;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.EJB;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

@MessageDriven(mappedName = "jms/responseQueue", activationConfig = {
        @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "jms/responseQueue"),
        @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class ConsumerMdb implements MessageListener {

    @EJB
    private AnswerServiceLocal answerService;

    /**
     * Method called when there is some message in the JMS queue.
     *
     * @param message - The message of the JMQ queue.
     */
    @Override
    public void onMessage(Message message) {
        TextMessage textMessage = (TextMessage) message;
        try {
            System.out.println("information secrete :  " + textMessage.getText());
            answerService.sendResponse(textMessage.getText(),
                    textMessage.getStringProperty("path"),
                    textMessage.getStringProperty("key"),
                    textMessage.getStringProperty("confidence"),
                    textMessage.getStringProperty("appVersion"),
                    textMessage.getStringProperty("operationVersion"),
                    textMessage.getStringProperty("tokenApp"),
                    textMessage.getStringProperty("tokenUser")
                    );
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
